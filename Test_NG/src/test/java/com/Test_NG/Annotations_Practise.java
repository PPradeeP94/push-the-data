package com.Test_NG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Annotations_Practise {

	@BeforeMethod
	private void logInButton() {
		System.out.println("LogIn");
	}

	@Test(priority = 0)
	private Object dressesPage() {
		System.out.println("dressePage");
		System.out.println("evening dress");
		
		return dressesPage();
	}

	@Ignore
	@Test(priority = 1 )
	private void quickView() {
		int a=5;
		
		System.out.println("quickview");
	}
	
	@Test(priority = 2,timeOut = 4000)
	private void plusButton() throws Throwable {
		System.out.println("Click plus15");
		
		Thread.sleep(3000);
		
		System.out.println("Loading");
	}

	@Test(priority = 3)
	private void size() {
		System.out.println("select size M");
	}

	@Test(priority = 4)
	private void addToCart() {
		System.out.println("Cart");
	}

	@Test(priority = 5)
	private void addressPage() {
		System.out.println("Address");
	}

	@Test(priority = 6)
	private void shippingPage() {
		System.out.println("shipping");

	}

	@Test(priority = 7,invocationCount = 3)
	private void paymentMethod() {
		System.out.println("payment");

	}

	@AfterMethod
	private void logOut() {
		System.out.println("logout");
	}

}