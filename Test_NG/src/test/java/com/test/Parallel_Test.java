



package com.test;

import java.util.concurrent.TimeUnit;import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.testng.annotations.Test;

public class Parallel_Test {

	//@Test
	private void login() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hari Krishna\\eclipse-workspace\\Test_NG\\New_Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement singBtn = driver.findElement(By.xpath("//a[@class='login']"));
		singBtn.click();
		WebElement emailField = driver.findElement(By.xpath("(//input[@data-validate='isEmail'])[2]"));
		emailField.sendKeys("krish8124@gmail.com");
		WebElement passField = driver.findElement(By.xpath("//input[@data-validate='isPasswd']"));
		passField.sendKeys("567890");
		WebElement signBtn = driver.findElement(By.xpath("//button[@name='SubmitLogin']"));
		signBtn.click();
	}
	
	

}
