package com.letcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Let_Code_Part3 {
	
		
		public static void main(String[] args) throws Throwable {
			
	      	System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Hari Krishna\\eclipse-workspace\\Let_Code\\Driver\\chromedriver.exe");
	      	
	      	WebDriver driver =new ChromeDriver();
	      	driver.get("https://letcode.in/test");
		
	      	driver.manage().window().maximize();
	      	
	      	WebElement drag = driver.findElement(By.xpath("(//a[@class='card-footer-item'])[9]"));
	      	drag.click();
	      	
	      	WebElement dragOption = driver.findElement(By.id("sample-box"));
	      	WebElement dropOPtion = driver.findElement(By.xpath("//label[@class='label']"));
	      	
	      	Actions ac = new Actions(driver);
	      	ac.dragAndDrop(dragOption, dropOPtion);
	      	
	      	driver.navigate().back();
	      	
	      	WebElement drop = driver.findElement(By.xpath("(//a[@class='card-footer-item'])[10]"));
	      	drop.click();
	      	WebElement dragpOPtion1 = driver.findElement(By.id("draggable"));
	      	WebElement dropOption1 = driver.findElement(By.id("droppable"));
	      	
	      	ac.dragAndDrop(dragpOPtion1, dropOption1);
	      	
	      	
	      	
	      	
	    
	}

}
