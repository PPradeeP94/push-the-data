package com.program;

public class Vowels {
	
	public static void main(String[] args) {
		int count=0;
		String a="welcome";
		
		char[] charArray = a.toCharArray();
		for (char c : charArray) {
			System.out.println(c);
			
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