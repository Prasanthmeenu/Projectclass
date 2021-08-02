package org.git;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {

public static WebDriver driver;
	
	public static WebDriver browserLaunch(String browsername) {
		switch (browsername) {
		    case "chrome":
		    	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHAMNATH\\eclipse-workspace\\testNG\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		break;
		default:
		
		System.out.println("invalid Browser");
		break;
	}
		return driver;
}

public static void filltextbox(WebElement element, String value) {
	element.sendKeys(value);
}

public static void selectValue(WebElement element, String value ) {
Select s = new Select(element);
s.selectByValue(value);
}
public static void btnclick(WebElement e) {
	e.click();
}
public static String getAttribute(WebElement e) {
	
	String sat= e.getAttribute("NH7XK3L6LZ");
	return sat;
	
}

}

