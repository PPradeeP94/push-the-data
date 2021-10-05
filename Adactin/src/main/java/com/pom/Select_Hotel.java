package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	
	public static WebDriver driver;

	@FindBy(xpath = "//input[@name='radiobutton_0']")
	private WebElement radio_Button;

	@FindBy(xpath = "//input[@name='continue']")
	private WebElement continue_Button;


	

	public Select_Hotel(WebDriver driver2) {
		
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getRadio_Button() {
		return radio_Button;
	}

	public WebElement getContinue_Button() {
		return continue_Button;
	}

}
