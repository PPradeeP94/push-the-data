package com.definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.baseclass.Baseclass;
import com.runner.Test_Runner;
import com.singleton.Page_Object_Mananger;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Baseclass {

	static WebDriver driver = Test_Runner.driver;

	static Page_Object_Mananger pom = new Page_Object_Mananger(driver);

	@Given("^user should launch the application$")
	public void user_should_launch_the_application() throws Throwable {
		geturl("https://adactinhotelapp.com/");
		System.out.println("url");
	}

	@When("^User enters  the username in userfield$")
	public void user_enters_the_username_in_userfield() throws Throwable {

		passingthevalue(pom.getLp().getEmail_Filed(), "Hari0103");
		System.out.println("username");
	}

	@When("^User enters the password in passwordfield$")
	public void user_enters_the_password_in_passwordfield() throws Throwable {
		passingthevalue(pom.getLp().getPassword_Filed(), "567890");
		System.out.println("password");
	}

	@Then("^User clicks on login button and navigate to Search Hotel page$")
	public void user_clicks_on_login_button_and_navigate_to_Search_Hotel_page() throws Throwable {
		clickonelement(pom.getLp().getLogIn_Button());
		System.out.println("login");
	}

	@When("^user should select Loction$")
	public void user_should_select_Loction() throws Throwable {
		implicitywait(3000, TimeUnit.SECONDS);
		dropDown(pom.getSearch().getLocation(), "index", "1");
		System.out.println("syndey");
	}

	@When("^user should Select hotel_Standard$")
	public void user_should_Select_hotel_Standard() throws Throwable {
		dropDown(pom.getSearch().getHotels(), "index", "2");
		System.out.println("hotel");
	}

	@When("^user should Select room_Type$")
	public void user_should_Select_room_Type() throws Throwable {
		dropDown(pom.getSearch().getRoom_type(), "index", "2");
		System.out.println("roomtype");
	}

	@When("^user should Select number of rooms$")
	public void user_should_Select_number_of_rooms() throws Throwable {
		dropDown(pom.getSearch().getRoom_nos(), "index", "2");
		System.out.println("selet room");
	}

	@When("^user can choose check_In_Data$")
	public void user_can_choose_check_In_Data() throws Throwable {
		passingthevalue(pom.getSearch().getCheck_In_Data(), "30/09/2021");
		System.out.println("checkin");
	}

	@When("^user can choose check_Out_Data$")
	public void user_can_choose_check_Out_Data() throws Throwable {
		passingthevalue(pom.getSearch().getCheck_out_Data(), "30/10/2021");
		System.out.println("checkout");
	}

	@When("^user can select adult Rooms$")
	public void user_can_select_adult_Rooms() throws Throwable {
		dropDown(pom.getSearch().getAdult_room(), "index", "1");
		System.out.println("adult room");
	}

	@When("^user can select Child Rooms$")
	public void user_can_select_Child_Rooms() throws Throwable {
		dropDown(pom.getSearch().getChild_room(), "index", "1");
		System.out.println("child room");
	}

	@Then("^click on search_Button and navigate to Select Hotel$")
	public void click_on_search_Button_and_navigate_to_Select_Hotel() throws Throwable {
		clickonelement(pom.getSearch().getSearch_Button());
		System.out.println("navigate");
	}

	@When("^user sholud check all details and click on selct radio button$")
	public void user_sholud_check_all_details_and_click_on_selct_radio_button() throws Throwable {
		implicitywait(3000, TimeUnit.SECONDS);
		clickonelement(pom.getSelect().getRadio_Button());
		System.out.println("radio button");
	}

	@Then("^click on continue_Button and navigate to Book Hotel$")
	public void click_on_continue_Button_and_navigate_to_Book_Hotel() throws Throwable {
		clickonelement(pom.getSelect().getContinue_Button());
		System.out.println("continue button");
	}

	@When("^User should enter firstname$")
	public void user_should_enter_firstname() throws Throwable {
		implicitywait(3000, TimeUnit.SECONDS);
		passingthevalue(pom.getBook().getFirst_name(), "hari");
		System.out.println("firstname");
	}

	@When("^User should enter lastname$")
	public void user_should_enter_lastname() throws Throwable {
		passingthevalue(pom.getBook().getLast_name(), "M");
		System.out.println("lastname");
	}

	@When("^User should enter billing_Adress$")
	public void user_should_enter_billing_Adress() throws Throwable {
		passingthevalue(pom.getBook().getBilling_Adress(), "Abc--to---xyz");
		System.out.println("billing adress");
	}

	@When("^User should enter credit_Card_Number$")
	public void user_should_enter_credit_Card_Number() throws Throwable {
		passingthevalue(pom.getBook().getCredit_Number(), "1234567890123456");
		System.out.println("credit card");
	}

	@When("^user should select credit_card_type$")
	public void user_should_select_credit_card_type() throws Throwable {
		dropDown(pom.getBook().getCredit_Card_Type(), "index", "2");
		System.out.println("credit card type");
	}

	@When("^user should select expiry_date_Month$")
	public void user_should_select_expiry_date_Month() throws Throwable {
		dropDown(pom.getBook().getMonth(), "index", "3");
		System.out.println("month exp");
	}

	@When("^user should select expiry_Date_Year$")
	public void user_should_select_expiry_Date_Year() throws Throwable {
		dropDown(pom.getBook().getYear(), "index", "12");
		System.out.println("year exp");
	}

	@When("^user should enter cvv_Number$")
	public void user_should_enter_cvv_Number() throws Throwable {
		passingthevalue(pom.getBook().getCvv_Number(), "321");
		System.out.println("cvv number");
	}

	@Then("^user should click on book_Now_Button and navigate to Booking confirmation$")
	public void user_should_click_on_book_Now_Button_and_navigate_to_Booking_confirmation() throws Throwable {
		clickonelement(pom.getBook().getBook_now_Button());
		System.out.println("confirm");
	}

	@When("^user should check full details and click log_Out_Button$")
	public void user_should_check_full_details_and_click_log_Out_Button() throws Throwable {
		implicitywait(3000, TimeUnit.SECONDS);
		clickonelement(pom.getLogout().getLog_Out_Button());
		System.out.println("logout");
	}

}
