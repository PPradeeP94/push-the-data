package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Quick_View {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//span[text()='Quick view']")
	private WebElement quickView_Btn;


	public Quick_View(WebDriver driver2) {
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}




	public WebElement getQuickView_Btn() {
		return quickView_Btn;
	}


}
