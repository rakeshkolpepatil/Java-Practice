class X{
	int i;
	public void show(){
		System.out.println("In side X.");
	}
}

class Y extends X{
	int i;
	@Override // This is annotation in java. which will tell compiler that the following method wants to override the 
			  // method with same name from super class. So if we make mistake in naming this method we will get compile
	          // time error.
	public void show(){
		// You can access the members of super class by specifying the keyword "super"
		super.i = 5;
		i = 5; // This is local variable.
		System.out.println("In side Y.");
	}
}

public class MethodOverriding {
	public static void main(String args[]) {
		Y yobj = new Y();
		yobj.show(); // The show() method of object Y will Override the show() method of object X.
	}
}
