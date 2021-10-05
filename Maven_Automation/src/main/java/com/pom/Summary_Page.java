package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary_Page {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//h1[@class='page-heading']")
	private WebElement scrollSummary;
	
	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	private WebElement addtocart_Btn;

	public Summary_Page(WebDriver driver2) {
		this.driver =driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getScrollSummary() {
		return scrollSummary;
	}

	public WebElement getAddtocart_Btn() {
		return addtocart_Btn;
	}
	
	

}
