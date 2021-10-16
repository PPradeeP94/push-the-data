package com.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before
	public void browserOpen() {
		System.out.println("open chrome");

	}
//	@After
	public void browserClose() {
		System.out.println("close chrome");

	}

}
