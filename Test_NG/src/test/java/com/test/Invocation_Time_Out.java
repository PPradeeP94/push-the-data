package com.test;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Invocation_Time_Out {
	
	//invocationCount = 3,threadPoolSize = 2,invocationTimeOut,TimeOut
	
	@Test(priority = 1,enabled = false)
	public void montex() {
		System.out.println("pen");
	}
	
	@Test(priority = 7)
	public void cello() {
		System.out.println("pen");
	}
	@Test(priority = 10,timeOut = 4000)
	public void flair() throws Throwable {
		System.out.println("pen");
		Thread.sleep(3000);
		System.out.println("pen....");
	}
	
	@Test(priority = 4)
	public void reynolds() {
		System.out.println("pen");
	}
	
	@Test(priority = 8)
	public void natraj() {
		System.out.println("pencil");
	}
	@Ignore
	@Test(priority = 2)
	public void apsara() {
		System.out.println("pencil");
	}
	
	@Test(priority = 5)
	public void doms() {
		System.out.println("pencil");
	}
	
	@Test(priority = 11,invocationCount = 3,threadPoolSize = 2)
	public void camlin() throws Throwable {
		System.out.println("pencil");
	//	Thread.sleep(5000);
		System.out.println("pencil.....");
	}
	
	@Test(priority = 6)
	public  void pilot() {
		System.out.println("books");
	}
	
	//@Test(priority = 0)
	@Test(enabled = false)
	public  void classMate() {
		System.out.println("books");
	}
	
	@Test(priority = 9)
	public void cosco() {
		System.out.println("books");
	}
	
	@Test(priority = 3)
	public void brilliant() {
		System.out.println("books");
	}


}
