package com.miniproject;

import java.io.File;
import java.io.IOException;
import java.util.List;
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

public class Automation_Sign_account_Class2 {
	
	public static void main(String[] args) throws IOException, Throwable {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hari Krishna\\eclipse-workspace\\Mini_Project_Selenium\\New_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
    //	              -------Sign--------	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement singBtn = driver.findElement(By.xpath("//a[@class='login']"));
		singBtn.click();
		WebElement emailField = driver.findElement(By.xpath("(//input[@data-validate='isEmail'])[2]"));
		emailField.sendKeys("krish8124@gmail.com");
		WebElement passField = driver.findElement(By.xpath("//input[@data-validate='isPasswd']"));
		passField.sendKeys("567890");
		WebElement signBtn = driver.findElement(By.xpath("//button[@name='SubmitLogin']"));
		signBtn.click();
		
   //	              -------Dresses--------
		
		WebElement dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
  //    dresses.click();
		Actions ac = new Actions(driver);
		ac.moveToElement(dresses).build().perform();
		WebElement eveDress = driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[2]"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		ac.moveToElement(eveDress).click().build().perform();
	//	eveDress.click();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		WebElement quickView = driver.findElement(By.xpath("//span[text()='Quick view']"));
	//	ac.moveToElement(quickView).click().build().perform();
	//	quickView.click();
		Thread.sleep(3000);
		js.executeScript("arguments[0].click();", quickView);
			
//		WebElement plusButton = driver.findElement(By.xpath("(//a[@data-field-qty='qty'])[2]"));
//		for (int i = 1; i < 15; i++) {
//		plusButton.click();
//		}
		List<WebElement> findElements = driver.findElements(By.xpath("(//a[@data-field-qty='qty'])[2]"));
		for (int i = 1; i <=15; i++) {
			findElements.get(i).click();
			}
		
		WebElement size = driver.findElement(By.id("group_1"));
		Select sc1= new Select(size);
		sc1.selectByIndex(1);
		WebElement color = driver.findElement(By.id("color_24"));
		color.click();
		
		TakesScreenshot ts =(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Hari Krishna\\eclipse-workspace\\Selenium_Automation\\Store_Screenshot\\image1.png");
		FileUtils.copyFile(src, des);
		
		WebElement addtoCart = driver.findElement(By.xpath("//button[@class='exclusive']"));
		addtoCart.click();
		WebElement checkOut = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		checkOut.click();
		
		WebElement Scrollsummary = driver.findElement(By.xpath("//h1[@id='cart_title']"));
		js.executeScript("arguments[0].scrollIntoView();", Scrollsummary);
	
		TakesScreenshot screenshot2 =(TakesScreenshot) driver;
		File src2 = screenshot2.getScreenshotAs(OutputType.FILE);
		File dest2 =new File("C:\\Users\\Hari Krishna\\eclipse-workspace\\Selenium_Automation\\Store_Screenshot\\image2.png");
		FileUtils.copyFile(src2, dest2);
		
		WebElement checkOut2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		ac.moveToElement(checkOut2).click().perform();
		
		WebElement ScrollAddress = driver.findElement(By.xpath("//h1[@class='page-heading']"));
		js.executeScript("arguments[0].scrollIntoView();", ScrollAddress);
	
		TakesScreenshot screenshot3 =(TakesScreenshot) driver;
		File src3 = screenshot3.getScreenshotAs(OutputType.FILE);
		File dest3 =new File("C:\\Users\\Hari Krishna\\eclipse-workspace\\Selenium_Automation\\Store_Screenshot\\image3.png");
		FileUtils.copyFile(src3, dest3);
		
		WebElement checkOut3 = driver.findElement(By.xpath("//button[@name='processAddress']"));
		ac.moveToElement(checkOut3).click().perform();
		
		WebElement scroolShipping = driver.findElement(By.xpath("//h1[@class='page-heading']"));
		js.executeScript("arguments[0].scrollIntoView();", scroolShipping);
		
		TakesScreenshot screenshot4 =(TakesScreenshot) driver;
		File src4 = screenshot4.getScreenshotAs(OutputType.FILE);
		File dest4 =new File("C:\\Users\\Hari Krishna\\eclipse-workspace\\Selenium_Automation\\Store_Screenshot\\image4.png");
		FileUtils.copyFile(src4, dest4);
		
		WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkBox.click();
		
		WebElement checkOut4 = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		ac.moveToElement(checkOut4).click().perform();
		
		WebElement scrollPayment = driver.findElement(By.xpath("//h1[@class='page-heading']"));
		js.executeScript("arguments[0].scrollIntoView();", scrollPayment);
		
	    TakesScreenshot screenshot5 =(TakesScreenshot) driver;
		File src5 = screenshot5.getScreenshotAs(OutputType.FILE);
    	File dest5 =new File("C:\\Users\\Hari Krishna\\eclipse-workspace\\Selenium_Automation\\Store_Screenshot\\image5.png");
        FileUtils.copyFile(src5, dest5);
		
		
		
		
		
		
		
	}

}
