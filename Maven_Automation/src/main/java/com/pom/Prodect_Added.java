package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Prodect_Added {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[1]")
	private WebElement addToCart_Btn;

	public Prodect_Added(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddToCart_Btn() {
		return addToCart_Btn;
	}
	
	
	

}
