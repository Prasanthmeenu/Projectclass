package org.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Mainprogram.Jbs;
import Mainprogram.Pom;
public class Facebook extends Jbs {
	
@Test(dataProvider="login")
	private void Test(String user, String pass) {
		
	        browserLaunch("chrome");
	        launchurl("https://en-gb.facebook.com/");
		    Pom p= new Pom();
			filltextbox(p.getTxtusername(), user);
			filltextbox(p.getTxtpassword(), pass);
}
@DataProvider(name="login")	
			private Object[][] data() {
				
				Object[][] d= new Object[][] {
					
					{"prasanth", "12345"},
					{"stephen", "12345"},
					{"reshmi", "12345"},
					{"prem", "12345"}
					
				};
					return d;
		
			}
}
