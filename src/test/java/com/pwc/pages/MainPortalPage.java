package com.pwc.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPortalPage {
	private static By myInfoLocator = By.xpath("//b[text()='My Info']");

	public static void waitForPresenceOfMyInfo(WebDriver driver) {
		// wait for page load
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(myInfoLocator));
	}

	public static String getMainPageUrl(WebDriver driver) {
		return driver.getCurrentUrl();
	}

	public static void MyInfo(WebDriver driver) {
		driver.findElement(myInfoLocator).click();
	}

}
