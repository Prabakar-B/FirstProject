package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Wiki {

WebDriver driver;
	
	
	@Test
	public void OpenGoogle() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabu\\eclipse-workspace\\Selenium\\driver2\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Wiki");
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void testA(){
		String actualTitle = driver.getTitle();
		String expectedTitle  = "Wiki - Wikipedia";
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("IMDB title is expected -- assert passed");
		
	}
	@Test
	public void testB() {
		WebElement wikiLogo = driver.findElement(By.xpath("//*[@id='p-logo']"));
		boolean logo = wikiLogo.isDisplayed();
		Assert.assertTrue(logo);
	}
	@Test
	@Parameters({"search"})
	public void testC(String Content) {
		WebElement search = driver.findElement(By.xpath("//*[@id='searchInput']"));
		search.sendKeys(Content+Keys.ENTER);
		WebElement element = driver.findElement(By.xpath("//*[@id='mw-content-text']/div[3]/ul[1]/li[1]/div[1]/a"));
		element.click();
		
		WebElement dev = driver.findElement(By.xpath("//table/tbody/tr[2]/td/a"));
		String name = dev.getAttribute("title");
		System.out.println(name);
		Assert.assertEquals(name,"Linus Torvalds");
	}
	@Test
	public void testD() {
		WebElement notLogged = driver.findElement(By.xpath("//*[@id='pt-anonuserpage']"));
		boolean value = notLogged.isDisplayed();
		Assert.assertTrue(value, "yes it is displayed");
}
}