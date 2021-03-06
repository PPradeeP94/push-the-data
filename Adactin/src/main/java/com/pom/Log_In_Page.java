package com.pom;

import java.awt.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Log_In_Page {
	
	public static WebDriver driver;

	@FindBy(xpath = "//input[@name='username']")
	private WebElement email_Filed;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password_Filed;
	
	@FindBy(xpath = "//input[@name='login']")
	private WebElement logIn_Button;
	
	@FindBys({@FindBy(xpath = "//input[@name='username']") ,@FindBy(xpath = "//input[@name='password']")})
	private List emailPass;

	@FindAll({@FindBy(xpath = "//input[@name='password']"),@FindBy(xpath = "//input[@name='login']")})
	private List login;

	
	
	public Log_In_Page(WebDriver driver2) {

		this.driver= driver2;
		
		PageFactory.initElements(driver, this);
		
	}




	public WebElement getEmail_Filed() {
		return email_Filed;
	}

	public WebElement getPassword_Filed() {
		return password_Filed;
	}

	public WebElement getLogIn_Button() {
		return logIn_Button;
	}
	

	
	



}
