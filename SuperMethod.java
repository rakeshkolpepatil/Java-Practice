/*
 * 
 * super() is a method which is called by default in constructor of a sub class.
 * This method calls the default constructor of super class.
 * By passing arguments to this constructor, any parameterized constructor of the super class can be called.
 * 
 */

class A {
	A() {
		System.out.println(" In default constructor of A.");
	}

	A(int x) {
		System.out.println(" In int constructor of A.");
	}
}

class B extends A {
	B() {
		System.out.println(" In default constructor of B. ");
	}

	B(int x) {
		super(x);
		System.out.println(" In int constructor of B. ");
	}

}

public class SuperMethod {
	public static void main(String[] args) {
		B b = new B(2);
	}
}
