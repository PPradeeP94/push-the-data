package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn_Page {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "(//input[@name='email'])[1]")
	private WebElement email_Field;
	
	@FindBy(xpath = "(//input[@name='passwd'])[1]")
	private WebElement password_Field;
	
	@FindBy(xpath="//button[@name='SubmitLogin']")
	private WebElement SignIn_Btn;
	
	
	public WebElement getEmail_Field() {
		return email_Field;
	}
	

	public WebElement getPassword_Field() {
		return password_Field;
	}

	public WebElement getSignIn_Btn() {
		return SignIn_Btn;
	}

	public SignIn_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}



	
	

}
