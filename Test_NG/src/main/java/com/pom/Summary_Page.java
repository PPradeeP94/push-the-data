package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary_Page {
	 
	public static WebDriver driver;
	
	
	@FindBy(xpath = "//h1[@id='cart_title']")
	private WebElement Scrollsummary;
	
	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	private WebElement checkout;

	public Summary_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getScrollsummary() {
		return Scrollsummary;
	}

	public WebElement getCheckout() {
		return checkout;
	}


}
