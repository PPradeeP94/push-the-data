package com.singleton;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.pom.Address_Page;
import com.pom.Dresses_Page;
import com.pom.Home_Page;
import com.pom.Payment_Method;
import com.pom.Printed_Dress;
import com.pom.Prodect_Added;
import com.pom.Quick_View;
import com.pom.Shipping_Page;
import com.pom.SignIn_Page;
import com.pom.Summary_Page;

import net.bytebuddy.asm.Advice.Return;

public class Page_Object_Mananger  {
	
	public  WebDriver driver;
	
	private Home_Page hp;
	
	private SignIn_Page sp;
	
	private Dresses_Page dp;
	
	private Quick_View qv;
	
	private Printed_Dress pd;
	
	private Prodect_Added pad;
	
	private Summary_Page sum;
	
	private Address_Page ap;
	
	private Shipping_Page ship;
	
	private Payment_Method pm;
	
	private SignIn_Page sp1;
	 
	
	public Page_Object_Mananger(WebDriver driver2) {
			
		this.driver =driver2;
		
		PageFactory.initElements(driver, this);	
	}

	public  Home_Page getHp() {
		hp =new Home_Page(driver);
		return hp;
	}

	public SignIn_Page getSp() {
		sp=new SignIn_Page(driver);
		return sp;
	}

	public Dresses_Page getDp() {
		dp =new Dresses_Page(driver);
		return dp;
	}

	public Quick_View getQv() {
		qv =new Quick_View(driver);
		return qv;
	}

	public Printed_Dress getPd() {
		pd= new Printed_Dress(driver);
		return pd;
	}

	public Prodect_Added getPad() {
		pad= new Prodect_Added(driver);
		return pad;
	}

	public Summary_Page getSum() {
		sum=new Summary_Page(driver);
		return sum;
	}

	public Address_Page getAp() {
		ap = new Address_Page(driver);
		return ap;
	}

	public Shipping_Page getShip() {
		ship = new Shipping_Page(driver);
		return ship;
	}

	public Payment_Method getPm() {
		pm= new Payment_Method(driver);
		return pm;
	}
	public SignIn_Page getSp1() {
		sp1=new SignIn_Page(driver);
		return sp1;
	}

	
    
   
   
   
   
   
   
   
   
   



	
	
	
}
