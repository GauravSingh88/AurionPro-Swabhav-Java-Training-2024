package com.aurionpro.test;

import com.aurionpro.model.Demo;

public class DemoTest {
	
	static {
		System.out.println("Hello3");
	}

	public static void main(String[] args) {

//		Demo demo1 =new Demo();
//		demo1.display();
//		demo1.increment();
//		demo1.display();
//		
//		Demo demo2 =new Demo();
//		demo2.display();
//		demo2.increment();
//		demo2.display();
//		
//		Demo demo3 =new Demo();
//		demo3.display();
//		demo3.increment();
//		demo3.display();
		
		
		Demo demo1 =new Demo();
		demo1.display();
		Demo.increment();
		demo1.display();
		
		Demo demo2 =new Demo();
		demo2.display();
		Demo.increment();
		demo2.display();
		
		Demo demo3 =new Demo();
		demo3.display();
		Demo.increment();
		demo3.display();
		
		

	}
	
	static {
		System.out.println("Hello");
	}
	
	static {
		System.out.println("Hello1");
	}
	
	static {
		System.out.println("Hello2");
	}

}
