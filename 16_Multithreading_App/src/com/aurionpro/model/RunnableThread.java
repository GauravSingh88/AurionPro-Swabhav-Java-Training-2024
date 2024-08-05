package com.aurionpro.model;

public class RunnableThread implements Runnable {
	
	private Thread thread;

	public RunnableThread(String name) {
		super();
		thread = new Thread(this);
		thread.start();
		// TODO Auto-generated constructor stub
	}

	@Override
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
