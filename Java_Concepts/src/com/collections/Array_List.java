package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Array_List {
	
		
		public static void main(String[] args) {
			List<Integer> li=new ArrayList<Integer>();
			
			li.add(12);
			li.add(22);
			li.add(32);
			li.add(42);
			li.add(32);
			
			
			System.out.println(li);
			System.out.println(li.size());
			System.out.println(li.get(3));
			System.out.println(li.remove(2));
			System.out.println(li.indexOf(22));
			System.out.println(li.contains(32));
		//	System.out.println(li.clear(li));
		//	System.out.println(li.addAll(56));
			System.out.println(li.retainAll(li));
		//	System.out.println(li.removeAll(0,3));
		//	System.out.println(li.sort(2););
			
			Set<Integer> st = new HashSet<Integer>();
		//	System.out.println(st);
			for (Integer inte: li) {
				  st.add(inte);
		
			}
			System.out.println(st);
			
			
			

		}
}
