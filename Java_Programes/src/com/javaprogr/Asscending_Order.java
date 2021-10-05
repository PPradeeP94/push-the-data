package com.javaprogr;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Asscending_Order {
	
	
//	public static void main(String[] args) {
//	String a="welcome";//  e=2;
//		char[] charArray = a.toCharArray();
//		
//		
//		Map<Character, Integer> mp =new HashMap<Character, Integer>();
//		for (char c : charArray) {
//			//System.out.println(c);
//			
//		
//			if (mp.containsKey(c)) {
//				Integer it = mp.get(c);
//				mp.put(c, it+1);
//				
//			}
//			else {
//				mp.put(c, 1);
//			}
//		}
//			System.out.println(mp);
//			Set<Entry<Character, Integer>> entrySet = mp.entrySet();
//			for (Entry<Character, Integer> entry : entrySet) {
//				//System.out.println(entry);
//					if (entry.getValue()==1) {
//						System.out.println(entry);
//					}
//				
//			}
//			
//		}
	
	public static void main(String[] args) {
		int temp;//34
		
		int [] a= {10,19,34,23,8,39};       //
		
		for (int i = 0; i < a.length; i++) {   //2
			for (int j = i+1; j < a.length; j++) { //3-4  //----10,19,23,34,8,39
				
				
				if (a[i]<a[j]) {  //34,23    23,23 ,23,34
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	}


