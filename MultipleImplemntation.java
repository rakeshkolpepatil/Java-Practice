/*
 * If a class implements multiple interfaces and the method is present in both the interfaces then to avoid ambiguity 
 * either both the methods are overridden in the implementing class or they are specified using 'super' keyword in the over-ridding 
 * method. 
 * 
 */

interface d1 {
	default void show() {
		System.out.println("Inside interface d1.");
	}
}

interface d2 {
	default void show() {
		System.out.println("Inside interface d2");
	}
}
interface d3{
	int x=9; // variables inside interfaces need to be initialized and are 'final' by default.
	static void show() {
		System.out.println("Since, JAVA 1.8 we can also define a static method inside interface.");
		System.out.println("Because of this we do not need to create an object of interface to call that method.");
	}
}
class temp implements d1, d2 {
	public void get() {
		System.out.println("Get method inside temp class. ");
	}
	public void show() {
		//d1.super.show();
		//d2.super.show();
		System.out.println("Write your implemenation of show method here. ");
	}
}

public class MultipleImplemntation {
	public static void main(String[] args) {
		temp obj1 = new temp();
		obj1.get();
		obj1.show();
		// calling static method of an interface directly using interface name.
		d3.show();
	}
}
