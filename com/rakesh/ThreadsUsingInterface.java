/*
 * To have multiple inheritance while creating Threads, in JAVA we use "Runnable" interface to create threads.
 * 
 */
package com.rakesh;
//class Hi implements Runnable{
//	public void run() {
//		for(int i=0; i<5; i++) {
//			System.out.println("Hi.");
//			try {Thread.sleep(500);} catch(Exception e) {};
//		}
//	}
//}
//
//class Hello implements Runnable{
//	public void run() {
//		for(int i=0; i<5; i++) {
//			System.out.println("Hello.");
//			try {Thread.sleep(500);} catch(Exception e) {};
//		}
//	}
//}

public class ThreadsUsingInterface  {
	public static void main(String[] args) throws Exception {
		// Hi obj1 = new Hi();
		// Hello obj2 = new Hello();
		
 //Runnable is function interface and the purpose of Hi and Hello classes is to just implement run() method.
 // So we can create anonymous class instead of creating Hi and Hello classes.
		Runnable obj1 = new Runnable() {
			public void run() {
				for(int i=0; i<5; i++) {
					System.out.println("Hi.");
					try {Thread.sleep(500);} catch(Exception e) {};
				}
			}
		};
		
		Runnable obj2 = new Runnable() {
			public void run() {
				for(int i=0; i<5; i++) {
					System.out.println("Hello.");
					try {Thread.sleep(500);} catch(Exception e) {};
				}
			}
		};
		
// // This is how you can use lambda expression for all of these.		
//		Runnable obj1 = () -> {
//								for(int i=0; i<5; i++) {
//									System.out.println("Hi.");
//									try {Thread.sleep(500);} catch(Exception e) {};
//								}
//							};
//		
//		Runnable obj2 = () -> {
//								for(int i=0; i<5; i++) {
//										System.out.println("Hello.");
//										try {Thread.sleep(500);} catch(Exception e) {};
//								}
//							};
		
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		// We can give names to threads as follows.
		// Thread t1 = new Thread(obj1, "Hi Thread");
		// Thread t2 = new Thread(obj2, "Hello Thread");
		//t1.setName("Hi Thread");
		//t2.setName("Hello Thread");
		
		t1.start();
		t2.start();
		
		// You can set the priorities to the threads using following syntax.
		// 1 is lowest priority whereas 10 is the highest priority.
		t1.setPriority(1);
		t2.setPriority(10);
		
		System.out.println("Is thread1 alive ? - "+ t1.isAlive());
		System.out.println("Is thread1 alive ? - "+ t2.isAlive());
		
		System.out.println("The priority of Thread 1 is = "+ t1.getPriority());
		System.out.println("The priority of Thread 2 is = "+ t2.getPriority());
		// "join()" and "isAlive()" methods are used as follows
		t1.join();
		t2.join();
		
		System.out.println("Is thread1 alive ? - "+ t1.isAlive());
		System.out.println("Is thread1 alive ? - "+ t2.isAlive());
		System.out.println("The name of thread1 is - " + t1.getName());
		System.out.println("The name of thread2 is - " + t2.getName());
		System.out.println("The execution has finished.");
	}
}
