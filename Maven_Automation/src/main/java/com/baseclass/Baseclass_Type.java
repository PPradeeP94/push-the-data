package com.baseclass;

import java.awt.Robot;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Baseclass_Type {
	
	public static WebDriver driver;

	public static WebDriver base() {
		driver = new ChromeDriver();
		return driver;
	}

	public static void maximum() {
		driver.manage().window().maximize();
	}

	public static void geturl(String url) {
		driver.get(url);
	}

	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void getCurrenturl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public static void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}

	public static void getAttribute(WebElement element, String name) {
		String attribute = element.getAttribute(name);
		System.out.println(attribute);
	}

	public static void navigateto(String url) {
		driver.navigate().to(url);
	}

	public static void navigateBack() {
		driver.navigate().back();
	}

	public static void navigateForward() {
		driver.navigate().forward();
	}

	public static void navigateRefresh() {
		driver.navigate().refresh();
	}

	public static void clickonelement(WebElement element) {
		element.click();
	}

	public static void passingthevalue(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void isEnabled(WebElement element) {
		element.isEnabled();
	}

	public static Boolean isDisplayed(WebElement element) {
	Boolean type=	element.isDisplayed();
	return type;
	}

	public static void isSelected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println(selected);
	}

	public static void implicitywait(int a, TimeUnit TimeUnit) {
		driver.manage().timeouts().implicitlyWait(a, TimeUnit);
	}

	public static void isMultiple(WebElement element) {
		Select sc = new Select(element);
		boolean multiple = sc.isMultiple();
		System.out.println(multiple);

	}

	public static void dropDown(WebElement element, String type, String value) {
		
		Select sc = new Select(element);
		
		if (type.equalsIgnoreCase("index")) {
			int indx = Integer.parseInt(value);
			sc.selectByIndex(indx);
			
		} else if (type.equalsIgnoreCase("value")) {
			sc.selectByValue(value);
		}
		else if (type.equalsIgnoreCase("visibleText")) {
			sc.selectByVisibleText(value);
			
		}
	}

	public static void getAllSelectedOptions(WebElement element) {

		Select sc = new Select(element);

		List<WebElement> allSelectedOptions = sc.getAllSelectedOptions();
		for (WebElement options : allSelectedOptions) {
			String text = options.getText();
			System.out.println(text);
		}
	}

	public static void getOptions(WebElement element) {

		Select sc = new Select(element);

		List<WebElement> options = sc.getOptions();
		for (WebElement opt : options) {
			String text = opt.getText();
			System.out.println(text);
		}
	}

	public static void getFirstSelectedOptin(WebElement element) {
		Select sc = new Select(element);
		WebElement firstSelectedOption = sc.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text);
	}

	public static void actions(String type, WebElement element) {

		if (type.equalsIgnoreCase("singleclick")) {
			Actions ac = new Actions(driver);
			ac.moveToElement(element).click().build().perform();
			
		} else if (type.equalsIgnoreCase("doubleclick")) {
			Actions ac = new Actions(driver);
			ac.doubleClick(element).build().perform();
			
		} else if (type.equalsIgnoreCase("rightclick")) {
			Actions ac = new Actions(driver);
			ac.contextClick(element).build().perform();
			
		} else if (type.equalsIgnoreCase("movetoelement")){
			Actions ac = new Actions(driver);
			ac.moveToElement(element).build().perform();
		}

	}

	public static void clear(WebElement element) {
		element.clear();
	}

	public static void quit() {
		driver.quit();
	}

	public static void close() {
		driver.close();
	}

	public static void promptAlert(WebElement element, String pass) {
		clickonelement(element);
		Alert al = driver.switchTo().alert();
		element.sendKeys(pass);
		al.accept();
	}

	public static void alert(WebElement element, String type) {
		if (type.equalsIgnoreCase("simple alert")) {
			clickonelement(element);
			Alert al = driver.switchTo().alert();
			al.accept();
		} else if (type.equalsIgnoreCase("confirm alert")) {
			clickonelement(element);
			Alert al = driver.switchTo().alert();
			al.dismiss();
		} 
		else if (type.equalsIgnoreCase("prompt alert")) {
			clickonelement(element);
			Alert al = driver.switchTo().alert();
			element.sendKeys("hari");
			al.accept();
		}
	}

	public static void JavascriptExecutor(String script, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(script, element);
	}

	public static void takeScreenShot(String path) throws Throwable {
		TakesScreenshot shot = (TakesScreenshot) driver;
		File scr = shot.getScreenshotAs(OutputType.FILE);
		File des = new File(path);
		FileUtils.copyFile(scr, des);
	}

	public static void windowHandles( ) {

		Set<String> windowHandles = driver.getWindowHandles();
		for (String str : windowHandles) {
			
			String allwindowtitles = driver.switchTo().window(str).getTitle();
			System.out.println(allwindowtitles);
			
	        String multitiles	=	allwindowtitles;

//			if (multitiles.equalsIgnoreCase(Singletitle)) {
//				break;
//			}
		}
	}

	public static void robot(int event, int enter) throws Throwable {

		Robot rb = new Robot();
		rb.keyPress(event);
		rb.keyRelease(event);

		rb.keyPress(enter);
		rb.keyRelease(enter);
	}

	public static void defaultFrame() {
		driver.switchTo().defaultContent();
	}

	public static void parentFrame() {
		driver.switchTo().parentFrame();
	}

	public static void iframe(String type,WebElement element,String value) {

		if (type.equalsIgnoreCase("index")) {
			
			int indx = Integer.parseInt(value);
			
			driver.switchTo().frame(indx);
		}
		
		else if(type.equalsIgnoreCase("id")) {
			 
			 driver.switchTo().frame(value);
		}
		
		else if(type.equalsIgnoreCase("element")) {
			
			driver.switchTo().frame(element.toString());
		}
	
			
	}


  
	

}
