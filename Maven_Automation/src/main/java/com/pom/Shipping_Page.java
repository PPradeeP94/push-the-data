package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_Page {
	
	
	public static WebDriver driver;
	@FindBy(xpath = "//h1[@class='page-heading']")
	private WebElement scrollShipping;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkBox;
	
	@FindBy(xpath = "(//button[@type=\"submit\"])[2]")
	private WebElement checkOut;

	public Shipping_Page(WebDriver driver2) {
		this.driver =driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getScrollShipping() {
		return scrollShipping;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}
	
	
	

}
