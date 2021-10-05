package org.program;

import java.util.HashMap;
import java.util.Map;

public class Repitative_String {
	
	public static void main(String[] args) {
		
		String a="high speed fan high speed cooler high speed tower";
		String[] split = a.split(" ");
		System.out.println(split);
		
		Map<String, Integer> mp=new HashMap<>();
		for (String str : split) {
			System.out.println(str);
			
			if (mp.containsKey(str)) {
				Integer itg = mp.get(str);
				mp.put(str, itg+1);
			}
			else {
				mp.put(str, 1);
			}
		}
		System.out.println(mp);
		
	}
}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	
		
	
	


