package com.collectionss;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Hash_Set {
	
	public static void main(String[] args) {
		
		Set<Object> st = new HashSet<Object>();
		
	//	st.add(null);
		st.add(23);
		st.add(33);
		st.add(44);
		st.add(34);
		st.add(45);
		st.add(45);
	//	st.add(null);
	//	st.add(null);
		
		for (int i = 1; i < st.size(); i++) {
			System.out.println(i);
		}
		
		System.out.println(st);
		
		Object [] a= new Object[7];
		
		a[0]=12;
		a[1]=15;
		a[2]="ara";
		a[3]=19;
		a[4]=12.45;
		
		for (int i = 0; i < a.length; i++) {
			//System.out.println(a[i]);
		}
		


	}

}

//----> to get position of elements is not possible
//list is an interface
//it is a value based
//it not allow duplicates
//it does not have specific order
// it will allow only single null



