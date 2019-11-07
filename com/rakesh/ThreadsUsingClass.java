/*
 * Threads can be created by inheriting "Thread" Class or by implementing "Runnable" interface.
 * Using Runnable interface a thread can be created for Inherited class.
 * Your program is executed by "main" thread.
 * 
 */
package com.rakesh;

class Hi extends Thread {
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("Hi");
			try{ Thread.sleep(500); } catch(Exception e) {};
		}
	}
}
class Hello extends Thread {
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("Hello");
			try{ Thread.sleep(500); } catch(Exception e) {};
		}
	}
}

public class ThreadsUsingClass {
	public static void main(String[] args) {
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();
		obj1.start();
		try{ Thread.sleep(300); } catch(Exception e) {};
		obj2.start();
	}
}
