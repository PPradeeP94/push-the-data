package com.Test_NG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class Data_Provider {

	@Test(dataProvider = "inputData")
	private void userData(String Username, int Password) {

		System.out.println("Username :" + Username);
		System.out.println("Password :" + Password);

	}
		
	@DataProvider
	public Object[][] inputData() {
			
		return new Object[][] {
			
			{"sammy",456},
			{"gayle",123},
			{"ramdin",789}
			

	};

	}

}
