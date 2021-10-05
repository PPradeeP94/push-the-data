package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Method {

	public static WebDriver driver;

	@FindBy(xpath = "//h1[@class='page-heading']")
	private WebElement scrollPayment;

	public Payment_Method(WebDriver driver2) {
		this.driver= driver2;
				
				PageFactory.initElements(driver, this);
	}

	public WebElement getScrollPayment() {
		return scrollPayment;
	}

}
