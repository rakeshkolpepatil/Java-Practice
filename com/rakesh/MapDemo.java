/*
 * 
 * 
 */

package com.rakesh;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<>();
		m.put("Rakesh", 23);
		m.put("Rohit", 22);
		m.put("Ram", 24);
		m.put("Ramesh", 25);
		m.put("Rajesh", 26);
		m.put("Raghesh", 27);
		
		System.out.println("These are contents of map - ");
		Set<String> s = m.keySet();
		for(String ss: s)
			System.out.println( ss +  " : "+ m.get(ss));
	}
}
