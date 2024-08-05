package com.aurionpro.test;

import com.aurionpro.model.MyThread;

public class ThreadDemo {

	public static void main(String[] args) {
		MyThread thread1 = new MyThread("JAVA"); 
		MyThread thread2 = new MyThread("JAVA1"); 
		MyThread thread3 = new MyThread("JAVA2"); 
		MyThread thread4 = new MyThread("JAVA3"); 
		
		System.out.println(thread1.isAlive());
		System.out.println(thread2.isAlive());
		System.out.println(thread3.isAlive());
		System.out.println(thread4.isAlive());
		
		thread1.getThread().setPriority(Thread.MAX_PRIORITY);
		thread2.getThread().setPriority(Thread.MIN_PRIORITY);
		thread3.getThread().setPriority(Thread.NORM_PRIORITY);
		
		try {
			thread1.getThread().join();
			thread3.getThread().join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		for(int i = 5 ; i > 0 ; i--) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			try {
				Thread.sleep(1000);
				
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		System.out.println(thread1.isAlive());
		System.out.println(thread2.isAlive());
		System.out.println(thread3.isAlive());
		System.out.println(thread4.isAlive());
		
	}

}
