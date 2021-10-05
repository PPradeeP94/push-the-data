package com.Automation_Practise;

import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project1 extends Baseclass{
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hari Krishna\\eclipse-workspace\\Mini_Project_Selenium\\Drivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		base();
		driver.get("http://automationpractice.com//index.php");
		
		maximum();
		
   //		------Create Account--------
		implicitywait(30, TimeUnit.SECONDS);
		
		
		WebElement singBtn = driver.findElement(By.xpath("//a[@class='login']"));
		clickonelement(singBtn);
		WebElement emailField = driver.findElement(By.xpath("//input[@name='email_create']"));
	//	emailField.sendKeys("krish85185@gmail.com");
		passingthevalue(emailField, "krish0125@gmail.com");
		WebElement createBtn = driver.findElement(By.id("SubmitCreate"));
		clickonelement(createBtn);
		
  //		------Your Personal Info--------
		implicitywait(30, TimeUnit.SECONDS);
		
		WebElement radioBtn = driver.findElement(By.xpath("//*[@id=\"id_gender2\"]"));
		isSelected(radioBtn);
		clickonelement(radioBtn);
		WebElement firstName = driver.findElement(By.id("customer_firstname"));
		passingthevalue(firstName, "Hari");
		WebElement lastName = driver.findElement(By.id("customer_lastname"));
		passingthevalue(lastName, "krishna");
		WebElement passwordField = driver.findElement(By.xpath("//input[@type='password']"));
		passingthevalue(passwordField, "567890");
		
		WebElement dropDown = driver.findElement(By.xpath("//select[@name='days']"));
//		dropDownvalue(dropDown, "17");
//		dropDown(dropDown, "value" , "17");
		dropDown(dropDown, "value", "17");
		
		
		WebElement month = driver.findElement(By.id("months"));
		dropDown(dropDown, "index", "8");
		
		isMultiple(month);
		
		getFirstSelectedOptin(month);
		
		getOptions(month);
		
		getAllSelectedOptions(month);
	
		WebElement year = driver.findElement(By.id("years"));
//		dropDowntext(year, "1996  ");
		dropDown(dropDown, "visibletext", "1996  ");
		
		WebElement checkbox = driver.findElement(By.id("newsletter"));
		clickonelement(checkbox);
		WebElement checkBox2 = driver.findElement(By.id("optin"));
		clickonelement(checkBox2);
		
//		    --------------Your Address--------
		
		WebElement firstNameField = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
		clear(firstNameField);
		passingthevalue(firstNameField, "Hari");
		
		WebElement lastNameField = driver.findElement(By.xpath("(//input[@type='text'])[6]"));
		clear(lastNameField);
		passingthevalue(lastNameField, "krish");
		
		WebElement company = driver.findElement(By.xpath("(//input[@type='text'])[7]"));
		passingthevalue(company, "More");
		
		WebElement address = driver.findElement(By.xpath("(//input[@type='text'])[8]"));
		passingthevalue(address, "Hyder");
		
		WebElement addressLine2 = driver.findElement(By.xpath("(//input[@type='text'])[9]"));
		passingthevalue(addressLine2, "Hyder");
		
		WebElement city = driver.findElement(By.xpath("(//input[@type='text'])[10]"));
		passingthevalue(city, "chennai");
		
		WebElement state = driver.findElement(By.id("id_state"));
	//	sc4.selectByIndex(5);
	//	dropDownindex(state, 5);
		dropDown(dropDown, "index", "5");
		
		WebElement Zip = driver.findElement(By.xpath("(//input[@type='text'])[11]"));
		passingthevalue(Zip, "00000");
		
		WebElement addInfo = driver.findElement(By.id("other"));
		passingthevalue(addInfo, "Nothing Like Anything");
		
		WebElement homePhone = driver.findElement(By.xpath("(//input[@type='text'])[12]"));
		passingthevalue(homePhone, "044123456");
		
		WebElement mobPhone = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
		passingthevalue(mobPhone, "12345678");
		
		WebElement assignAdress = driver.findElement(By.xpath("(//input[@type='text'])[14]"));
		clear(assignAdress);
		passingthevalue(assignAdress, "chennai");
		
		WebElement registerBtn = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		clickonelement(registerBtn);
		
   //		------Sign Out--------
		
		WebElement signoutBtn = driver.findElement(By.partialLinkText("Sign out"));
		clickonelement(signoutBtn);
		
		
		
		
	// ----multiDropdown
    // ----boolean methods
     

		
	


	}

	

}
