package com.Automation_Practise;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project2 extends Baseclass {
	
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hari Krishna\\eclipse-workspace\\Mini_Project_Selenium\\Drivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		base();
		driver.get("http://automationpractice.com/index.php");
		
		maximum();
		getTitle();
		getCurrenturl();
		
		
		
    //	              -------Sign--------	
		implicitywait(30, TimeUnit.SECONDS);
		
		WebElement signBtn1 = driver.findElement(By.xpath("//a[@class='login']"));
		clickonelement(signBtn1);
		
		WebElement emailField = driver.findElement(By.xpath("(//input[@data-validate='isEmail'])[2]"));
		passingthevalue(emailField, "krish8124@gmail.com");
		
		WebElement passField = driver.findElement(By.xpath("//input[@data-validate='isPasswd']"));
		passingthevalue(passField, "567890");
		
		WebElement signBtn2 = driver.findElement(By.xpath("//button[@name='SubmitLogin']"));
		clickonelement(signBtn2);
		
   //	              -------Dresses--------
		
		WebElement dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		actions("click", dresses);
		
		WebElement eveDress = driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[2]"));
		actions("single click", eveDress);
		
		implicitywait(30, TimeUnit.SECONDS);
		actions("single click", eveDress);

		WebElement quickView = driver.findElement(By.xpath("//span[text()='Quick view']"));
		JavascriptExecutor("arguments[0].click();", quickView);
			
		WebElement plusButton = driver.findElement(By.xpath("(//a[@data-field-qty='qty'])[2]"));
		for (int i = 1; i < 15; i++) {
		clickonelement(plusButton);
		}
		
		WebElement size = driver.findElement(By.id("group_1"));
//		dropDownindex(size, 1);
		dropDown(size, "index", "1");
		
		WebElement color = driver.findElement(By.id("color_24"));
		clickonelement(color);
	
		takeScreenShot("C:\\Users\\Hari Krishna\\eclipse-workspace\\Maven_Automation\\Screenshoot\\image1.png");
		
		WebElement addtoCart = driver.findElement(By.xpath("//button[@class='exclusive']"));
		clickonelement(addtoCart);
		
		WebElement checkOut = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		clickonelement(checkOut);
		
		WebElement Scrollsummary = driver.findElement(By.xpath("//h1[@id='cart_title']"));
		JavascriptExecutor("arguments[0].scrollIntoView();", Scrollsummary);
	
		takeScreenShot("C:\\Users\\Hari Krishna\\eclipse-workspace\\Maven_Automation\\Screenshoot\\image2.png");
		
		WebElement checkOut2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		actions("single click", checkOut2);
		
		WebElement ScrollAddress = driver.findElement(By.xpath("//h1[@class='page-heading']"));
		JavascriptExecutor("arguments[0].scrollIntoView();", ScrollAddress);
	
		takeScreenShot("C:\\Users\\Hari Krishna\\eclipse-workspace\\Maven_Automation\\Screenshoot\\image3.png");
		
		WebElement checkOut3 = driver.findElement(By.xpath("//button[@name='processAddress']"));
		actions("single click", checkOut3);
		
		WebElement scroolShipping = driver.findElement(By.xpath("//h1[@class='page-heading']"));
		JavascriptExecutor("arguments[0].scrollIntoView();", scroolShipping);
		
		takeScreenShot("C:\\Users\\Hari Krishna\\eclipse-workspace\\Maven_Automation\\Screenshoot\\image4.png");
		
		WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		clickonelement(checkBox);
		
		WebElement checkOut4 = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		actions("single click", checkOut4);
		
		WebElement scrollPayment = driver.findElement(By.xpath("//h1[@class='page-heading']"));
		JavascriptExecutor("arguments[0].scrollIntoView();", scrollPayment);
		
	    takeScreenShot("C:\\Users\\Hari Krishna\\eclipse-workspace\\Maven_Automation\\Screenshoot\\image5.png");
	    
	    getAttribute(scrollPayment, "class");
	    getText(scrollPayment);
	    
	//    alert(element, type);
	    
//	    frame(scrollPayment, 0, null);
	    
	    
	    
//	      browserLaunch 
//	      Frames
	    
//	      Explicitly wait
//	      fluent wait

	    
//        get	    
//	      window Handles
//	      Robot	    
//	      alert	    
//	      get options
//	      get firstselectedoption
//	      get all selected options 
//	      is multiple
	      
	    
	    
			
	}


}
