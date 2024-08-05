package com.aurionpro.list.test;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;
//import java.util.ListIterator;
import java.util.Scanner;

import com.aurionpro.model.Car;

public class CarListTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Car> cars = new ArrayList<Car>();

		theCarApp(scanner, cars);

	}

	private static void theCarApp(Scanner scanner, List<Car> cars) {
		System.out.println("Enter number of car you want to create : ");
		int numberOfCar = scanner.nextInt();

		getCarDetails(numberOfCar, scanner, cars);
		printingCars(cars);
		getCarMaxMileage(cars, numberOfCar);
	}

	private static void getCarDetails(int numberOfCar, Scanner scanner, List<Car> cars) {
		for (int i = 0; i < numberOfCar; i++) {
			System.out.println("Enter campnay name for car " + (i + 1) + " : ");
			String companyName = scanner.next();
			System.out.println("Enter mileage for car " + (i + 1) + " : ");
			double mileage = scanner.nextDouble();
			System.out.println("Enter price for car " + (i + 1) + " : ");
			double price = scanner.nextDouble();

			cars.add(new Car((i + 1), companyName, price, mileage));

		}
	}

	private static void getCarMaxMileage(List<Car> cars, int numberOfCar) {
		System.out.println("Car with maximum mileage is : ");
		System.out.println();
		System.out.println(maxMileageCar(cars, numberOfCar));
	}

	private static void printingCars(List<Car> cars) {

		System.out.println("Printing list of all cars");
		for (Car car : cars) {
			System.out.println(car);
		}

		System.out.println();
	}

	private static Car maxMileageCar(List<Car> cars, int numberOfCar) {
		Car carMax = cars.get(0);
		double maxMileage = carMax.getMileage();
		for (Car car : cars) {
			if (maxMileage < car.getMileage()) {
				maxMileage = car.getMileage();
				carMax = car;
			}
		}

		return carMax;

	}
}
