package com.aurionpro.test;

import com.aurionpro.model.Circle;
import java.util.Scanner;

public class CircleTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle circle1 = new Circle(10);
//		circle1.display();
//		System.out.println("enter radius of circle");
//		int radius = sc.nextInt();
//		circle1.setRadius(radius);

//		circle1.initialise(radius);
		circle1.display();
//
		circle1.calculateArea();

	}

}
