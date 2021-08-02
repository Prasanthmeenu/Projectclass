package org.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A {
  
	@Test(dataProvider="login")
	private void testA1(String name,String pass) {
		System.out.println("testA1");
		System.out.println(name);
		System.out.println(pass);
		
		System.out.println(Thread.currentThread().getId());
		
	}
	@Test
	private void testA2() {
		System.out.println("testA2");		
}@Test
	private void testA3() {
		System.out.println("testA3");
	}

@DataProvider(name="login")

private Object[][] data() {
	
	Object[][] d= new Object[][] {
		
		{"prasanth", "12345"},
		{"stephen", "12345"},
		{"reshmi", "12345"},
		{"prem", "12345"}
	};
		return d;
	
}
}

