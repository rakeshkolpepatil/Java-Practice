

class calc {
	int a;
	int b;

	public void add() {
		System.out.println("The addition of two numbers is = "+ (a+b) );
		System.out.printf("\n The addition of two numbers is = %d ", a+b);
	}

}

/*
 * Please note that both "String args[]" and "String[] args" are valid 
 * in case of class and objects.
 * 
 */

public class ClassAndObjects {
	public static void main(String args[]) {
			calc c = new calc();
			//calc c; // You can not create an object like this in java.
			c.a = 1;
			c.b = 2;
			c.add();
	}
}
