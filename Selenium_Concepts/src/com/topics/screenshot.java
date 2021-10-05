package com.topics;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hari Krishna\\eclipse-workspace\\Selenium_Concepts\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	//	WebDriver fire = WebDriver();
		driver.get("https://www.myntra.com/");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File f1 = ts.getScreenshotAs(OutputType.FILE);
		File f2 = new File("C:\\Users\\Hari Krishna\\eclipse-workspace\\Selenium_Concepts\\screenshot.png");
		FileUtils.copyFile(f1, f2);
	//	FileUtils.file
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("(//h4[@class='text-banner-title'])[1]"));
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView();", element);
		String text = element.getText();
		Dimension size = element.getSize();
		System.out.println(text+size);
		
		File fs = element.getScreenshotAs(OutputType.FILE);
		File fd = new File("C:\\Users\\Hari Krishna\\eclipse-workspace\\Selenium_Concepts\\screenshot\\image2.png");
		FileUtils.copyFile(fs, fd);
		
		List<WebElement> findElements = driver.findElements(By.xpath(""));

		
		
	}

}
