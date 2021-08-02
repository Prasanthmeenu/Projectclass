package testNG;

import org.testng.annotations.*;

public class SampletestNG  {
	
	@BeforeClass
	private void Beforeclass() {
		System.out.println("Before Class");
	}
		
	@AfterClass
	private void AfterClass() {
		System.out.println("After Class");
	}
	@BeforeMethod
	private void BeforeMethod() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	private void AfterMethod() {
		System.out.println("After Method");
	}
	@Test(priority=-1,invocationCount=5,enabled=true)
	private void Test3() {
	System.out.println("Test3");
	}
	@Test(priority=2)
	private void Test() {
	System.out.println("Test");
	}
	@Test(enabled=false)
	private void Test2() {
	System.out.println("Test2");
	}	
	}


