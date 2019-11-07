/*
 * Java does not support multiple inheritance, I think Java has interfaces to solve this problem.
 * Interface is very much similar to Abstract Class, It also can not be instantiated like abstract class.
 * 
 * In Interface we can defind the mthods from JAVA 1.8
 * 
 * However, an abstract class can have a non-abstract method i.e. we can defind the methods but all the methods of an interface
 * are by default "public abstract". 
 * When a class inherits an interface it uses "implements" keyword instead of "extends" keyword.
 * 
 * Thus a class can extend another class and also simultaneously implement one interface which is like multiple inheritance.
 * 
 * Given a choice we should always go for interfaces.
 * 
 * We can create an object of an interface only by implementing it in other class.
 * 
 * See following example to see how to implement an interface using anonymous class.
 * 
 */

interface Writer1{
	int price =10;
	void show();
}

interface Writer2{
	void cost();
}

interface Writer3{
	void purchase();
}

class Instrument{
	public void price() {
		System.out.println(" This is Instrument price. ");
	} 
}

class pen extends Instrument implements Writer1, Writer2, Writer3 { // A class can not inherit multiple classes but it can 	                                    
	public void show() {											// implement multiple interfaces.
		System.out.println("This is pen price.");
	}
	public void cost() {
		System.out.println("This is pen cost. ");
	}
	public void purchase() {
		System.out.println("This is pen purchase. ");
	}
}

public class InterfaceDemo {
	public static void main(String[] args) {
		Writer2 obj = new Writer2() {
			public void cost(){
				System.out.println("This is anonymous class which implements Interface of Writer2. ");
			}
		};
		
		obj.cost();
	}
}
