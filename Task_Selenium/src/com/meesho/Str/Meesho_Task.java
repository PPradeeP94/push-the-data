package com.meesho.Str;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Meesho_Task {
	
	static int indexvalue;
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Hari Krishna\\eclipse-workspace\\Task_Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://meesho.com/sunglasses-men/pl/n6x3p");
	
		/*
		List<WebElement> sunglases = driver.findElements(By.xpath("//div[@class='actual-cost']"));
		
		List<Integer> product =new ArrayList<Integer>();
		
		for (int i = 0; i <sunglases.size(); i++) {
			WebElement glasses = sunglases.get(i);
			String text = glasses.getText();
			String replace = text.replaceAll("[^0-9]", "");
		//	System.out.println(replace);
			int parseInt = Integer.parseInt(replace);
			product.add(parseInt);
		}
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The Price");
		int nextInt = sc.nextInt();
		System.out.println(nextInt);
		
		for (int j = 0; j <sunglases.size() ; j++) {
			Integer rate = product.get(j);
			if (rate==nextInt) {
				List<WebElement> glassRate = driver.findElements(By.xpath("//div[@class='actual-cost']"));
				WebElement element = glassRate.get(j);
				element.click();
			}
		}
		Thread.sleep(3000);
		//		System.out.println("Minimum"+Collections.min(product));
       //		System.out.println("Maximum"+Collections.max(product));
      //		System.out.println(product);

		
		*/
	
		List<WebElement> glassNames = driver.findElements(By.xpath("//h4[@class='plp-card-title-desktop']"));		
		
		for (int i = 0; i < glassNames.size(); i++) {
			WebElement name = glassNames.get(i);
			String text = name.getText();
			System.out.println(text);
			
			if (text.contains("Sunglasses")) {
				indexvalue =i;
				System.out.println("Fancy index ="+indexvalue);
				
			List<WebElement> fixedName = driver.findElements(By.xpath("//h4[@class='plp-card-title-desktop']"));
			WebElement element = fixedName.get(indexvalue);
			
			Thread.sleep(3000);
			
			element.click();
			
			Thread.sleep(3000);
			}
		}
		
		
		
	/*
		
		driver.get("https://www.shopclues.com/food-and-beverages.html?sort_by=bestsellers&sort_order=desc&sp%5b%5d=49,9999&fsrc=sort_price");
	List<WebElement> glassNames = driver.findElements(By.xpath("//div[@class='column col3']"));		
		
		for (int i = 0; i < glassNames.size(); i++) {
			WebElement name = glassNames.get(i);
			String text = name.getText();
	//		System.out.println(text);
			
			if (text.contains("Brij Gwala")) {
				indexvalue =i;
				System.out.println("Fancy index ="+indexvalue);
				
			List<WebElement> fixedName = driver.findElements(By.xpath("//div[@class='column col3']"));
			WebElement element = fixedName.get(indexvalue);
			
			Thread.sleep(3000);
			
			element.click();
			
			Thread.sleep(3000);
			}
		}
	*/
		
//		WebElement Men = driver.findElement(By.xpath("(//span[@class='nav-head-item pointer nonHover'])[4]"));
//		Actions ac= new Actions(driver);
//		ac.moveToElement(Men).perform();
//		Thread.sleep(2000);
//		WebElement watches = driver.findElement(By.linkText("Watches"));
//		ac.moveToElement(watches).click().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}}
	


