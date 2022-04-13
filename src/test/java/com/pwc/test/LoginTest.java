package com.pwc.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	@Test
	public void invalidCredentialTest() {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("john");
		driver.findElement(By.id("txtPassword")).sendKeys("john123");
		driver.findElement(By.id("btnLogin")).click();
		
		String actualError= driver.findElement(By.id("spanMessage")).getText();
		Assert.assertEquals(actualError, "Invalid credentials");
	}

}
