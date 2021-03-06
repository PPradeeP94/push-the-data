package com.singleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pom.Book_Hotel;
import com.pom.Log_In_Page;
import com.pom.Log_Out;
import com.pom.Search_Hotel;
import com.pom.Select_Hotel;

public class Page_Object_Mananger {

	public static WebDriver driver;

	private Log_In_Page lp;

	private Search_Hotel search;

	private Select_Hotel select;

	private Book_Hotel book;

	private Log_Out logout;

	public Page_Object_Mananger(WebDriver driver2) {
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}

	public Log_In_Page getLp() {
		lp=new Log_In_Page(driver);
		return lp;
	}

	public Search_Hotel getSearch() {
		search= new Search_Hotel(driver);
		return search;
	}

	public Select_Hotel getSelect() {
		select = new Select_Hotel(driver);
		return select;
	}

	public Book_Hotel getBook() {
		book = new Book_Hotel(driver);
		return book;
	}

	public Log_Out getLogout() {
		logout= new Log_Out(driver);
		return logout;
	}
	

}
