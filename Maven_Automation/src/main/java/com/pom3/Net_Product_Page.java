package com.pom3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Net_Product_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@value='Dove']")
	private WebElement doveCheckBox;
	
	@FindBy(xpath = "//input[@value='Head & Shoulders']")
	private WebElement headSho;
	
	@FindBy(partialLinkText = "Head & Shoulders Anti-Dandruff Shampoo - Cool Menthol 650 ml")
	private WebElement headshampo;

	public Net_Product_Page(WebDriver driver2) {
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getDoveCheckBox() {
		return doveCheckBox;
	}

	public WebElement getHeadSho() {
		return headSho;
	}

	public WebElement getHeadshampo() {
		return headshampo;
	}
	
	

}
