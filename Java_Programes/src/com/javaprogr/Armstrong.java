package com.javaprogr;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Armstrong {
	
		
	public static void main(String[] xc) {
		
		
//		String a="welcome to java";
//		String[] sp = a.split("");
//		
//		StringBuffer sb = new StringBuffer();
//		
//		for (int i = 0; i < a.length(); i++) {
//			char c = sp[i].charAt(0);
//			char upperCase = Character.toUpperCase(c);
//			String substring = sp[i].substring(1);
//			StringBuffer append = sb.append(upperCase).append(substring).append(" ");
//		//	System.out.println(append);
//			
//		}
//	
//		String trim = sb.toString().trim();
//		System.out.println(trim);
		
		String a= "roadblock";
				int count=0;
		
		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		
		char[] charArray = a.toCharArray();
		
		for (char c : charArray) {
			
			if (mp.containsKey(c)) {
				Integer count1 = mp.get(c);
				count1++;
				mp.put(c, count1+1);
				System.out.println(count1);
			}
			else {
				mp.put(c, 1);
			}
		}
		System.out.println(mp);
		}
		}
		
		
	

	