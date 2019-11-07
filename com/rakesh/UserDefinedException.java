/*
 * You can throw an exception with a condition and also have your own type of exception.
 * 
 */
package com.rakesh;

class RakeshException extends Exception{
	public RakeshException( String s) {
		super(s);
	}
}

public class UserDefinedException {
	public static void main(String[] args) {
		int i=0;
		try {
			if(i == 0)
				throw new RakeshException(" This is how you can throw your own exception. ");
		}
		catch(RakeshException e) {
			System.out.println(e.getMessage());
		}
	}
}
