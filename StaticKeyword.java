/*
 * When you declare a method or a variable as static, only one copy of it will be created for an object
 * For a static method you do not need an object to call that method.
 * This is the reason the main method is declared as static in java.
 * Also if a variable is declared as Static only one copy of is created for all objects of that class.
 * You can access the static variable with just class name.
 * 
 * There is a loader memory in JVM which is called as "Class Loader Memory" where you load all your class files.
 */

class Emp {
	int empid;
	int salary;
	public static String ceo;

	// The static block is a special block in java to initialize the static variables.
	// It will be executed only once when the class is loaded. irrespective of the number of objects created for that class.
	// Please note that class will be loaded only once.
	
	static {
		ceo = "Rakesh";
	}
	
	public static void details()
	{
		//Emp t = new Emp() ;
		//empid = 1;
		System.out.println("The ceo of company is = " + ceo);
	}

}

public class StaticKeyword {
	static int i =0; // You can not access this i variable inside the static method main until you make it static.
	
	// In static method I think you can access only local or static variables.
	public static void main(String args[]) {
		System.out.println(i);
		
		Emp Rakesh = new Emp();
		Rakesh.empid = 10;
		Rakesh.salary = 100000;
		//Emp.ceo = "Rakesh";
		Rakesh.details();
	}
}
