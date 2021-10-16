package com.pdf_programs;

import java.util.HashMap;
import java.util.Map;

public class Demo {
	
	
	public static void main(String[] args) {
		
		
		String a= "welcome";
		
		int length = a.length();
		
		System.out.println(length);
		
		Map<String, Integer> mp = new HashMap<String, Integer>();
		Integer put = mp.put(a, 1);
		
		System.out.println(mp);
		
	}
	
	
	
	

}
