package com.pom;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresses_Page {
	
	public static WebDriver driver;
	@FindBy(xpath = "(//a[@title='Dresses'])[2]")
	private WebElement dresses;
	
	@FindBy(xpath = "(//a[@title='Evening Dresses'])[2]")
	private WebElement eveningDresses;

	
	
	public Dresses_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	
	

	public WebElement getDresses() {
		return dresses;
	}

	public WebElement getEveningDresses() {
		return eveningDresses;
	}
	
	
	

}
