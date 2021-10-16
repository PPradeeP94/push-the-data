package com.topics;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class breowser {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hari Krishna\\eclipse-workspace\\Selenium_Concepts\\New_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.myntra.com/men-tshirts");
//		
//	//	driver.navigate().to("https://www.amazon.in/");
//		
//		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
//		
//		WebElement shirt1 = driver.findElement(By.xpath("(//span[@class='product-discountedPrice'])[1]"));
//		shirt1.click();
//		
//		WebElement shirt2 = driver.findElement(By.xpath("(//span[@class='product-discountedPrice'])[2]"));
//		shirt2.click();
//		
//		WebElement shirt3 = driver.findElement(By.xpath("(//span[@class='product-discountedPrice'])[3]"));
//		shirt3.click();
//		
//		WebElement shirt4 = driver.findElement(By.xpath("(//span[@class='product-discountedPrice'])[4]"));
//		shirt4.click();

//		Set<String> handles = driver.getWindowHandles();
		
//		for(String hand :handles) {
//			String title = driver.switchTo().window(hand).getTitle();
//			System.out.println(title);
//			String a= "Buy Roadster Men Maroon Printed Round Neck T Shirt - Tshirts for Men 2308267 | Myntra";
//			String b= "Buy HRX By Hrithik Roshan Men Teal Blue Printed T Shirt - Tshirts for Men 1700871 | Myntra";
//			driver.close();
//			
//			if (title.equalsIgnoreCase(b)) {
//				break;
//			}
//		}
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", shirt1);
		
//		Actions ac = new Actions(driver);
//		ac.click().perform();
//		ac.sendKeys(Keys.ENTER);
//		ac.sendKeys("sdfgh");
//		ac.sendKeys(shirt1, "fghjkl");
		
		driver.navigate().to("https://en-gb.facebook.com/");
		
		String pageSource = driver.getPageSource();
//		System.out.println(pageSource);
		WebElement cli = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		
		cli.click();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement first = driver.findElement(By.xpath("//div[@class='mbm _1iy_ _a4y rfloat _ohf']//preceding-sibling::div[@class='mbm _1iy_ _a4y _3-90 lfloat _ohe']"));
		
		//first.sendKeys(arg0);
		
		Actions ac = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(first));
	
		ac.sendKeys(first, "hari").perform();
		
		WebElement last = driver.findElement(By.xpath("//div[@class='mbm _1iy_ _a4y _3-90 lfloat _ohe']//following-sibling::div[@class='mbm _1iy_ _a4y rfloat _ohf']"));
		ac.sendKeys(last, "krish").perform();
		
		String windowHandle = driver.getWindowHandle();
		String title = driver.switchTo().window(windowHandle).getTitle();
		System.out.println(title);
		
		WebElement btn = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		
		WebElement findElement = driver.findElement(By.cssSelector(title));
		System.out.println(findElement);

//		WebElement mobile = driver.findElement(By.xpath("//div[@id=\"password_field\"]//preceding::div[@id=\"u_8_e_+m\"]"));
//		Thread.sleep(2000);
//		ac.sendKeys(mobile, "81244").perform();
//		
//		WebElement pass = driver.findElement(By.xpath("//div[@id=\"u_8_h_DF\"]//following::div[@id=\"password_field\"]"));
//		
//		
//		
//		ac.sendKeys(pass, "123456").perform();
//		
		
		
		
		
		
		
		
		
		
		
		

	}
}
