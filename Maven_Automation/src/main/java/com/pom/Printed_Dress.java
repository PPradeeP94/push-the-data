package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Printed_Dress {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "(//a[@data-field-qty='qty'])[2]")
	private WebElement plus_Btn;
	
	@FindBy(xpath = "//select[@name='group_1']")
	private WebElement size;

	@FindBy(id = "color_24")
	private WebElement color;
	
	@FindBy(xpath = "(//button[@type='submit'])[3]")
	private WebElement addtoCart_Btn;

	public Printed_Dress(WebDriver driver2) {
		this.driver =driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPlus_Btn() {
		return plus_Btn;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getColor() {
		return color;
	}

	public WebElement getAddtoCart_Btn() {
		return addtoCart_Btn;
	}
	
	
	
}
