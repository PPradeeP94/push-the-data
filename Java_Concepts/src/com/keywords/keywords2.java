package com.keywords;

public final class keywords2 {

	
	public final void color() {
		System.out.println("red");
		

	}
	final static int var=20;
	

	private static void add() {
		
		try {
			System.out.println(var/0);
			
		} catch (Exception e) {
			
		}
		finally {
			System.out.println("Done");
		}
		

	}
	public static void main(String[] args) {
		add();
	}
	
	
	
}
