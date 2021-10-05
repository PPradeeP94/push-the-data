package com.pom;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//select[@name='location']")
	private WebElement location;
	
	@FindBy(xpath = "//select[@name='hotels']")
	private WebElement hotels;
	
	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement room_type;
	
	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement room_nos;
	
	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement check_In_Data;
	
	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement check_out_Data;
	
	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement adult_room;
	
	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement child_room;
	
	@FindBy(xpath = "//input[@name='Submit']")
	private WebElement Search_Button;
	
	

	public Search_Hotel(WebDriver driver2) {
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom_type() {
		return room_type;
	}

	public WebElement getRoom_nos() {
		return room_nos;
	}

	public WebElement getCheck_In_Data() {
		return check_In_Data;
	}

	public WebElement getCheck_out_Data() {
		return check_out_Data;
	}

	public WebElement getAdult_room() {
		return adult_room;
	}

	public WebElement getChild_room() {
		return child_room;
	}

	public WebElement getSearch_Button() {
		return Search_Button;
	}
	
	
	










}
