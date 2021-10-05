package com.pom3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Quantity_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//select[@name='quantity']")
	private WebElement quantity;
	
	

	public Quantity_Page(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}



	public WebElement getQuantity() {
		return quantity;
	}

}
