package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;
public class Fact_ory {

//	String email;
//	String password;
//	
//	public void factoryTest(String email, String password) {
//		this.email=email;
//		this.password=password;
//
//	}
	
	@Test()
	public void login(String email, String password) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hari Krishna\\eclipse-workspace\\Test_NG\\New_Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement singBtn = driver.findElement(By.xpath("//a[@class='login']"));
		singBtn.click();
		WebElement emailField = driver.findElement(By.xpath("(//input[@data-validate='isEmail'])[2]"));
		emailField.sendKeys(email);
		WebElement passField = driver.findElement(By.xpath("//input[@data-validate='isPasswd']"));
		passField.sendKeys(password);
		WebElement signBtn = driver.findElement(By.xpath("//button[@name='SubmitLogin']"));
		signBtn.click();

	}


}
