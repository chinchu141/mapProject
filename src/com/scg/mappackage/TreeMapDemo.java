package com.scg.mappackage;
//Java Program to illustrate the Treemap Class
import java.util.*;



public class TreeMapDemo {

	public static void main(String[] args)
	{
		Map<String, Integer> people
			= new TreeMap<>();

		people.put("Vishal", 10);
		people.put("Sachin", 30);
		people.put("Vaibhav", 20);
		
        
		for (Map.Entry<String, Integer> e : people.entrySet())
			System.out.println(e.getKey() + " "
							+ e.getValue());
		
		people.put("Tinu", 30);
		System.out.println("\nAfter add new element \n"+ people);
	}
}