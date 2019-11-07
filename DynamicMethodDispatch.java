/*
 * We create a reference of super class and store an object of subclass into it.
 * RUN TIME PARALLELISM
 */

class A{
	int a;
	public void info() {
		System.out.println("This is info method of class A. ");
	}
}

class B extends A{
	int b;
	public void info() {
		System.out.println("This is info method of class B. ");
	}
	public void go() {
		System.out.println("This is go from class B. ");
	}
}

class C extends B{
	int c;
	public void info() {
		System.out.println("This is info function from class C. ");
	}
}

public class DynamicMethodDispatch {
	public static void main(String[] args) {
		A obj = new B();
		obj.info();
		//obj.go(); // Note that, in reference of superclass you can store object of subclass. But you will be able to call
				  // only those functions which are declared in superclass. If these functions are overridden in subclass
		          // then the overridden functions of subclass will be called.
		B ob = new B();
		ob.info();
		ob.go();
		
		obj = new C(); 
		obj.info();  // This will call the overridden function from object of class C, though it is stored in reference of 
		             // class A. Depending upon the object method will be called, this is known as Dynamic Method Dispatch i.e.
		             // runtime parallelism.
	}
}
