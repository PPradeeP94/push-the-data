package com.pdf_programs;

public class Duplicates_String_Array {
	
	public static void main(String[] args) {
		
		String a[]= {"java", "to", "to","world"};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}

}
