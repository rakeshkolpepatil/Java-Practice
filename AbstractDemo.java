/*
 * In this demo we will learn about "abstract" keyword.
 * An "Abstract class" is a class for which we can not create an instance.
 * Methods in abstract class can be both defined or made abstract.
 * Abstract method is a method for which we have not given any implementation details.
 * But if some method of a class is abstract then it is compulsory to declare that class as an abstract class.
 * But vice versa is not true.
 * 
 * The advantage of abstract class is that if we define methods of subclasses using objects of super class then any 
 * subclass object can be passed to method of any subclass object.
 * 
 *  A class must define all the abstract methods of an abstract class that it extends.
 *  
 */

abstract class Writer{
	abstract public void details() {
		System.out.println("This is writting instrucment.");
	}
}

class Pen extends Writer{
	public void details() {
		System.out.println("This is a pen.");
	}
	public void cost() {
		System.out.println("This cost of this pen is 20 Rs. ");
	}
	public void life(Writer x) {
		System.out.println("It can be used for 1 year. ");
	}
}

class Pencil extends Writer{
	public void details() {
		System.out.println("This is a pencil.");
	}
}

// A class must define all the abstract methods of an abstract class that it extends.
class Marker extends Writer{
	public void details() {
		
	}
}

public class AbstractDemo {
	public static void main(String[] args) {
		Writer t = new Pen();
		t.details();
		//t.cost(); // As I am using reference of super class I can not call the methods of subclass that are not declared in
		            // super class.
		
		Pen p = new Pen();
		p.life(t);
		Pencil pc = new Pencil();
		p.life(pc);
	
		Marker m = new Marker();
	}
}

