package com.aurionpro.model;

public class MyThread extends Thread {
	private Thread thread;
	

	public Thread getThread() {
		return thread;
	}

	public void setThread(Thread thread) {
		this.thread = thread;
	}

	public MyThread(String name) {
		super();
		 thread = new Thread(this, name);
		 thread.start();
	}
	
	public void run() {
		for(int i = 5 ; i > 0 ; i--) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			try {
				Thread.sleep(1000);
				
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	
}
