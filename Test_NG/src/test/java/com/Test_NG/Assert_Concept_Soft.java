package com.Test_NG;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Concept_Soft {
	
	@Test
	private static void data_Validation() {
		
		String excepted_UserName ="gayle";
		String actual_UserName   ="gayle_Boss";
		
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual_UserName, excepted_UserName);
		System.out.println("done");

	}
}
