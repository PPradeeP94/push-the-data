package com.Test_NG;

import static org.testng.Assert.assertEquals;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

public class Assert_Concept_Hard {
	
	
	@Test
	private void data_Validation() {
		
		String excepted_UserName ="gayle";
		String actual_UserName   ="gayle_Boss";
		
	//	assertEquals(actual_UserName, excepted_UserName);
		
		Assert.assertEquals(excepted_UserName, actual_UserName);
		
	//	Verify.verify(excepted_UserName, actual_UserName,  2);
		
		System.out.println("done");

	}

}
