package com.pwc.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pwc.base.AutomationWrapper;
import com.pwc.utilities.DataUtils;
	
public class LoginUserInterfaceTest extends AutomationWrapper {

	@Test(dataProviderClass = DataUtils.class,dataProvider = "commonDataProvider")
	public void validateTitleTest(String expectedTitle)
	{	
		String actualTitle= driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
}
