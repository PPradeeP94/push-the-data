package org.program;

public class Vowels {
	
	static int 	count ;
	
	
	public static void main(String[] args) {
		String b= "chennai";
		char[] charArray = b.toCharArray();
		for (char c : charArray) {
			
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				
			count++;	
							}
		
	}
		System.out.println(count);
	}
}
