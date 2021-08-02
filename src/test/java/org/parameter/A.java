package org.parameter;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A {
  @Parameters({"username", "password"})
	@Test
	private void testA1(@Optional("prasanth")String name, @Optional("12345")String pass) {
		System.out.println("testA1");
		System.out.println(name);
		System.out.println(pass);
	}
	@Test
	private void testA2(@Optional("saliki")String name, @Optional("123456")String pass) {
		System.out.println("testA2");
		System.out.println(name);
		System.out.println(pass);
}
	
	@Test
	private void testA3() {
		System.out.println("testA3");
	}
}
