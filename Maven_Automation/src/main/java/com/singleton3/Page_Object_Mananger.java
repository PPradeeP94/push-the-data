package com.singleton3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom3.Net_Home_Page;
import com.pom3.Net_Product_Page;
import com.pom3.Pincode_Page;
import com.pom3.Quantity_Page;



public class Page_Object_Mananger {
	
	public static WebDriver driver;

	private Net_Home_Page nethome;

	private Net_Product_Page netproduct;

	private Pincode_Page pincodepage;

	private Quantity_Page quantitypage;
	
	

	public Page_Object_Mananger(WebDriver driver2) {
		
		this.driver =driver2;
		
		PageFactory.initElements(driver, this);
	}

	public Net_Home_Page getNethome() {
		nethome = new Net_Home_Page(driver);
		return nethome;
	}

	
	public Net_Product_Page getNetproduct() {
		netproduct = new Net_Product_Page(driver);
		return netproduct;
	}

	public Pincode_Page getPincodepage() {
		pincodepage = new Pincode_Page(driver);
		return pincodepage;
	}

	public Quantity_Page getQuantitypage() {
		quantitypage =new Quantity_Page(driver);
		return quantitypage;
	}
	
	

	
}
