package testNG;

import static org.testng.Assert.assertEquals;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import javax.sound.midi.Synthesizer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import net.bytebuddy.asm.Advice.Enter;

public class IMDB {
	WebDriver driver;
	
	@Test
	public void OpenGoogle1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabu\\eclipse-workspace\\Selenium\\driver2\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.imdb.com/");
	}
	@Test
	public void test0() {	
		String actualTitle = driver.getTitle();
		driver.manage().window().maximize();
		String expectedTitle  = "IMDb: Ratings, Reviews, and Where to Watch the Best Movies & TV Shows";
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("IMDB title is expected -- assert passed");
	}
	
	@Test
	public void test1() {
		WebElement IMDBlogo = driver.findElement(By.xpath("//*[@id='home_img_holder']"));
		Assert.assertEquals(true,IMDBlogo.isDisplayed());
		System.out.println("IMDB logo id displayed -- assert passed");
	}
	@Test
	public void test2() {
		WebElement element = driver.findElement(By.xpath("//*[@id='nav-search-form']/div[1]"));
		element.click();
		WebElement Title = driver.findElement(By.xpath("//*[@id='navbar-search-category-select']/following::div/span/ul/li[2]"));
		Title.click();
		WebElement TvEpisode = driver.findElement(By.xpath("//*[@id='navbar-search-category-select']/following::div/span/ul/li[3]"));
		Assert.assertEquals(false, TvEpisode.isSelected());
	}
	@Test
	public void test3() {
		WebElement language = driver.findElement(By.xpath("//*[@id='imdbHeader']/div[2]/label[3]/following::label"));
		language.click();
		WebElement cannada = driver.findElement(By.xpath("//*[@id='imdbHeader']/div[2]/div[6]/div/div/span/ul[2]/li[2]"));
		cannada.click();
		boolean canadaLang=cannada.isSelected();
		Assert.assertTrue(canadaLang);
		WebElement france = driver.findElement(By.xpath("//*[@id='imdbHeader']/div[2]/div[6]/div/div/span/ul[2]/li[3]"));
		Assert.assertNotEquals(true, france.isSelected());
	
	}
	
	}

