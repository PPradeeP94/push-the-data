package com.test;

import java.awt.event.KeyEvent;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Excepted_Exception {
	
	@Test(expectedExceptions = NoSuchElementException.class)
	public void findelements() {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Hari Krishna\\eclipse-workspace\\Test_NG\\New_Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement searchBar = driver.findElement(By.name("q2"));
		searchBar.sendKeys("cricket",Keys.ENTER);
		
		WebElement cricket = driver.findElement(By.xpath("(//input[@value='cricket'])[1]"));
		Dimension size = cricket.getSize();
		System.out.println(size);

	}

}
