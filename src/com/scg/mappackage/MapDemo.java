package com.scg.mappackage;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, Integer> people = new HashMap<String, Integer>();

	    // Add keys and values (Name, Age)
	    people.put("John", 32);
	    people.put("Amal", 30);
	    people.put("Jibin", 33);
	    
	    // for print keys
	    for (String i : people.keySet()) {
	    	  System.out.println(i);
	    }
	    
	    // for print values
	    for (Integer i : people.values()) {
	    	  System.out.println(i);
	    	}
	    

	    // Print keys and values
	    for (String i : people.keySet()) {
	      System.out.println("key: " + i + " value: " + people.get(i));
	    }
	    
	    //remove an item
	    people.remove("Amal");
	 // Print keys and values
	    System.out.println("\nAfter Remove item\n");
	    for (String i : people.keySet()) {
	      System.out.println("key: " + i + " value: " + people.get(i));
	    }
	    
	    //
	    people.put("Jibin",50);
	    
        System.out.println("Updated Map " + people);
	    
	    
	}
	

}
