package com.Test_NG;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Baseclass.Base_Class;
import com.pom.Dresses_Page;
import com.pom.LogInPage;
import com.pom.Payment_Method;
import com.pom.Quick_Page;
import com.pom.singInButton;
import com.singleton.Page_Object_Mananger;

public class Test_Ng_Automation extends Base_Class {

	public static WebDriver driver=getBrowser("chrome");
	Page_Object_Mananger pom = new Page_Object_Mananger(driver);

//	@BeforeSuite
//	private void launch() {
//		getBrowser("chrome");
//
//	}

	@BeforeTest
	private void url() {
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	}

	@BeforeClass
	private void singin() {

		clickonelement(pom.getSb().getSignInBtn());
	}

	@Test(priority = -1,dataProvider = "validData")
	private void logInPage(String username, String password) {

		passingthevalue(pom.getLp().getEmailField(), username);
		passingthevalue(pom.getLp().getPasswordField(), password);
		clickonelement(pom.getLp().getSigInButton());
	}

	@DataProvider
	private Object[][] validData() {
		return new Object[][] {
			
			{"krish8124@gmail.com","567890"}
			
		//	{"krish8124@gmail.com","567890"}
			
		};
	}

	@Test(priority = 0)
	private void dressesPage() throws Throwable {

		actions("movetoelement", pom.getDp().getDresses());
		implicitywait(20, TimeUnit.SECONDS);
		actions("singleclick", pom.getDp().getEveningDresses());
	}

	@Test(priority = 1)
	private void quickPage() throws Throwable {

		JavascriptExecutor("arguments[0].click();", pom.getQp().getQuickview());
	}

	@Test(priority = 2, invocationCount = 14)
	private void plusButton() throws Throwable {
		clickonelement(pom.getPb().getPlusbutton());
	}

	@Test(priority = 3)
	private void size() throws Throwable {

		dropDown(pom.getPb().getSize(), "index", "1");
		clickonelement(pom.getPb().getColor());
		takeScreenShot("C:\\Users\\Hari Krishna\\eclipse-workspace\\Test_NG\\ScreenShot\\\\image.png1");
	}

	@Test(priority = 4)
	private void addToCart() throws Throwable {

		clickonelement(pom.getPb().getAddTocartButton());
		clickonelement(pom.getPb().getCheckOutButton());
	}

	@Test(priority = 5)
	private void summaryPage() throws Throwable {

		JavascriptExecutor("arguments[0].scrollIntoView();", pom.getSp().getScrollsummary());
		takeScreenShot("C:\\Users\\Hari Krishna\\eclipse-workspace\\Test_NG\\ScreenShot\\\\image.png2");
		actions("singleclick", pom.getSp().getCheckout());
	}

	@Test(priority = 6)
	private void addressPage() throws Throwable {

		JavascriptExecutor("arguments[0].scrollIntoView();", pom.getAp().getScrollAddress());
		takeScreenShot("C:\\Users\\Hari Krishna\\eclipse-workspace\\Test_NG\\ScreenShot\\\\image.png3");

		actions("singleclick", pom.getAp().getCheckout());
	}

	@Test(priority = 7)
	private void Shipping_Page() throws Throwable {

		JavascriptExecutor("arguments[0].scrollIntoView();", pom.getShip().getScroolShipping());
		takeScreenShot("C:\\Users\\Hari Krishna\\eclipse-workspace\\Test_NG\\ScreenShot\\\\image.png4");
		clickonelement(pom.getShip().getCheckBox());
		actions("singleclick", pom.getShip().getCheckOut());
	}

	@Test(priority = 8)
	private void Payment_Method() throws Throwable {

		JavascriptExecutor("arguments[0].scrollIntoView();", pom.getPm().getScrollPayment());
		takeScreenShot("C:\\Users\\Hari Krishna\\eclipse-workspace\\Test_NG\\ScreenShot\\\\image.png5");
	}

//	@AfterMethod
//	private void logOut() {
//		WebElement logout = driver.findElement(By.xpath("//a[@class='logout']"));
//		logout.click();
//	}

}
