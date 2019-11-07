/*
 * Java has single level and multilevel inheritance but it does not have multiple inheritance.
 * 
 * The parent class is also called as Base class or super class where as the child 
 * class is called as derived class or sub class.
 * 
 * Inheritance specifies "Is-A" relationship.
 * whereas, a class defining some variables specifies "Has-A" relationship.
 * 
 */

class Animal {
	String name;

	public void move() {
		System.out.println("Yes, animals can move.");
	}
}

class Dog extends Animal {
	int legs;

	public void run() {
		System.out.println("A dog can walk and run also.");
	}
}

class Labrdor extends Dog {
	int iq;
	
	public void trained() {
		System.out.println("The labrador dogs are very intelligent and can be trained very well.");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Animal a = new Animal();
		Labrdor l = new Labrdor();
		a.move();
		l.trained();
	}
}
