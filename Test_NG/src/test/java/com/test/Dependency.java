package com.test;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Dependency {
	
	
	@Test(priority = 1)
	public void montex() {
		System.out.println("pen");
	}
	
	@Test(priority = 7)
	public void cello() {
		System.out.println("pen");
	}
	
	@Test(priority = 10)
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
	
	@Test(priority = 0)
	public  void classMate() {
		System.out.println("books");
	}
//	@Ignore
	@Test(priority = 9,dependsOnMethods = {"flair"})
	public void cosco() {
		System.out.println("books");
	}
	
	@Test(priority = 3)
	public void brilliant() {
		System.out.println("books");
	}
	
	


}
