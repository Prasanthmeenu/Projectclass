package org.grouping;

import java.util.Date;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Mainprogram.Jbs;

public class Facebook extends Jbs {
	
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
		Date d =new Date();
		System.out.println("Test Starts....."+new Date());
		System.out.println("Before Method");
		}
	
	@AfterMethod
	private void AfterMethod() {
		System.out.println("Test End....."+new Date());
		System.out.println("After Method");
	}
	@Test
	private void Test() {
		launchurl("https://en-gb.facebook.com/"); 
		System.out.println("Test");
	}	
}

		//WebElement Txtusername = driver.findElement(By.id("email"));
		//Txtusername.sendKeys("prasanth");
		//WebElement Txtpassword = driver.findElement(By.id("pass"));
		//Txtpassword.sendKeys("12345");
		//WebElement btnLogin = driver.findElement(By.name("login"));
		//btnLogin.click();
		
		
	
