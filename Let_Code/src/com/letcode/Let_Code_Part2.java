package com.letcode;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Let_Code_Part2 {
	
	
	public static void main(String[] args) throws Throwable {
		
    	System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Hari Krishna\\eclipse-workspace\\Let_Code\\Driver\\chromedriver.exe");
	      	
	      	WebDriver driver =new ChromeDriver();
	      	driver.get("https://letcode.in/");
		
	      	driver.manage().window().maximize();
	      	
	      	
//              -------Frame--------	      	
	      	
	      	WebElement workspaceBtn = driver.findElement(By.id("testing"));
	      	workspaceBtn.click();
	      	
	    	JavascriptExecutor js= (JavascriptExecutor) driver;
	      	WebElement scrollFrame = driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[3]/div/div/div/div[1]/app-menu/div/header/p"));
	      
	      	
	      	Thread.sleep(4000);
	      	js.executeScript("arguments[0].scrollIntoView();", scrollFrame);
	      	
	      	WebElement innerHtml = driver.findElement(By.xpath("//a[text()='Inner HTML']"));
	      	innerHtml.click();
	      	
	      	WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='firstFr']"));
	      	driver.switchTo().frame(frame1);
	      	
	      	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

	      	WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='Enter name']"));
	      	firstName.sendKeys("Hari");
	      	
	      	WebElement enterEmail = driver.findElement(By.xpath("(//input[@placeholder='Enter email'])[1]"));
	      	enterEmail.sendKeys("krishna@gmail.");
	      	
	      	driver.switchTo().defaultContent();
	      	
//	      	WebElement frame2 = driver.findElement(By.xpath("//iframe[@class='has-background-white']"));
//	      	driver.switchTo().frame(frame1);
//	      	driver.switchTo().frame(frame2);
//	      	
//	      	WebElement enterEmail2 = driver.findElement(By.xpath("/html/body/app-root/app-innerframe/div/div/div/div/div/input"));
//	      	enterEmail2.sendKeys("hari");
	      	
	      	
	    	WebElement workspaceBtn1 = driver.findElement(By.id("testing"));
	      	workspaceBtn1.click();
	  
//          ------RadioButton--------
	      	
	      	WebElement radioScroll = driver.findElement(By.xpath("(//p[@class='card-header-title is-size-3'])[6]"));
	      	js.executeScript("arguments[0].scrollIntoView();", radioScroll);
	      	
	      	WebElement radioClick = driver.findElement(By.xpath("//a[text()='Toggle']"));
	      	radioClick.click();
	      	
	      	WebElement yes1 = driver.findElement(By.xpath("(//label[@class=\"radio\"])[1]"));
	      	yes1.click();
	      	
	    	WebElement yes2 = driver.findElement(By.xpath("(//label[@class=\"radio\"])[3]"));
	    	boolean selected = yes2.isSelected();       //false
	    	System.out.println(selected);
	    	yes2.click();
	    	
	    	WebElement bug1 = driver.findElement(By.xpath("(//label[@class=\"radio\"])[5]"));
	    	bug1.click();
	    	WebElement bug2 = driver.findElement(By.xpath("(//label[@class=\"radio\"])[6]"));
	    	bug2.click();         //both click
	    	
	    	WebElement yes3 = driver.findElement(By.xpath("(//label[@class=\"radio\"])[7]"));
	    	yes3.click();         //false   
	    	boolean selected2 = yes3.isSelected();
	    	System.out.println(selected2);
	    	
	    	WebElement disable = driver.findElement(By.xpath("(//label[@class=\"radio\"])[11]"));
	    	boolean enabled = disable.isEnabled();      //false
	    	System.out.println(enabled);
	    	
//	    	WebElement checkBox = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
//	    	checkBox.click();
//	    	boolean selected3 = checkBox.isSelected();      //false
//	    	System.out.println(selected3);
	    	
	    	
	       	WebElement workspaceBtn2 = driver.findElement(By.id("testing"));
	      	workspaceBtn2.click();
	 
//          ------Window Handles--------
	      	Actions ac = new Actions(driver);
	      	
	       	WebElement window = driver.findElement(By.xpath("//a[text()='Tabs']"));
	       	ac.moveToElement(window).click().perform();
	      // 	window.click();
	       	
	       	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       	
//	       	WebElement homePageBtn = driver.findElement(By.xpath("//button[@id='home']"));
//	       	homePageBtn.click();
//	       	
//	       	String singleWindow = driver.getWindowHandle();
//	       	String title = driver.switchTo().window(singleWindow).getTitle();
//	       	System.out.println(title);
	       	
//	       	driver.close();
	       	
	       	WebElement multiWindowBtn = driver.findElement(By.xpath("//button[@id='multi']"));
	       	multiWindowBtn.click();
	       	
	       	Set<String> multiWindow = driver.getWindowHandles();
	       	
	       	for (String str : multiWindow) {
				String title = driver.switchTo().window(str).getTitle();
				System.out.println(title);
				
				String a="Window handling - LetCode";
				if (title.equalsIgnoreCase(a)) {
					   break;
				}
			}
	       	driver.quit();
	       	
	       	
	       	
	       	
	       	
	       	
	       	
	       	
	       	
	       	
	       	
	       	
	       	
	       	
	       	
	       	

	    	
	    	
	    	
	    	
	    	
	    	
		      
	      	
	      	
		
		
	}

}
