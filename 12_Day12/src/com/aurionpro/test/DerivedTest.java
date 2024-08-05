package com.aurionpro.test;

import com.aurionpro.model.Base;
import com.aurionpro.model.Derived1;
import com.aurionpro.model.Derived2;

public class DerivedTest {

	public static void main(String[] args) {
		Base base = new Base();
		Derived1 derived1 = new Derived1();
		Derived2 derived2 = new Derived2();
		
		base.display();
		derived1.display();
		derived2.display();
		
		
		base = derived1;
		base.display();
		
		base = new Derived2();
		base.display();
		

	}

}
