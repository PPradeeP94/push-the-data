package com.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Hash_Map {
	
	public static void main(String[] args) {
		
		Map<Integer, String> ref=new HashMap<Integer, String>();
		
	 //put --> Adding the values to map
		ref.put(10, "Ten");
		ref.put(70, "seventy");
		ref.put(50, null);
		ref.put(null, "fourty");
		ref.put(30, "Thirty");	
		ref.put(null, null);
		ref.put(20, "Twenty");
		ref.put(10, "seventy");
		ref.put(70, "Ten");
		
		
	//	ref.put(null, "Ten");
		
		System.out.println(ref);
		
	//size --> To find length of map
		int size = ref.size();
		System.out.println(size);
		
    //Get -->To get values based on index
		
		String sget = ref.get(30);
		System.out.println(sget);
		
    //keyset -->To print only Keyset Values
		Set<Integer> keySet = ref.keySet();
		System.out.println(keySet);
		
    //Values -->To print only values
		Collection<String> values = ref.values();
		System.out.println(values);
		
	//	containKey -->condition checking True/false
		boolean containsKey = ref.containsKey(40);
		System.out.println(containsKey);
		
	//containvalues -->condition checking True/false
		boolean containsValue = ref.containsValue("ten");
		System.out.println(containsValue);
		
	//EntrySet -->
		Set<Entry<Integer, String>> entrySet = ref.entrySet();
		System.out.println(entrySet);
		
		
	}

}
