package com.aurionpro.day16.model;

import com.aurionpro.day16.model.Q;;

public class Producer implements Runnable {
	 Q q;
	 public Producer(Q q) {
		 this.q = q;
		 new Thread(this, "Producer").start();
	 }
	 public void run() {
		 int i = 0;
		 while(true) {
		 q.put(i++);
		 }
	 }
	}
