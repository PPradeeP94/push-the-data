package com.collectionss;

import java.util.HashMap;
import java.util.Map;

public class Hash_Map {
	
	public static void main(String[] args) {
		
	
	Map<Integer, String> mp = new HashMap<Integer, String>();
	mp.put(1, "abc");
	mp.put(2, "def");
	mp.put(3, "ghi");
	mp.put(4, "abc");
	mp.put(null, null);
	mp.put(5, null);
	mp.put(5, "123");
	mp.put(6, "jkl");
	mp.put(null, "jkl");
	mp.put(7, null);
	String stri = mp.get(2);
	System.out.println(stri);

	
	System.out.println(mp);
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
