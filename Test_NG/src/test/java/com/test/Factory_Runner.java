package com.test;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class Factory_Runner {
	
	@Test
	@Factory(dataProvider = "krishna")
	public Object[] factor() {

		return new Object[][] {
				 {new Fact_ory()}
				
		};
		
		
//				{ { "krish8234@gmail.com","567890"}, 
//				{ "krish8124@gmail.com","567890"},
//				{ "krish8124@gmail.com","567890"}};

	}
}
