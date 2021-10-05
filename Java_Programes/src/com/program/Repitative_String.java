package com.program;

import java.io.ObjectOutputStream.PutField;
import java.util.HashMap;
import java.util.Map;

public class Repitative_String {
	
	public static void main(String[] args) {
		
		String b= "welcome to chennai going to chennai ";
		String[] split = b.split(" ");
		
			Map<String, Integer> mp = new HashMap<String, Integer>();
			for (String str : split) {
			//	System.out.println(str);
				if (mp.containsKey(str)) {
					Integer itr = mp.get(str);
					mp.put(str, itr+2);
				}
				else {
					mp.put(str, 1);
				}
			}
			System.out.println(mp);
		}
}
