/*
 * A normal method can be used by multiple threads simultaneously i.e. it is not thread safe.
 * To make it thread safe a keword "synchronized" is added in JAVA. A "synchronized" method can be accessed by only 
 * one thread at a time.
 */

package com.rakesh;

class Counter{
	int count;
	public synchronized void increment() {
		count++;
	}
}
public class Synchronization {
	public static void main(String[] args) throws Exception {
		
		Counter c = new Counter();
		
		Runnable obj1 = new Runnable() {
			public void run() {
				for(int i=0; i<1000; i++) {
					c.increment();
				}
			}
		};
		
		Runnable obj2 = new Runnable() {
			public void run() {
				for(int i=0; i<1000; i++) {
					c.increment();
				}
			}
		};
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println("The value of counter is = "+ c.count);
	}
}
