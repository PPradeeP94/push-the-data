package com.pom.auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.Automation_Practise.Baseclass;
import com.helper.File_Reader_Mananger;
import com.pom.Address_Page;
import com.pom.Dresses_Page;
import com.pom.Home_Page;
import com.pom.Payment_Method;
import com.pom.Printed_Dress;
import com.pom.Prodect_Added;
import com.pom.Quick_View;
import com.pom.Shipping_Page;
import com.pom.SignIn_Page;
import com.pom.Summary_Page;
import com.singleton.Page_Object_Mananger;

public class Automation_Practise2 extends Baseclass {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hari Krishna\\eclipse-workspace\\Maven_Automation\\Drivers\\chromedriver.exe");
		base();
		geturl("http://automationpractice.com/index.php");

		maximum();

		Page_Object_Mananger pom = new Page_Object_Mananger(driver);
		
		String getusername = File_Reader_Mananger.getInstance().getInstancecr().getusername();
		
		clickonelement(pom.getHp().getSignIn_Btn());
		
	//	String mailId = singleData("C:\\Users\\Hari Krishna\\OneDrive\\Documents\\Manual Test case.xlsx", 8, 5);
		passingthevalue(pom.getSp().getEmail_Field(), getusername);
		
		String password = singleData("C:\\Users\\Hari Krishna\\OneDrive\\Documents\\Manual Test case.xlsx", 9, 5);
		passingthevalue(pom.getSp().getPassword_Field(), password);
		clickonelement(pom.getSp().getSignIn_Btn());

		actions("movetoelement", pom.getDp().getDresses());
		implicitywait(30, TimeUnit.SECONDS);
		actions("movetoelement", pom.getDp().getEveningDresses());
		actions("singleclick", pom.getDp().getEveningDresses());
		implicitywait(30, TimeUnit.SECONDS);
		JavascriptExecutor("arguments[0].click();", pom.getQv().getQuickView_Btn());

		for (int i = 1; i < 15; i++) {
			clickonelement(pom.getPd().getPlus_Btn());
		}
		dropDown(pom.getPd().getSize(), "value", "2");
		clickonelement(pom.getPd().getColor());
		clickonelement(pom.getPd().getAddtoCart_Btn());
		takeScreenShot("C:\\Users\\Hari Krishna\\eclipse-workspace\\Maven_Automation\\Screenshoot\\image1.png");

		clickonelement(pom.getPad().getAddToCart_Btn());

		JavascriptExecutor("arguments[0].scrollIntoView();", pom.getSum().getScrollSummary());
		getText(pom.getSum().getScrollSummary());
		takeScreenShot("C:\\Users\\Hari Krishna\\eclipse-workspace\\Maven_Automation\\Screenshoot\\image2.png");
		clickonelement(pom.getSum().getAddtocart_Btn());

		JavascriptExecutor("arguments[0].scrollIntoView();", pom.getAp().getScrollAddress());
		getText(pom.getAp().getScrollAddress());
		takeScreenShot("C:\\Users\\Hari Krishna\\eclipse-workspace\\Maven_Automation\\Screenshoot\\image3.png");
		clickonelement(pom.getAp().getProcessCheckOut());

		JavascriptExecutor("arguments[0].scrollIntoView();", pom.getShip().getScrollShipping());
		getText(pom.getShip().getScrollShipping());
		takeScreenShot("C:\\Users\\Hari Krishna\\eclipse-workspace\\Maven_Automation\\Screenshoot\\image4.png");
		actions("movetoelement", pom.getShip().getCheckBox());
		clickonelement(pom.getShip().getCheckBox());
		clickonelement(pom.getShip().getCheckOut());

		JavascriptExecutor("arguments[0].scrollIntoView();", pom.getPm().getScrollPayment());
		getText(pom.getPm().getScrollPayment());
		takeScreenShot("C:\\Users\\Hari Krishna\\eclipse-workspace\\Maven_Automation\\Screenshoot\\image5.png");
		actions("movetoelement", pom.getPm().getContinueShopping());
		clickonelement(pom.getPm().getContinueShopping());

//			String url = File_Reader_Mananger.getInstance().getInstanceCR().geturl();
//			geturl(url);
//			Home_Page hp = new Home_Page(driver);
//			clickonelement(hp.getSignIn_Btn());

//			SignIn_Page sp = new SignIn_Page(driver);
		//
//			passingthevalue(sp.getEmail_Field(), "hari8124@gmail.com");
//			passingthevalue(sp.getPassword_Field(), "567890");
//			clickonelement(sp.getSignIn_Btn());

		// Dresses_Page dp = new Dresses_Page(driver);
		// actions("movetoelement", dp.getDresses());
		// implicitywait(30, TimeUnit.SECONDS);
		// actions("movetoelement", dp.getEveningDresses());
		// actions("singleclick", dp.getEveningDresses());

//		Quick_View qv = new Quick_View(driver);
//		implicitywait(30, TimeUnit.SECONDS);
//		JavascriptExecutor("arguments[0].click();", qv.getQuickView_Btn());

//		Printed_Dress pd = new Printed_Dress(driver);
//		for (int i = 1; i < 15; i++) {
//		clickonelement(pd.getPlus_Btn());
//		}
//		dropDown(pd.getSize(), "value", "2");
//		clickonelement(pd.getColor());
//		clickonelement(pd.getAddtoCart_Btn());
//		takeScreenShot("C:\\Users\\Hari Krishna\\eclipse-workspace\\Maven_Automation\\Screenshoot\\image1.png");

//		Prodect_Added pad =new Prodect_Added(driver);
//		clickonelement(pad.getAddToCart_Btn());

//		Summary_Page sum =new Summary_Page(driver);
//		JavascriptExecutor("arguments[0].scrollIntoView();", sum.getScrollSummary());
//		getText(sum.getScrollSummary());
//		takeScreenShot("C:\\Users\\Hari Krishna\\eclipse-workspace\\Maven_Automation\\Screenshoot\\image2.png");
//		clickonelement(sum.getAddtocart_Btn());

//			passingthevalue(pom.getSp1().getEmail_Field(), "hari8124@gmail.com");
//			passingthevalue(pom.getSp1().getPassword_Field(), "567890");
//			clickonelement(pom.getSp1().getSignIn_Btn());		
//		Address_Page ap =new Address_Page(driver);
//		JavascriptExecutor("arguments[0].scrollIntoView();", ap.getScrollAddress());
//		getText(ap.getScrollAddress());
//		takeScreenShot("C:\\Users\\Hari Krishna\\eclipse-workspace\\Maven_Automation\\Screenshoot\\image3.png");
//		clickonelement(ap.getProcessCheckOut());

//		Shipping_Page ship =new Shipping_Page(driver);
//		JavascriptExecutor("arguments[0].scrollIntoView();", ship.getScrollShipping());
//		getText(ship.getScrollShipping());
//		takeScreenShot("C:\\Users\\Hari Krishna\\eclipse-workspace\\Maven_Automation\\Screenshoot\\image4.png");
//		actions("movetoelement", ship.getCheckBox());
//		clickonelement(ship.getCheckBox());
//		clickonelement(ship.getCheckOut());

//					Payment_Method pm = new Payment_Method(driver);
//					JavascriptExecutor("arguments[0].scrollIntoView();", pm.getScrollPayment());
//					getText(pm.getScrollPayment());
//					takeScreenShot("C:\\Users\\Hari Krishna\\eclipse-workspace\\Maven_Automation\\Screenshoot\\image5.png");
//					actions("movetoelement", pm.getContinueShopping());
//					clickonelement(pm.getContinueShopping());

	}

}
