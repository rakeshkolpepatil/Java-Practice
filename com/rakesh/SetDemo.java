/*
 *  
 */

package com.rakesh;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		Set<Integer> s = new HashSet<Integer>();
		s.add(1);
		s.add(2);
		s.add(2); // Duplicate elements are not added to set.
		s.add(48);
		
		System.out.println("The contents of set are -");
		System.out.println("The contents of set are not stored in order - ");
		for(Integer i:s)
			System.out.println(i);
		
		Set<Integer> ss = new TreeSet<Integer>();
		ss.add(1);
		ss.add(2);
		ss.add(2); // Duplicate elements are not added to set.
		ss.add(48);
		
		System.out.println("The contents of TreeSet are - ");
		System.out.println("The contents of TreeSet are stored in the order of insertion - ");
		for(Integer i:ss)
			System.out.println(i);
		
		
	}
}
