package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.aurionpro.model.Operations;

class OperationsTest {
	
	Operations operation;
	
	@BeforeEach
	void init() {
		operation = new Operations();
	}

	@AfterEach
	void status() {
		System.out.println("Test finished");
	}
	@Test
	public void testAddition() {
//		Operations operation = new Operations();
		assertEquals(30, operation.addition(10, 20),"This method must perform addition");
	}
	
	@Test
	public void testSubtraction() {
//		Operations operation = new Operations();
		assertEquals(30, operation.subtraction(50, 20),"This method must perform subtraction");
	}
	
	@Test
	public void testMultiplication() {
//		Operations operation = new Operations();
		assertEquals(200, operation.multiplication(10, 20),"This method must perform multiplication");
	}
	
	@Test
	public void testDivision() {
//		Operations operation = new Operations();
		assertEquals(2, operation.division(40, 20),"This method must perform division");
		
		assertThrows(ArithmeticException.class, () -> operation.division(10, 0));
	}
	
	@Test
	public void testSquareOfElements() {
//		Operations operation = new Operations();
		
		int squares[] = {25,36,49};
		int numbers[] = {5,6,7};
		assertArrayEquals(squares,operation.squareOfELements(numbers));
	}
	
	@Test
	public void testIsEven() {
		assertTrue(operation.isEven(6));
		assertFalse(operation.isEven(7));
	}

}
