package com.pwc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private static By usernameLocator = By.id("txtUsername");
	private static By passwordLocator = By.name("txtPassword");
	private static By loginLocator = By.xpath("//input[@id='btnLogin']");
	private static By errorLocator = By.id("spanMessage");

	public static void enterUsername(WebDriver driver, String username) {
		driver.findElement(usernameLocator).sendKeys(username);
	}

	public static void enterPassword(WebDriver driver, String password) {
		driver.findElement(passwordLocator).sendKeys(password);
	}

	public static void clickOnLogin(WebDriver driver) {
		driver.findElement(loginLocator).click();
	}

	public static String getInvalidErrorMessage(WebDriver driver) {
		return driver.findElement(errorLocator).getText();
	}
}
