package com.topics;

import java.awt.AWTException;
import java.awt.Event;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Actions {
	
	public static void main(String[] args) throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Hari Krishna\\eclipse-workspace\\Selenium_Concepts\\New_Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		WebElement findElement = driver.findElement(By.xpath("//input[@name='email']"));
		Actions ac = new Actions(driver);
		ac.sendKeys("hari").perform();
		

		Robot rb = new Robot();
		Thread.sleep(3000);
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(4000);
		rb.keyPress(KeyEvent.VK_A);
	//	rb.keyRelease(KeyEvent.VK_A);
		rb.keyPress(KeyEvent.VK_B);
	//	rb.keyRelease(KeyEvent.VK_B);
		rb.keyPress(KeyEvent.VK_C);
	//	rb.keyRelease(KeyEvent.VK_C);
		
//		WebElement findElement3 = driver.findElement(By.xpath("//input[@name='pass']"));
		
		WebElement findElement2 = driver.findElement(By.xpath("//button[@type='submit']"));
		findElement2.click();

	}

}
