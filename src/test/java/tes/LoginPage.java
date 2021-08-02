package tes;

import java.util.Date;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Mainprogram.Jbs;
import Mainprogram.Pom;

public class LoginPage extends Jbs {

@BeforeClass
private void Beforeclass() {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHAMNATH\\eclipse-workspace\\testNG\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	
}
@AfterClass
private void Afterclass() {
System.out.println("After class....");
}
@BeforeMethod
private void BeforeMethod() {
	System.out.println("Test Starts ...." + new Date());
	System.out.println("Before Method....");
}

@AfterMethod
private void AfterMethod () {
	System.out.println("Test End ...." + new Date());	
System.out.println("After Method....");
}
	
@Test
private void Test() {
	launchurl("https://en-gb.facebook.com/");
	SoftAssert s =new SoftAssert();

	s.assertTrue(driver.getCurrentUrl().contains("facebook"), "verify url");
	Pom p= new Pom();
	filltextbox(p.getTxtusername(), "Saliki");
	s.assertEquals("saliki",  p.getTxtusername().getAttribute("value"), "verify username");
	
	filltextbox(p.getTxtpassword(), "12345");
	s.assertEquals("1234",  p.getTxtpassword().getAttribute("value"), "verify password");
	btnclick(p.getBtnlogin());
	
	System.out.println("test");
}
	
@Test
private void Test2() {
	System.out.println("test2");
}	
@Test
private void Test3() {
	System.out.println("test3");
}}
	
	
//	WebElement txtusername = driver.findElement(By.id("email"));
//	txtusername.sendKeys("saliki");
//	
//	
//	WebElement txtpassword = driver.findElement(By.id("pass"));
//	txtpassword.sendKeys("12345");
//	
	
//	WebElement login = driver.findElement(By.name("login"));
//	login.click();


