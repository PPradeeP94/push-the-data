package com.topics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class Launch {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hari Krishna\\eclipse-workspace\\Selenium_Concepts\\New_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/men-tshirts");

		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		List<WebElement> tagname = driver.findElements(By.xpath("//label[contains(@class,'filters-label common-customCheckbox')]"));
		
		int size = tagname.size();
		System.out.println(size);
		
		for (int i = 0; i < tagname.size(); i++) {
			WebElement webElement = tagname.get(i);
			webElement.click();
		}
	}

}
