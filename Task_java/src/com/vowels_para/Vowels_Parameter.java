package com.vowels_para;

import java.util.HashMap;
import java.util.Map;

public class Vowels_Parameter {
	
	public static void main(String[] args) {
//		 int count =0;
//		String a="pArameter";
//		
//		char[] array = a.toCharArray();
//		for (char c : array) {
//			switch (c) {
//			case 'A':
//			case 'a':
//			case 'E':
//			case 'e':
//			case 'I':
//			case 'i':
//			case 'O':
//			case 'o':
//			case 'U':
//			case 'u':
//				count++;
//			}
//			
//		}	
//				System.out.println("vowels count="+count);
		
		int vowels=0;
		int non_vowels;
		String b="parameter";
	//	String rev="";
		char[] arrray = b.toCharArray();
	//	int length = arrray.length;
		for (char c : arrray) {
		for (int i = 0; i <1; i++) {
			b.charAt(i);
			if (c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||
				c=='I'||c=='o'||c=='O'||c=='u'||c=='U') {
				vowels++;
			}
			}
		}
		System.out.println(vowels);
		
			}
}
















