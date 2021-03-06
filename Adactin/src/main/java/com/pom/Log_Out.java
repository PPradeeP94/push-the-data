package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Log_Out {

	public static WebDriver driver;

	@FindBy(xpath = "//input[@name='logout']")
	private WebElement log_Out_Button;
	
		

	public Log_Out(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver, this);

	}

	public WebElement getLog_Out_Button() {
		return log_Out_Button;
	}

}
