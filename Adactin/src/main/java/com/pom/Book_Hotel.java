package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement first_name;
	
	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement last_name;
	
	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement billing_Adress;
	
	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement credit_Number;
	
	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement credit_Card_Type;
	
	@FindBy(xpath = "//select[@name='cc_exp_month']")
	private WebElement month;
	
	@FindBy(xpath = "//select[@name='cc_exp_year']")
	private WebElement year;
	
	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement cvv_Number;
	
	@FindBy(xpath = "//input[@name='book_now']")
	private WebElement book_now_Button;
	
	
	public Book_Hotel(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver, this);
	}


	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getBilling_Adress() {
		return billing_Adress;
	}

	public WebElement getCredit_Number() {
		return credit_Number;
	}

	public WebElement getCredit_Card_Type() {
		return credit_Card_Type;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv_Number() {
		return cvv_Number;
	}

	public WebElement getBook_now_Button() {
		return book_now_Button;
	}
	
	
	






	




}
