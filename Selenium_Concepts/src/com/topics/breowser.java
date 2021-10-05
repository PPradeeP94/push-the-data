package com.topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class breowser {
	
	public static WebDriver driver;
	
	public static WebDriver launch() {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Hari Krishna\\eclipse-workspace\\Selenium_Concepts\\New_Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");

//	}
//	private static void fashion() {
		
		WebElement findElement = driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/a"));
		findElement.click();
		
		driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[2]/div/a")).click();

		return driver;
		
	}
	
	public static void main(String[] args) {
		launch();
	//	fashion();
	}
	
}
