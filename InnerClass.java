
class Outer{
	int x;
	int y;
	static int s;
	
	public class Inner{
		int a;
		int b;
		public void inner_printing() {
			System.out.println("This is print function of inner class. ");
		}
	}
	
	public static class InnerStatic{
		int k;
		public void inner_printing() {
			System.out.println("This is print function of InnerStatic class");
		}
	}
	
	public void printing() {
		System.out.println("This is function of inner class");
	}
	
}


public class InnerClass {
	public static void main(String[] args) {
		Outer o = new Outer();
		
		// Please note how we are creating the instance of inner class in below code.
		Outer.Inner i = o.new Inner();
		
		// Please note for creating instance of inner static class we do not need an object.
		Outer.InnerStatic is = new Outer.InnerStatic();
		i.inner_printing();
		is.inner_printing();
		System.out.println("This is in main method.");
	}
}
