Feature: To book a hotel in adactin site


Background:
Scenario: To Check login functionality

Given user should launch the application
When User enters  the username in userfield
When User enters the password in passwordfield
Then User clicks on login button and navigate to Search Hotel page

Scenario: To check Search hotel functionality
When user should select Loction
And user should Select hotel_Standard
And user should Select room_Type
And user should Select number of rooms
And user can choose check_In_Data
And user can choose check_Out_Data
And user can select adult Rooms
And user can select Child Rooms
Then click on search_Button and navigate to Select Hotel

Scenario: To check search hotel functionality
When user sholud check all details and click on selct radio button
Then click on continue_Button and navigate to Book Hotel

Scenario: To check Book hotel functionality
When User should enter firstname
When User should enter lastname
When User should enter billing_Adress
When User should enter credit_Card_Number
And user should select credit_card_type
And user should select expiry_date_Month
And user should select expiry_Date_Year
And user should enter cvv_Number
Then user should click on book_Now_Button and navigate to Booking confirmation

Scenario: To check Booking confirmation functionality
And user should check full details and click log_Out_Button 


