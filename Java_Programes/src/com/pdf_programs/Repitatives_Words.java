package com.pdf_programs;

import java.util.HashMap;
import java.util.Map;

public class Repitatives_Words {
	
	public static void main(String[] args) {
		
		String a= "welcome";
		
		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		char[] cs = a.toCharArray();
		
		for (char c : cs) {
			if (mp.containsKey(c)) {
				Integer inter = mp.get(c);
				mp.put(c, inter+1);
			}
			else {
				mp.put(c, 1);
			}
		}
		System.out.println(mp);
	}

}
