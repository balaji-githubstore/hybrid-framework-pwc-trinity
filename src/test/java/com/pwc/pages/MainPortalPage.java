package com.pwc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPortalPage {
	private static By myInfoLocator = By.linkText("My Info");

	public static String getMainPageUrl(WebDriver driver) {
		return driver.getCurrentUrl();
	}

	public static void MyInfo(WebDriver driver) {
		driver.findElement(myInfoLocator).click();
	}

}
