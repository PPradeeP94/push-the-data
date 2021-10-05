package com.project3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Automation_Practise.Baseclass;

public class Main_Project2 extends Baseclass {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hari Krishna\\eclipse-workspace\\Maven_Automation\\Drivers\\chromedriver.exe");
		base();
		geturl("https://pharmeasy.in/");
		maximum();
		
		WebElement order = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		clickonelement(order);
		
		WebElement nutrition = driver.findElement(By.partialLinkText("Nutrition & Fitness Supplements"));
		clickonelement(nutrition);
		
		implicitywait(20, TimeUnit.SECONDS);
		WebElement nutritionDrinks = driver.findElement(By.xpath("//div[text()='Nutrition Drinks']"));
		clickonelement(nutritionDrinks);
		isSelected(nutritionDrinks);
		
		implicitywait(20, TimeUnit.SECONDS);
		
//		WebElement rate1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[8]"));
//		
//		JavascriptExecutor("arguments[0].scrollIntoView();", rate1);
//		clickonelement(rate1);
		
		WebElement rate2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[9]"));
		clickonelement(rate2);
		
		WebElement protienEx = driver.findElement(By.partialLinkText("Groviva Chocolate Child Nutrition Supplement Jar Of 400 G"));
		clickonelement(protienEx);
		
		WebElement vanilla = driver.findElement(By.xpath("(//span[@class=\"jss242 _10O8a _3W2Ct\"])[4]"));
		clickonelement(vanilla);
		WebElement G200 = driver.findElement(By.xpath("(//span[@class=\"jss267 _10O8a _3W2Ct\"])[5]"));
		clickonelement(G200);
		WebElement addToCart = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		clickonelement(addToCart);

	//	dropDown(addToCart, "index", "6");
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
