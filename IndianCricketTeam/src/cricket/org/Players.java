package cricket.org;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Players {

	public void cricketTeam() {
		String name;
		String country;
		String role;
		String price_in_crores;
			
		List<String> arraylist = new ArrayList<String>();
	  
		
		Map<String,String> player1 = new HashMap<String, String>();
	
		player1.put("name","Faf Du Plessis");
		player1.put("country", "South Africa");
		player1.put("role", "Batsman");
		player1.put("price_in_crores", "7");
		String pla1=player1.toString();
		 
		Map<String,String> player2 = new HashMap<String, String>();
		 player2.put("name", "Virat Kohli");
		 player2.put("country", "India");
		 player2.put("role", "Batsman");
		 player2.put("price_in_crores","15");
		 String pla2=player2.toString();
		 
		Map<String,String> player3 = new HashMap<String, String>();
		player3.put("name", "Glenn Maxwell");
		player3.put("country", "Australia");
		player3.put("role", "Batsman");
		player3.put("price_in_crores","11");
		String pla3=player3.toString();
		
		Map<String,String> player4 = new HashMap<String, String>();
		player4.put("name", "Mohammad Siraj");
		player4.put("country", "India");
		player4.put("role", "Bowler");
		player4.put("price_in_crores","7");
		String pla4 = player4.toString();
		
		Map<String,String> player5 = new HashMap<String, String>();
		player5.put("name", "Harshal Patel");
		player5.put("country", "India");
		player5.put("role", "Bowler");
		player5.put("price_in_crores","10.75");
		String pla5 = player5.toString();
		
		Map<String,String> player6 = new HashMap<String, String>();
		player6.put("name", "Wanindu Hasaranga");
		player6.put("country", "Srilanka");
		player6.put("role", "Bowler");
		player6.put("price_in_crores","10.75");
		String pla6 = player6.toString();
		
		Map<String,String> player7 = new HashMap<String, String>();
		player7.put("name", "Dinesh Karthik");
		player7.put("country", "India");
		player7.put("role", "Wicket-keeper");
		player7.put("price_in_crores","5.5");
		String pla7 = player7.toString();
		
		Map<String,String> player8 = new HashMap<String, String>();
		player8.put("name", "Shahbaz Ahmed");
		player8.put("country", "India");
		player8.put("role", "All-Rounder");
		player8.put("price_in_crores","2.4");
		String pla8 = player8.toString();
		
		Map<String,String> player9 = new HashMap<String, String>();
		player9.put("name", "Rajat Patidar");
		player9.put("country", "India");
		player9.put("role", "Batsman");
		player9.put("price_in_crores","0.20");
		String pla9 = player9.toString();
		
		Map<String,String> player10 = new HashMap<String, String>();
		player10.put("name", "Josh Hazlewood");
		player10.put("country", "Australia");
		player10.put("role", "Bowler");
		player10.put("price_in_crores","7.75");
		String pla10 = player10.toString();
		
		Map<String,String> player11 = new HashMap<String, String>();
		player11.put("name", "Mahipal Lomror");
		player11.put("country", "India");
		player11.put("role", "Bowler");
		player11.put("price_in_crores","7.75");
		String pla11=player11.toString();
		//System.out.println(player11);
		
		arraylist.add(pla11);
		arraylist.add(pla10);
		arraylist.add(pla9);
		arraylist.add(pla8);
		arraylist.add(pla7);
		arraylist.add(pla6);
		arraylist.add(pla5);
		arraylist.add(pla4);
		arraylist.add(pla3);
		arraylist.add(pla2);
		arraylist.add(pla1);
		//System.out.println(arraylist);
		
	for(int i=0; i<arraylist.size(); i++) {
		System.out.println(arraylist.get(i));
		int count=0;
		if(arraylist.get(i).contains("India")) {
			System.out.println("they are india players");	
		}
	
		else {
			System.out.println("they are foreign players");
			count++;
			System.out.println("The number of foreign players are: "+count);
		}
		}
	for(int i=0; i<arraylist.size(); i++) {
		if(arraylist.get(i).contains("Wicket-keeper")) {
			System.out.println("The wicket keeper is: "+player7);
		}
	}
	}		
	public static void main(String[] args) {
		Players cT = new Players();
		cT.cricketTeam();
	}
}
