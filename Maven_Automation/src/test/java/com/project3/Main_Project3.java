package com.project3;

import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Automation_Practise.Baseclass;
import com.pom.Home_Page;
import com.pom3.Net_Home_Page;
import com.pom3.Net_Product_Page;
import com.pom3.Pincode_Page;
import com.pom3.Quantity_Page;
import com.singleton3.Page_Object_Mananger;

public class Main_Project3 extends Baseclass {
	
//	static WebDriver driver = base();
//	static Page_Object_Mananger pom3= new Page_Object_Mananger(driver);
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hari Krishna\\eclipse-workspace\\Maven_Automation\\Drivers\\chromedriver.exe");
		base();
		geturl("https://www.netmeds.com/");
		maximum();
		
		Page_Object_Mananger pom3= new Page_Object_Mananger(driver);
		
		actions("singleclick", pom3.getNethome().getShampoo());
		
		implicitywait(30, TimeUnit.SECONDS);
			
		clickonelement(pom3.getNetproduct().getDoveCheckBox());
		clickonelement(pom3.getNetproduct().getHeadSho());
		clickonelement(pom3.getNetproduct().getHeadshampo());
			
		clear(pom3.getPincodepage().getPincode());
		passingthevalue(pom3.getPincodepage().getPincode(), "600099");
		
		clickonelement(pom3.getPincodepage().getAddToCart());
		clickonelement(pom3.getPincodepage().getPlusButton());
		
		takeScreenShot("C:\\Users\\Hari Krishna\\eclipse-workspace\\Maven_Automation\\Screenshoot\\image1.png");
		
		actions("movetoelement", pom3.getPincodepage().getCart());
		clickonelement(pom3.getPincodepage().getCart());
		
		implicitywait(30, TimeUnit.SECONDS);
		dropDown(pom3.getQuantitypage().getQuantity(), "index", "3");
		
		takeScreenShot("C:\\Users\\Hari Krishna\\eclipse-workspace\\Maven_Automation\\Screenshoot\\image2.png");
		
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\Hari Krishna\\eclipse-workspace\\Maven_Automation\\Drivers\\chromedriver.exe");
//		base();
//		geturl("https://www.netmeds.com/");
//		maximum();
//		
//		Net_Home_Page nhp =new Net_Home_Page(driver);
//		actions("singleclick", nhp.getShampoo());
//		
//		implicitywait(30, TimeUnit.SECONDS);
//		
//		Net_Product_Page npp= new Net_Product_Page(driver);
//		clickonelement(npp.getDoveCheckBox());
//		clickonelement(npp.getHeadSho());
//		clickonelement(npp.getHeadshampo());
//		
//		Pincode_Page pp= new Pincode_Page(driver);
//		
//		clear(pp.getPincode());
//		passingthevalue(pp.getPincode(), "600099");
//		
//		clickonelement(pp.getAddToCart());
//		clickonelement(pp.getPlusButton());
//		
//		takeScreenShot("C:\\Users\\Hari Krishna\\eclipse-workspace\\Maven_Automation\\Screenshoot\\image1.png");
//		
//		actions("movetoelement", pp.getCart());
//		clickonelement(pp.getCart());
//		
//		implicitywait(30, TimeUnit.SECONDS);
//		
//		Quantity_Page qp= new Quantity_Page(driver);
//		dropDown(qp.getQuantity(), "index", "3");
//		
//		takeScreenShot("C:\\Users\\Hari Krishna\\eclipse-workspace\\Maven_Automation\\Screenshoot\\image2.png");

		
	//	robot(KeyEvent.VK_DOWN, KeyEvent.VK_ENTER);
		
//		WebElement shampoo = driver.findElement(By.partialLinkText("Shampoos And Conditioners"));
//		actions("singleclick", shampoo);
//		WebElement doveCheckBox = driver.findElement(By.xpath("//input[@value='Dove']"));
//		clickonelement(doveCheckBox);
//		
//		WebElement headSho = driver.findElement(By.xpath("//input[@value='Head & Shoulders']"));
//		clickonelement(headSho);
//		
//		WebElement headshampo = driver.findElement(By.partialLinkText("Head & Shoulders Anti-Dandruff Shampoo - Cool Menthol 650 ml"));
//		clickonelement(headshampo);
//		WebElement pincode = driver.findElement(By.id("pincode"));
//		clear(pincode);
//		passingthevalue(pincode, "600099");
//		
//		WebElement addToCart = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
//		clickonelement(addToCart);
//		
//		WebElement plusButton = driver.findElement(By.xpath("(//button[@type='button'])[5]"));
//		clickonelement(plusButton);
//		
//		takeScreenShot("C:\\Users\\Hari Krishna\\eclipse-workspace\\Maven_Automation\\Screenshoot\\image1.png");
//		
//		WebElement cart = driver.findElement(By.xpath("//div[@class='text']"));
//		actions("movetoelement", cart);
//		clickonelement(cart);		
//		WebElement quantity = driver.findElement(By.xpath("//select[@name='quantity']"));
//		dropDown(quantity, "index", "3");

		

	
	
	}

}
