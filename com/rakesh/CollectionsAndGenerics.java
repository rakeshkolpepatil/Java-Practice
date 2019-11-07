/*
 * In JAVA, we have three collection.
 * collection is a concept.
 * Collection is an interface.
 * collections is a class.
 * 
 * The hierarchy of collection implementation is as follows -
 * Collection -> List -> ArrayList. 
 * 
 */
package com.rakesh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class CollectionsAndGenerics {
	public static void main(String[] args) {
		// collection does not have indices to elements.
		// In following connection you can have any object as it can have any type of data.
		Collection v = new ArrayList();
		v.add(2);
		v.add(3);
		Iterator it = v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// If you want to access elements using indices then use "List".
		List val = new ArrayList();
		val.add(1);
		val.add(3);
		val.add(1, 2);
		
		System.out.println("Printing elements of ArrayList using Smart For Loop -");
		for( Object o : val ) {
			System.out.println(o);
		}
		
		System.out.println("Printing elements of ArrayList using for loop -");
		for(int i=0; i < val.size(); i++) {
			System.out.println(val.get(i));
		}
		
		System.out.println("The ArrayList using generics - ");
		// You can specify the types of objects to be stored in the List. In JAVA this is known  as generics.
		List<Integer> v1 = new ArrayList<>();
		v1.add(1);
		v1.add(23);
		v1.add(3);
		v1.add(45);
		v1.add(98);
		v1.add(2);
		//v1.add("2");
		for(Integer o: v1)
			System.out.println(o);
		
//		Comparator<Integer> co = new Comparator<Integer>() {
//			public int compare(Integer a, Integer b) {
//				if(a>b)
//					return 1;
//				else 
//					return -1;
//			}
//		};
	
		//You can also define the comparator object using lambda expression like this.
		Comparator<Integer> co = (Integer a, Integer b) -> {if(a>b) return 1; else return -1; };
		
		//Collections.sort(v1, co);
		// This also works fine.
		Collections.sort( v1, (a,b)-> a>b?1:-1 );
		System.out.println("This is after sorting -");
		for(Integer o: v1)
			System.out.println(o);
		
	}
}
