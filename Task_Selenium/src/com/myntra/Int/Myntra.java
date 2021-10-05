package com.myntra.Int;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {
	
	static int indexvalue;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Hari Krishna\\eclipse-workspace\\Selenium_Workload\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
		driver.manage().window().maximize();
		
		Actions ac = new Actions(driver);
		
		WebElement men = driver.findElement(By.xpath("//a[@data-group='men']"));
		ac.moveToElement(men).build().perform();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement jackets = driver.findElement(By.linkText("Jackets"));
		ac.moveToElement(jackets).click().build().perform();
		
		List<Integer> jacketrate = new ArrayList<Integer>();
		
		List<WebElement> jacketRates = driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span[@class='product-discountedPrice']"));
		for (int i = 0; i < jacketRates.size(); i++) {
			String text = jacketRates.get(i).getText();
			String replace = text.replaceAll("[^0-9]", "");
			int parseInt = Integer.parseInt(replace);
			jacketrate.add(parseInt);
		}
	      	System.out.println(jacketrate);
	      int nextInt =2199;
//	      	Scanner sc =new Scanner(System.in);
//	      	System.out.println("Enter The Rate");
//	      	int nextInt = sc.nextInt();
//	      	System.out.println(nextInt);
	      	
	      	for (int j = 0; j < jacketRates.size(); j++) {
				Integer jacketPrice = jacketrate.get(j);
				if (jacketPrice==nextInt) {
					
					
				List<WebElement> jacketCount = driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span[@class='product-discountedPrice']"));
				WebElement element = jacketCount.get(j);
				element.click();

		
				}
	      	}
		
		
		
		
	//	driver.quit();
		
		
		
		
		
		
		
		
		
	}

}
