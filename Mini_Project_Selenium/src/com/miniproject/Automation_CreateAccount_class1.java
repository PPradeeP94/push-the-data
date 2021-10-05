package com.miniproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation_CreateAccount_class1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hari Krishna\\eclipse-workspace\\Mini_Project_Selenium\\New_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com//index.php");
		driver.manage().window().maximize();
		
   //		------Create Account--------
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement singBtn = driver.findElement(By.xpath("//a[@class='login']"));
		singBtn.click();
		WebElement emailField = driver.findElement(By.xpath("//input[@name='email_create']"));
		emailField.sendKeys("krish85185@gmail.com");
		WebElement createBtn = driver.findElement(By.id("SubmitCreate"));
		createBtn.click();
		
  //		------Your Personal Info--------
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement radioBtn = driver.findElement(By.xpath("//*[@id=\"id_gender2\"]"));
		radioBtn.click();
		WebElement firstName = driver.findElement(By.id("customer_firstname"));
		firstName.sendKeys("Hari");
		WebElement lastName = driver.findElement(By.id("customer_lastname"));
		lastName.sendKeys("krishna");
		WebElement passwordField = driver.findElement(By.xpath("//input[@type='password']"));
		passwordField.sendKeys("567890");
		WebElement dropDown = driver.findElement(By.xpath("//select[@name='days']"));
		Select sc1= new Select(dropDown);
		sc1.selectByValue("17");
		WebElement month = driver.findElement(By.id("months"));
		Select sc2= new Select(month);
		sc2.selectByIndex(8);
		WebElement year = driver.findElement(By.id("years"));
		Select sc3 = new Select(year);
		sc3.selectByVisibleText("1996  ");
		WebElement checkbox = driver.findElement(By.id("newsletter"));
		checkbox.click();
		WebElement checkBox2 = driver.findElement(By.id("optin"));
		checkBox2.click();
		
//		    --------------Your Address--------
		
		WebElement firstNameField = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
		firstNameField.clear();
		firstName.sendKeys("Hyder");
		WebElement lastNameField = driver.findElement(By.xpath("(//input[@type='text'])[6]"));
		lastNameField.clear();
	    lastNameField.sendKeys("Garden");
		WebElement company = driver.findElement(By.xpath("(//input[@type='text'])[7]"));
		company.sendKeys("more");
		WebElement address = driver.findElement(By.xpath("(//input[@type='text'])[8]"));
		address.sendKeys("Hyder");
		WebElement addressLine2 = driver.findElement(By.xpath("(//input[@type='text'])[9]"));
		addressLine2.sendKeys("Hyder");
		WebElement city = driver.findElement(By.xpath("(//input[@type='text'])[10]"));
		city.sendKeys("chennai");
		WebElement state = driver.findElement(By.id("id_state"));
		Select sc4 = new Select(state);
		sc4.selectByIndex(5);
		WebElement Zip = driver.findElement(By.xpath("(//input[@type='text'])[11]"));
		Zip.sendKeys("00000");
		WebElement addInfo = driver.findElement(By.id("other"));
		addInfo.sendKeys("Nothing Like Anything");
		WebElement homePhone = driver.findElement(By.xpath("(//input[@type='text'])[12]"));
		homePhone.sendKeys("044123456");
		WebElement mobPhone = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
		mobPhone.sendKeys("12345678");
		WebElement assignAdress = driver.findElement(By.xpath("(//input[@type='text'])[14]"));
		assignAdress.clear();
		assignAdress.sendKeys("chennai");
		WebElement registerBtn = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		registerBtn.click();
		
   //		------Sign Out--------
		
		WebElement signoutBtn = driver.findElement(By.partialLinkText("Sign out"));
		signoutBtn.click();
	
	// ----multiDropdown
    // ----boolean methods
   //  ----
	
	
		
		
		
		
		
		
		
		
		
		
		
		
	   // driver.quit();
	}

}
