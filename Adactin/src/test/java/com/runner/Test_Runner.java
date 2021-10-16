package com.runner;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.Baseclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "featurefiles/Adactin.feature",
		
		glue = {"com.definition","com.hooks"},
		
		monochrome = true,
		
		dryRun  = false,
		
		strict = true
		
		
//		plugin = 
//			
//	{"com.cucumber.listener.ExtendcucumberFormatter:Reports/Extent.html"}
			
		)

public class Test_Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void set_Up() {
		
		driver= Baseclass.getBrowser("chrome");	
	}
	@AfterClass
	public static void tear_Down() {
		
	//	driver.close();
		

	}
	


}
