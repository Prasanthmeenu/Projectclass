package org.withoutknown;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
import org.withknown.Withknown;

public class withoutknown implements IAnnotationTransformer{

	@Override
	public void transform(ITestAnnotation a, Class testClass, Constructor testConstructor, Method testMethod) {
		
		a.setRetryAnalyzer(Withknown.class);
		
	}

}
