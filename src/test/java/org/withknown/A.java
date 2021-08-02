package org.withknown;

import org.testng.Assert;
import org.testng.annotations.Test;


public class A {
  
	@Test
	private void testA1() {
		System.out.println("testA1");
		
	}
	@Test(retryAnalyzer=Withknown.class)
	private void testA2() {
		Assert.assertTrue(false);
		System.out.println("testA2");
		
}
	
	@Test
	private void testA3() {
		System.out.println("testA3");
	}
}
