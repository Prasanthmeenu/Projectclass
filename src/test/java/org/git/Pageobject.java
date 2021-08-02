package org.git;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pageobject {
	

@FindBy(id= "twotabsearchtextbox")
private WebElement search;

@FindBy(xpath= "//input[@type='submit'][1]")
private WebElement click;
	

}
