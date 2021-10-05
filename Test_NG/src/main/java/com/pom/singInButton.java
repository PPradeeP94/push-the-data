package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class singInButton {
	
	 public static WebDriver driver;
	 
	@FindBy(xpath = "//a[@class='login']")
	private WebElement signInBtn;
	
	
	public singInButton(WebDriver driver2) {
		this.driver =driver2;
		
		PageFactory.initElements(driver, this);
		
		
	}


	public WebElement getSignInBtn() {
		return signInBtn;
	}

	
	
	

}
