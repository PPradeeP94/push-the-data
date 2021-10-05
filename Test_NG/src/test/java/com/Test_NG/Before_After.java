package com.Test_NG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Before_After {
	
	@BeforeSuite
	private void browserLaunch() {
		System.out.println("Browser launch");
	}
	@BeforeTest
	private void logInPage() {
		System.out.println("logIn page");
	}
	@BeforeClass
	public void userName() {
		System.out.println("enter ur username");
	}
	@Ignore
	@BeforeMethod
	private void pasword() {
		System.out.println("enter ur password");
	}
	@BeforeMethod
	private void logInButton() {
		System.out.println("click button");
	}
	@Test(priority = -1)
	private void homePage() {
		System.out.println("homepage");
	}
	@Test(priority = 0)
	private void products() {
		System.out.println("products");
	}
	@Test(priority = 1)
	private void productsJackets() {
		System.out.println("Jackets");
	}
	@AfterMethod
	private void logOutPage() {
	 System.out.println("logOut page");
	}
	@AfterClass
	private void logOut() {
      System.out.println("logout");
	}
	@AfterTest
	private void driverClose() {
		System.out.println("close");
	}
	@AfterSuite
	private void completed() {
		System.out.println("completed");
	}
	

}
