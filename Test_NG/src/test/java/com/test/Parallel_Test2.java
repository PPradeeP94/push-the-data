package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Parallel_Test2 {
	
	@Test
	private void dresses() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hari Krishna\\eclipse-workspace\\Test_NG\\New_Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement emailField = driver.findElement(By.id("username"));
		emailField.sendKeys("Hari0103");
		WebElement passField = driver.findElement(By.id("password"));
		passField.sendKeys("567890");
		WebElement signBtn = driver.findElement(By.id("login"));
		signBtn.click();
	

	

	}

}
