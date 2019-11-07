/*
 * JAVA compiler will check some exceptions at compile time only. These are called as "Checked Exceptions".
 * Whenever you have created a resource it is always good to close it inside finally block to guarentee that it gets closed properly.
 * 
 * So, create a resource in try catch block, handle error in catch block and close the resource in finally block.
 *  This is how you need to handle checked exceptions.
 *  
 */

package com.rakesh;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CheckedException {
	public static void main(String[] args) throws Exception 
	{ 
		System.out.println("Enter a number. ");
		int n=0;
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			n = Integer.parseInt(br.readLine());
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			br.close();
		}
		System.out.println(n);
	}
}
