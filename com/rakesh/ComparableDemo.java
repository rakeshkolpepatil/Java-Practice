/*
 * 
 * 
 */

package com.rakesh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stud implements Comparable<Stud> {
	int rollno;
	String name;
	int marks;
	int age;
	
	public Stud(int rollno, String name, int marks, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
		this.age = age;
	}
	@Override
	public String toString() {
		return "stud [rollno=" + rollno + ", name=" + name + ", marks=" + marks + ", age=" + age + "]";
	}
	public int compareTo(Stud s) {
		if(age > s.age)
			return 1;
		else
			return -1;
	}
	
}

public class ComparableDemo {
	public static void main(String[] args) {
		List<Stud> l = new ArrayList<>();
		l.add(new Stud(1,"ram", 90, 23));
		l.add(new Stud(2,"shyam",99,24));
		l.add(new Stud(3,"mohan",100,20));
		l.add(new Stud(4,"radha",90,21));
		l.add(new Stud(5,"sarita",88,22));

		System.out.println("Displaying the content of List -");
		for(Stud o: l)
			System.out.println(o.toString());

		// This will sort the list as per the logic you implemented in compareTo method.
		Collections.sort(l);
		System.out.println("\nThe list is sorted as per the logic of compareTo function -");
		for(Stud o: l)
			System.out.println(o.toString());
		
		// This will sort the list as per the logic given by the comparator function.
		Collections.sort(l, (a,b)-> a.marks>b.marks?1:-1 );
		
		System.out.println("\nDisplaying the content of List after sorting using custom settings on marks field -");
		for(Stud o: l)
			System.out.println(o.toString());
		
	}
}
