package com.test;

import org.testng.annotations.Test;

public class Learn_Groups {
	
	@Test(priority = 1,groups = "pen")
	public void montex() {
		System.out.println("pen");
	}
	
	@Test(priority = 7,groups = "pen")
	public void cello() {
		System.out.println("pen");
	}
	
	@Test(priority = 10,groups = "pen")
	public void flair() {
		System.out.println("pen");
	}
	
	@Test(priority = 4)
	public void reynolds() {
		System.out.println("pen");
	}
	
	@Test(priority = 8)
	public void natraj() {
		System.out.println("pencil");
	}
	
	@Test(priority = 2)
	public void apsara() {
		System.out.println("pencil");
	}
	
	@Test(priority = 5)
	public void doms() {
		System.out.println("pencil");
	}
	
	@Test(priority = 11)
	public void camlin() {
		System.out.println("pencil");
	}
	
	@Test(priority = 6)
	public  void pilot() {
		System.out.println("books");
	}
	
	@Test(priority = 0,groups = "books")
	public  void classMate() {
		System.out.println("books");
	}
	
	@Test(priority = 9,groups = "books")
	public void cosco() {
		System.out.println("books");
	}
	
	@Test(priority = 3)
	public void brilliant() {
		System.out.println("books");
	}


}
