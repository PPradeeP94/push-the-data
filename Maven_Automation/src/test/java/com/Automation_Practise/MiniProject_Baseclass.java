package com.Automation_Practise;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MiniProject_Baseclass extends Baseclass{
	
	

	public static void main(String[] args) throws Throwable   {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari Krishna\\eclipse-workspace\\Maven_Automation\\Drivers\\chromedriver.exe");
	//	WebDriver driver=new ChromeDriver();
		base();
		driver.get("https://letcode.in/frame");
		
		maximum();

    //            **-------Frames------**
	//	id=firstFr
		WebElement single = driver.findElement(By.xpath("//iframe[@id='firstFr']"));
	//	iframe("element", single, null, 0);	
	//	iframe("id", null, "firstFr", 0);
	//	iframes("index", null, null, 1);
	
		
		WebElement textBox = driver.findElement(By.xpath("//input[@placeholder='Enter name']"));
		textBox.sendKeys("Hari");
	//	robot(KeyEvent.VK_DOWN, KeyEvent.VK_ENTER);
		

		
//		WebElement singleframe = driver.findElement(By.xpath("//iframe[@name='firstFr']"));
//		driver.switchTo().frame(singleframe);
//		driver.switchTo().frame("firstFr");
//		driver.switchTo().frame(0);
	
	//	iframe("index", "0");
	//	iframe("id", "firstFr");
		
//		iframe("element", singleframe);
//		iframe("id", singleframe);
//		iframe("index", singleframe);
		
//		iframe("index", null, "0");
//		iframe("id", null, "firstFr");
//		iframe("element", singleframe, "0");
//		
//	
//		WebElement enterName = driver.findElement(By.xpath("//input[@placeholder='Enter name']"));
//		implicitywait(30, TimeUnit.SECONDS);
//		enterName.sendKeys("hari");
//
//		WebElement lastName = driver.findElement(By.xpath("(//input[@placeholder='Enter email'])[1]"));
//		lastName.sendKeys("@gamil.com");
		
		
		
		
		
		//                window handles
		

//       	WebElement multiWindowBtn = driver.findElement(By.xpath("//button[@id='multi']"));
//       	multiWindowBtn.click();
//       	
//       	windowHandles();
//       	String a="Window handling - LetCode";
//       	driver.switchTo().window(a);
//       	 	Set<String> multiWindow = driver.getWindowHandles();
       	
//       	for (String str : multiWindow) {
//			String title = driver.switchTo().window(str).getTitle();
//			System.out.println(title);
//			
//			String a="Window handling - LetCode";
//			if (title.equalsIgnoreCase(a)) {
//				   break;
//			}
//		}
	    	
	//	frame(element, value);
		
}

	

	
	
}