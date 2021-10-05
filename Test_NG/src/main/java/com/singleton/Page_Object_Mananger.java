package com.singleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.Adress_Page;
import com.pom.Dresses_Page;
import com.pom.LogInPage;
import com.pom.Payment_Method;
import com.pom.Printed_Dresses;
import com.pom.Quick_Page;
import com.pom.Shipping_Page;
import com.pom.Summary_Page;
import com.pom.singInButton;


public class Page_Object_Mananger {
	
	public static WebDriver driver;
	
	private singInButton sb;
	private LogInPage lp;
	private Dresses_Page dp;
	private Quick_Page qp;
	private Printed_Dresses pb;
	private Summary_Page sp;
	private Adress_Page ap;
	private Shipping_Page ship;
	private Payment_Method pm;
	
	public Page_Object_Mananger(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}
	
	public singInButton getSb() {
		sb = new singInButton(driver);
		return sb;
	}
	
	public LogInPage getLp() {
		lp = new LogInPage(driver);
		return lp;
	}

	public Dresses_Page getDp() {
		dp= new Dresses_Page(driver);
		return dp;
	}

	public Quick_Page getQp() {
		qp= new Quick_Page(driver);
		return qp;
	}

	public Printed_Dresses getPb() {
		pb=new Printed_Dresses(driver);
		return pb;
	}

	public Summary_Page getSp() {
		sp= new Summary_Page(driver);
		return sp;
	}

	public Adress_Page getAp() {
		ap = new Adress_Page(driver);
		return ap;
	}

	public Shipping_Page getShip() {
		ship= new Shipping_Page(driver);
		return ship;
	}

	public Payment_Method getPm() {
		pm=new Payment_Method(driver);
		return pm;
	}
	
	
	
	
	


	
		
	
	
	

}
