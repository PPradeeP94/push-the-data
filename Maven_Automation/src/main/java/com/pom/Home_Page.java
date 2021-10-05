package com.pom;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class Home_Page {

	public  WebDriver driver;

	@FindBy(xpath = "//a[@class='login']")
	private WebElement signIn_Btn;

	public Home_Page(WebDriver driver2) {
		this.driver =driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSignIn_Btn() {
		return signIn_Btn;
	}

	
}
