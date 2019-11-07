/*
 * The way to accept input from a user. If you use "scanner" for getting input there is no need for you to handle exceptions.
 * They are handled automatically for you.
 * 
 */

package com.rakesh;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		System.out.println("Please, Enter a number - ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // Scanner has different methods to get input in different formats.
		System.out.println("The entered value is = " + n);
	}
}
