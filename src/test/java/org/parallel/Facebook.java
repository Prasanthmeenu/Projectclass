package org.parallel;

import java.util.Date;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Mainprogram.Jbs;
import Mainprogram.Pom;

public class Facebook extends Jbs {
	
	@BeforeClass
	
	private void Beforeclass() {
		browserLaunch("chrome");
		browserLaunch("firefox");
		//browserLaunch("Ie");
		browserLaunch("Edge");
		
		System.out.println("Before Class");
	}

	@AfterClass
	private void AfterClass() {
		
		System.out.println("After Class");
	}
	@BeforeMethod
	private void BeforeMethod() {
		
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
		SoftAssert s= new SoftAssert();
		s.assertTrue(driver.getCurrentUrl().contains("facebook"), "verify url");
		
		Pom p= new Pom();
		filltextbox(p.getTxtusername(),"prasanth");
		s.assertEquals("prasanth", p.getTxtusername().getAttribute("value"), "verfy username");
		
		filltextbox(p.getTxtpassword(),"12345");
		s.assertEquals("12345", p.getTxtpassword().getAttribute("value"), "verfy password");
		
		btnclick(p.getBtnlogin());
		
		System.out.println("Test");
		s.assertAll();
	}

	
	}	


		//WebElement Txtusername = driver.findElement(By.id("email"));
		//Txtusername.sendKeys("prasanth");
		//WebElement Txtpassword = driver.findElement(By.id("pass"));
		//Txtpassword.sendKeys("12345");
		//WebElement btnLogin = driver.findElement(By.name("login"));
		//btnLogin.click();
		
		
	
