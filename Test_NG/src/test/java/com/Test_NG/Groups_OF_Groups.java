package com.Test_NG;

import org.testng.annotations.Test;

public class Groups_OF_Groups {
	
	
	@Test(groups = "Social Media")
	private void instagram() {
		System.out.println("instagram");
	}
	
	@Test(groups = "Music")
	private void gaana() {
		System.out.println("gaana");
	}
	
	@Test(groups = "Social Media")
	private void facebook() {
		System.out.println("facebook");
	}
	@Test(groups = "E_Commerce")
	private void aliBaba() {
		System.out.println("aliBaba");
	}
	
	@Test(groups = "Music")
	private void spotify() {
		System.out.println("spotify");
	}
	
	@Test(groups = "E_Commerce")
	private void flipKart() {
		System.out.println("flipkart");
	}
	
	@Test(groups = "Social Media")
	private void whatsApp() {
		System.out.println("whatsapp");
	}
	
	@Test(groups = "Music")
	private void saavan() {
		System.out.println("savaan");
	}
	
	@Test(groups = "E_Commerce")
	private void amazon() {
		System.out.println("amazon");
	}


}
