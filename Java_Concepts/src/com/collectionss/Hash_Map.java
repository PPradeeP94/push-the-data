package com.collectionss;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Hash_Map {
	
	public static void main(String[] args) {
		
	
	Map<Integer, String> mp = new TreeMap<Integer, String>();
	mp.put(1, "abc");
	mp.put(2, "def");
	mp.put(3, "ghi");
	mp.put(4, "abc");
//	mp.put(null, null);
	mp.put(5, null);
	mp.put(5, "123");
	mp.put(6, "jkl");
//	mp.put(null, "jkl");
	mp.put(7, null);
	String stri = mp.get(2);
//	System.out.println(stri);

	
//	System.out.println(mp);
	
	String string = mp.get(3);
	System.out.println(string);
	
	Set<Integer> keySet = mp.keySet();
	System.out.println(keySet);
	
	Collection<String> values = mp.values();
	System.out.println(values);
	
	boolean remove = mp.remove(5, "123");
	System.out.println(remove);
	
	for (int i = 0; i < mp.size(); i++) {
		String string3 = mp.get(i);
		System.out.println(string3);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
