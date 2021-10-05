package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "(//input[@data-validate='isEmail'])[2]")
	private WebElement emailField;
	
	@FindBy(xpath = "//input[@data-validate='isPasswd']")
	private WebElement passwordField;
	
	@FindBy(xpath = "//button[@name='SubmitLogin']")
	private WebElement SigInButton;
	
	public LogInPage(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getEmailField() {
		return emailField;
	}

	public WebElement getPasswordField() {
		return passwordField;
	}

	public WebElement getSigInButton() {
		return SigInButton;
	}
	
	

}
