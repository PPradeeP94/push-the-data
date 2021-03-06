package com.test;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {

	@Test(invocationCount = 3,threadPoolSize = 2)//dataProvider = "inputData")
	public void login() {//String email, String password) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hari Krishna\\eclipse-workspace\\Test_NG\\New_Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement singBtn = driver.findElement(By.xpath("//a[@class='login']"));
		singBtn.click();
		WebElement emailField = driver.findElement(By.xpath("(//input[@data-validate='isEmail'])[2]"));
		emailField.sendKeys("email");
		WebElement passField = driver.findElement(By.xpath("//input[@data-validate='isPasswd']"));
		passField.sendKeys("password");
		WebElement signBtn = driver.findElement(By.xpath("//button[@name='SubmitLogin']"));
		signBtn.click();

	}
//
//	@DataProvider
//	public Object[][] inputData() {
//
//		return new Object[][] { { "krish8234@gmail.com", "567890" }, 
//			{ "krish8124@gmail.com", "567890" },
//				{ "krish8124@gmail.com", "567890" } };
//
//	}
//
//	@Test
//	public void logout() {
//
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\Hari Krishna\\eclipse-workspace\\Test_NG\\New_Driver\\chromedriver.exe");
//
//		WebDriver driver = new ChromeDriver();
//
//		driver.get("http://automationpractice.com/index.php");
//		driver.manage().window().maximize();
//
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//
//		WebElement singBtn = driver.findElement(By.xpath("//a[@class='login']"));
//		singBtn.click();
//		WebElement emailField = driver.findElement(By.xpath("(//input[@data-validate='isEmail'])[2]"));
//		emailField.sendKeys("krish8124@gmail.com");
//		WebElement passField = driver.findElement(By.xpath("//input[@data-validate='isPasswd']"));
//		passField.sendKeys("567890");
//		WebElement signBtn = driver.findElement(By.xpath("//button[@name='SubmitLogin']"));
//		signBtn.click();
//
//	}

}
