package com.pom3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Net_Home_Page {
	
	public static WebDriver driver;
	
	@FindBy(partialLinkText = "Shampoos And Conditioners")
	private WebElement shampoo;

	public Net_Home_Page(WebDriver driver2) {
		this.driver =driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getShampoo() {
		return shampoo;
	}

	
	

}
