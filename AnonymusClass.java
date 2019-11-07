/*
 * IF there is a class which is created just to override a single method of super class then we can replace that class
 * with anonymus class. 
 * 
 * In anonumous class, first we create an object and we specify its implementation afterwards.
 * 
 * Anonymous classes are widely used for instantiating interfaces.
 * 
 * Anonymous class help in avoiding class memory westage .
 * 
 */
class A {
	public void show() {
		System.out.println("Inside A. ");
	}
}

// Class B inherits class A and just overrides single method of class A. This can be avoided by creating anonymus class.
//class B extends A {
//	public void show() {
//		System.out.println("Insid B. ");
//	}
//}

public class AnonymusClass {
	public static void main(String[] args) {
		A obj = new A() { // This is syntax of anonymous class. It will be used only once.
			public void show() {
				System.out.println("Inside B. ");
			}
		};

		obj.show();
	}
}
