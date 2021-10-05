package org.program;

import java.util.HashMap;
import java.util.Map;

public class Repitative_words {
	
	public static void main(String[] args) {
		String a="Welcome";
		char[] array = a.toCharArray();
		System.out.println(array);
		
		Map<Character, Integer> mp=new HashMap<>();
		for (char c : array) {
			System.out.println(c);
			if (mp.containsKey(c)) {
				Integer it = mp.get(c);
				Integer pu = mp.put(c, it+1);
				//System.out.println(pu);
			}
			else {
				Integer pt = mp.put(c, 1);
			//	System.out.println(pt);
			}
		}
		System.out.println(mp);
	}

}
