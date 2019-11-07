
public class ControlLoops {
	public static void main(String args[]) {
		// The program for odd and even
		int x = 2;
		if (x == 0)
			System.out.println("The value of x is neigther odd nor even ");
		else if (x % 2 == 0)
			System.out.println("The value of x is even");
		else
			System.out.println("The value of x is odd ");

		int n = 20;
		switch (n) {

		case 1:
			System.out.println("The value of n is 1");
			break;
		case 2:
			System.out.println("The value of n is 2");
			break;
		case 3:
			System.out.println("The value of n is 3");
			break;
		default:
			System.out.println("This is default value of n ");
		}

		String s = "Hello";
		switch (s) {

		case "hi":
			System.out.println(" Hi, How are you ");
			break;
		case "hello":
			System.out.println("Hello, How are you ");
			break;
		case "welcome":
			System.out.println("You are welcome");
			break;
		default:
			System.out.println("This is default value of n ");
		}

		//ternary operator
		n = s=="hello" ? 20: 30;
		System.out.println("The value of n is = " + n);
		
		
	}
}
