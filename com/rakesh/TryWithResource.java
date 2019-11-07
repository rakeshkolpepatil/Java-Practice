/*
 * Before JAVA 1.7 you needed "Try" block to be accompanied with either a "catch" block or a "finally" block. Either of two is must.
 * But since JAVA 1.7 you can use following syntax, to avoid using "catch" or "finally" block.
 * And resource that is created in try() block will get automatically closed after its scope or also in case of some error while opening 
 * that resource.
 *  
 */
package com.rakesh;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TryWithResource {
	public static void main(String[] args) throws Exception {
		System.out.println("Enter a number. ");
		int n = 0;

		// BufferedReader br = null;
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			n = Integer.parseInt(br.readLine());
		}
//  No need of catch block or finally block. Resource will be closed automatically after its scope.
//		catch (Exception e) {
//			System.out.println(e);
//		} finally {
//			br.close();
//		}
		System.out.println(n);
	}
}
