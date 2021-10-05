package com.pom3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pincode_Page {
	
	public WebDriver driver;
	
	@FindBy(id = "pincode")
	private WebElement pincode;
	
	@FindBy (xpath = "(//button[@type='submit'])[1]")
	private WebElement addToCart;
	
	@FindBy(xpath = "(//button[@type='button'])[5]")
	private WebElement plusButton;
	
	@FindBy(xpath = "//div[@class='text']")
	private WebElement cart;

	public Pincode_Page(WebDriver driver2) {
		this.driver= driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getPlusButton() {
		return plusButton;
	}

	public WebElement getCart() {
		return cart;
	}
	
	

}
