package com.pom;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_Page {
	
	
	public WebDriver driver;
	
	@FindBy(xpath = "//h1[@class='page-heading']")
	private WebElement scroolShipping;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkBox;
	
	@FindBy(xpath = "//button[@name='processCarrier']")
	private WebElement checkOut;
	
	public Shipping_Page(WebDriver driver2) {
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getScroolShipping() {
		return scroolShipping;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	
	
	
	

}
