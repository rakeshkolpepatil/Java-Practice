/*
 * 1. Normal Interface -  contains more than one methods
 * 2. Single Abstract Method (or) SAM  - has only one method in it.
 * 3. Marker Interface - It does not have any method in it. e.g - Serializable Interface. 
 *
 *   From JAVA 1.8 onwards, we have "Functional interface" instead of SAM interface. Functional Interface has only one abstract 
 *   method. But as we can define methods inside interface from JAVA 1.8, we can define multiple methods inside "Functional Interface"
 *   But we can have only one abstract method.
 *   
 *   Functional interfaces are important for Lambda expressions which JAVA has borrowed from SCALA language.
 *   
 */

@FunctionalInterface
interface I {
	void show();
	default void printing() {
		System.out.println("This is how using default keyword yor can define a method inside an interface.");
	}
}

public class TypesOfInterfaces {
	public static void main(String[] args) {
		I obj = () -> { System.out.println("This is syntax of creating an object of interface 'I' with lambda Expression. "); }; 
		obj.show();
	}
}
