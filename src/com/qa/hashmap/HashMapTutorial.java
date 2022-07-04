package com.qa.hashmap;

//Import the HashMap class
import java.util.HashMap;

public class HashMapTutorial {
	
	public static void main(String[] args) {

		HashMap<String, String> capitalCities = new HashMap<String, String>();
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		System.out.println(capitalCities);
	}
}