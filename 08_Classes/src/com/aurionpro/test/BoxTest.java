package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Box;

public class BoxTest {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);

		Box box1;
		box1 = new Box();
		
		Box box2 = new Box();
//		System.out.println(box2.width);
		
//		box2.width = 40;
//		System.out.println(box2.width);
		
//		box1.height = 10;
//		box1.width =20;
//		box1.depth = 30;
//		
//		
//		System.out.println("box 1 details :- height : " + box1.height + ", width : " + box1.width + ", depth : " + box1.depth );
//		
//		box2.height = 100;
//		box2.width =200;
//		box2.depth = 300;
//		
//		
//		System.out.println("box 2 details :- height : " + box2.height + ", width : " + box2.width + ", depth : " + box2.depth );
		
		System.out.println("Enter height :");
		int height =  sc.nextInt();
		box1.setHeight(height);
		
		System.out.println("Enter width :");
		int width =  sc.nextInt();
		box1.setWidth(width);
		
		System.out.println("Enter depth :");
		int depth =  sc.nextInt();
		box1.setDepth(depth);
		
		
		System.out.println("Height is " + box1.getHeight());
		System.out.println("Width is " + box1.getWidth());
		System.out.println("depth is " + box1.getDepth());
		
//		box1.display();
//		box1.initialise(10,20,30);
//		box1.display();
//		
//		System.out.println("Area of box1 is :" + box1.calculateArea());
//		
//		
//		box2.display();
//		box2.initialise(40,50,60);
//		box2.display();
//		
//		System.out.println("Area of box2 is :" + box2.calculateArea());


	}

}
