package org.withknown;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Withknown implements IRetryAnalyzer {
int minCount = 0, maxCount = 3;

	@Override
	public boolean retry(ITestResult result) {
		if (minCount<maxCount) {
			
			minCount++;
			return true;	
		}
		
		return false;
	}

}
