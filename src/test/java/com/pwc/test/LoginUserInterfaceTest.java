package com.pwc.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pwc.base.AutomationWrapper;
	
public class LoginUserInterfaceTest extends AutomationWrapper {

	@Test
	public void validateTitleTest()
	{	
		String actualTitle= driver.getTitle();
		Assert.assertEquals(actualTitle, "OrangeHRM");
	}
	
}
