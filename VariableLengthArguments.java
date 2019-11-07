
class Adder {
	// Giving three dots in function definition will make the function to accept variable number of arguments.
	public void addition(int ...k) {
		int sum=0;
		for(int i: k) {
			sum+=i;
		}
		System.out.println("The addition of all the elements = " + sum);
	}
}


public class VariableLengthArguments {
	public static void main(String args[]) {
		Adder a = new Adder();
		a.addition(1,2,3,4,5,6,7,8,9,10);
	}
}

