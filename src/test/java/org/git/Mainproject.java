package org.git;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mainproject {

	public static void main (String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHAMNATH\\eclipse-workspace\\testNG\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		WebElement Search = driver.findElement(By.id("twotabsearchtextbox"));
		Search.sendKeys("iphone 12 pro");
	}
	
}
