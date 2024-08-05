package com.aurionpro.day16.test;

import com.aurionpro.day16.model.Consumer;
import com.aurionpro.day16.model.Producer;
import com.aurionpro.day16.model.Q;;


public class PCFixed {
	 public static void main(String args[]) {
		 Q q = new Q();
		 new Producer(q);
		 new Consumer(q);
		 System.out.println("Press Control-C to stop.");
	}

}
