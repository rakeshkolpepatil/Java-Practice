/*
 * try{} catch(Exception e) {}, finally{}
 *  If some code in "try" block produces some error then code in "Exception" block will be executed. The code after the line which caused
 *  error will not be executed from try block.
 *  The code from "finally" block is executed at the end of try and catch code and needs to be put immediately after catch block.  
 * 
 */

package com.rakesh;

public class ExceptionHandeling {
	public static void main(String[] args) {

		try {
			int i=0;
			int[] a = new int[5];
			a[1]= 0;
			a[6] = 0; // This will create array out of bound error.
			
			System.out.println("The output is = " + (9/i)); // This will create divided by zero error
			System.out.println("This part of code is not executed. ");
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e) { // You can have two exceptions in single catch block.
			System.out.println("You ");
		}
		catch(Exception e) { // You can have multiple Exception blocks. The "Exception" type of Exception block needs to be put at end.
			System.out.println("Error.");
		}
		finally {
			System.out.println("Done. ");
		}
	}
}
