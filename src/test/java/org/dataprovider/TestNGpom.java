package org.dataprovider;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Mainprogram.Jbs;

public class TestNGpom extends Jbs {

	public TestNGpom() {
	PageFactory.initElements(driver, this);
	}

@FindBy(id= "email")
private WebElement txtusername;

public WebElement getTxtusername() {
	return txtusername;
}

public WebElement getTxtpassword() {
	return txtpassword;
}

public WebElement getBtnlogin() {
	return btnlogin;
}

@FindBy(id= "pass")
private WebElement txtpassword;

@FindBy(name= "login")
private WebElement btnlogin;
}
