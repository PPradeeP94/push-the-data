package com.letcode;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class Let_Code_Part1 {

	
        	public static void main(String[] args) throws Throwable {
		
	      	System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Hari Krishna\\eclipse-workspace\\Seiinium_Installation\\Driver\\chromedriver.exe");
	      	
	      	WebDriver driver =new ChromeDriver();
	      	driver.get("https://letcode.in/");
	      	
	//      	      **-------inputs------**
	      	
	      	WebElement workspace = driver.findElement(By.xpath("//a[@id='testing']"));
	      	workspace.click();
	      	
	      	WebElement editBtn = driver.findElement(By.xpath("//a[text()='Edit']"));
	      	editBtn.click();
	      	
	      	WebElement firstName = driver.findElement(By.xpath("//input[@id='fullName']"));
	      	firstName.sendKeys("Hari");
	      	
	      	WebElement keyTab = driver.findElement(By.xpath("//input[@id='join']"));
	      	keyTab.sendKeys(" guy",Keys.TAB);
	      	
	      	WebElement getAtt = driver.findElement(By.xpath("//input[@id='getMe']"));
	       	String attribute = getAtt.getAttribute("value");
	      	System.out.println(attribute);
	      	getAtt.clear();
	      	getAtt.sendKeys("krishna");
	      	
	     	WebElement clearText = driver.findElement(By.xpath("//input[@id='clearMe']"));
	      	clearText.clear();
	      	clearText.sendKeys("Krishna");
	      	
	    	WebElement enable = driver.findElement(By.xpath("//input[@id='noEdit']"));
	    	boolean displayed = enable.isDisplayed();
	    	boolean enabled = enable.isEnabled();
	    	
	    	if (displayed && enabled) {
	    		
	    	    	System.out.println("True");
	            	enable.sendKeys("Krishna");
	    	}
	    	else {
				System.out.println("False");
			}
	    	
        //	                     **-------Buttons------**
	    	
	    	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    //	Thread.sleep(2000);
	    	Navigation nav = driver.navigate();
	      	driver.navigate().back();
	      	
	      	WebElement clickBtn = driver.findElement(By.xpath("//a[text()='Click']"));
	      	clickBtn.click();
	      	
	      	WebElement homePage = driver.findElement(By.xpath("//button[text()='Goto Home']"));
	      	homePage.click();
	      	nav.back();
	      	
	      	WebElement findLocation = driver.findElement(By.xpath("//button[@id='position']"));
	      	findLocation.click();
	      	Point location = findLocation.getLocation();
	      	System.out.println(location);
	      	int x = location.getX();
	      	System.out.println(x);
	      	int y = location.getY();
	      	System.out.println(y);
	      	
	      	WebElement color = driver.findElement(By.xpath("//button[@id='color']"));
	      	color.click();
	      	String cssValue = color.getCssValue("background-color");
	      	System.out.println(cssValue);
	      	
	      	WebElement TallFat = driver.findElement(By.xpath("//button[@id='property']"));
	      	TallFat.click();
	      	Dimension size = TallFat.getSize();
	      	
	      	System.out.println(size);
	      	
	      	int height2 = size.getHeight();
	      	System.out.println(height2);
	      	int width2 = size.getWidth();
	      	System.out.println(width2);
	      	
	      	Rectangle rect = TallFat.getRect();
	      	
	//     	System.out.println(rect);
	      	int height = rect.getHeight();
	      	System.out.println(height);
	      	int width = rect.getWidth();
	      	System.out.println(width);
	      	
	      	WebElement disableBtn = driver.findElement(By.id("isDisabled"));
	    // 	disableBtn.click();
	      	boolean displayed2 = disableBtn.isDisplayed();
	      	boolean enabled2 = disableBtn.isEnabled();
	      	System.out.println(enabled2);
	      	System.out.println(displayed2);
	      	
//	      **-------select------**
	      	nav.back();
	      	WebElement dropdownBtn = driver.findElement(By.xpath("//a[text()='Drop-Down']"));
	      	dropdownBtn.click();
	      	WebElement selectFruit = driver.findElement(By.xpath("//select[@id='fruits']"));
	      	
	      	Select sc1=new Select(selectFruit);
	      	sc1.selectByVisibleText("Pine Apple");
	      	
	      	WebElement mutlidropdown = driver.findElement(By.xpath("//select[@id='superheros']"));
	      	
	    	Select sc2=new Select(mutlidropdown);
	    	boolean multiple = sc2.isMultiple();
	    	System.out.println(" multiple== "+multiple);
	    	
	    	sc2.selectByIndex(6);
	 //   	sc2.selectByValue("9");
	 //   	sc2.selectByVisibleText("Marvelman");
	    	sc2.selectByIndex(16);
	 //   	sc2.selectByValue("4");
	 //   	sc2.selectByVisibleText("Superman");
		      
	    	WebElement language = driver.findElement(By.xpath("//select[@id='lang']"));
	    	Select sc3= new Select(language);
	    	sc3.selectByIndex(4);
	    	List<WebElement> options = sc3.getOptions();
	    	
	    	for (WebElement allselectedEle : options) {
	    		String text = allselectedEle.getText();
	    		System.out.println("language ="+text);
				
			}
	    	WebElement countryBtn = driver.findElement(By.xpath("//select[@id='country']"));
	    	Select sc4= new Select(countryBtn);
	    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    	sc4.selectByVisibleText("India");
	    	WebElement firstSelectedOption = sc4.getFirstSelectedOption();
	    	String text2 = firstSelectedOption.getText();
	    	System.out.println("Country=  "+text2);
	    	
	    	
        //              **-------Alerts------**
	    	
	    	nav.to("https://letcode.in/alert");
	    	WebElement simplealert = driver.findElement(By.xpath("//button[@id='accept']"));
	    	simplealert.click();
	    	Thread.sleep(3000);
	    	Alert alert = driver.switchTo().alert();
	    	alert.accept();
	    	
	    	WebElement confirmAlert = driver.findElement(By.xpath("//button[@id='confirm']"));
	    	
//	    	confirmAlert.click();
//	    	Thread.sleep(3000);
//	  //  	String text = confirmAlert.getText();
//	  //  	System.out.println("ConfirmText ="+text);
//	    	Alert alert2 = driver.switchTo().alert();
//	    	alert2.dismiss();
	    	
	    	
	    	WebElement promptAlert = driver.findElement(By.xpath("//button[@id='prompt']"));
	    	promptAlert.click();
	    	Thread.sleep(3000);
	    	driver.switchTo().alert().sendKeys("Hari");
	    	Thread.sleep(3000);
	    	Alert alert3 = driver.switchTo().alert();
	    	alert3.accept();
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
		   
	      	
	      	
	      	
	      	
	      	
	      	
	      	
	      	
	      	
	      	
	      	
	      	
	      	
	      	
	      	
	      	
	      	
	      	
	      	
	      	
	      	
	      	
	     
   	}      	   

}
