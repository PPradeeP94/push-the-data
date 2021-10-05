package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_Page {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//h1[@class='page-heading']")
	private WebElement scrollAddress;
	
	@FindBy(xpath = "//button[@name='processAddress']")
	private WebElement processCheckOut;

	public Address_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getScrollAddress() {
		return scrollAddress;
	}

	public WebElement getProcessCheckOut() {
		return processCheckOut;
	}
	
	

}
