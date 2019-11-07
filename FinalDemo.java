/*
 * The "final" keyword can be appended to a variable, function or class.
 * If a variable is made final, it can be assigned a value only once and can not be changed afterwards.
 * If a method is made final, then it can not be overridden.
 * If a class is made final then it can not be inherited further.
 * 
 */
class C{
	
	public final void my() {
		
	}
	
}

final class A{
	final int x;
	A(){
		x=10;
		//x=2; // a final variable can be assigned a value only once in its lifetime.
	}
	
	public void show() {
		System.out.println("This is in A. ");
	}
}

class B extends A{ // class B can not extend class A, as it has been defined as final.
	
}

class D extends C{
	public void my() { //class C can not override the method my() of its super class C, as it has been declared as final there.
	}
}

public class FinalDemo {
	public static void main(String[] args) {
		
		
	}
}
