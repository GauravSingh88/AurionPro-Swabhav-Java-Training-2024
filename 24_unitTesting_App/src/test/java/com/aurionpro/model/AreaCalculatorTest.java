package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AreaCalculatorTest {
	
	AreaCalculator calculator;
	
	@BeforeEach
	void init() {
		calculator = new AreaCalculator();
	}

	@Test
	void testCalculateAreaOfCircle() {
		assertEquals(78.5, calculator.calculateAreaOfCircle(5));
	}

	@Test
	void testCalculateAreaOfRectangle() {
		assertEquals(200, calculator.calculateAreaOfRectangle(10,20));
	}

	@Test
	void testCalculateAreaOfTriangle() {
		assertEquals(50, calculator.calculateAreaOfTriangle(10,10));
	}

}
