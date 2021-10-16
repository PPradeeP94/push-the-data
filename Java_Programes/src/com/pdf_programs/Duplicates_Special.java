package com.pdf_programs;

public class Duplicates_Special {
	
	public static void main(String[] args) {
		
		String a= "hartyy23457!@#$%^&*(0q345767";
		
		String replaceAll = a.replaceAll("[^a-z,A-Z,0-9]", ".");
		System.out.println(replaceAll);
		
	}

}
