package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Quick_Page {
	
	public static WebDriver driver;
	
	
	@FindBy(xpath = "//a[@class='quick-view']")
	private WebElement quickview;

	
	


	public Quick_Page(WebDriver driver2) {
      	this.driver= driver2;
		
		PageFactory.initElements(driver, this);

	}



	public WebElement getQuickview() {
		return quickview;
	}


}
