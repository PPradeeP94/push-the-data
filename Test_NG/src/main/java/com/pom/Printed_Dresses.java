package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Printed_Dresses {
	
	public static WebDriver driver;
	
	@FindBy (xpath = "(//a[@data-field-qty='qty'])[2]")
	private WebElement plusbutton;
	
	@FindBy (id = "group_1")
	private WebElement size;
	
	@FindBy (id = "color_24")
	private WebElement color;
	
	@FindBy(xpath = "//button[@class='exclusive']")
	private WebElement addTocartButton;
	
	@FindBy (xpath = "//a[@title='Proceed to checkout']")
	private WebElement checkOutButton;
	
	public Printed_Dresses(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver, this);
		
	}

	
	public WebElement getPlusbutton() {
		return plusbutton;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getColor() {
		return color;
	}


	public WebElement getAddTocartButton() {
		return addTocartButton;
	}


	public WebElement getCheckOutButton() {
		return checkOutButton;
	}
	
	
	


	
	

}
