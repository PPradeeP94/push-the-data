package com.collection;

import java.util.HashSet;
import java.util.Set;

public class Set_HashSet {
	
 public static void main(String[] args) {
	 Set<Integer> set1=new HashSet<Integer>();
	  
	  set1.add(32);
	  set1.add(56);
	  set1.add(12);
	  set1.add(67);
	  set1.add(null);
	  set1.add(99);
	  set1.add(56);
	  set1.add(null);
	  
	  System.out.println(set1);
	  
     //size The size of set
	  
	  int size = set1.size();
	  System.out.println(size);
	  
	//contains Value checking
	  boolean contains = set1.contains(12);
	  System.out.println(contains);
	  
	// clear To clear the entire set  
	  
	//  set1.clear();
	//  System.out.println(set1);
	  
 Set<Integer> set2=new HashSet<Integer>();
	  
	  set2.add(22);
	  set2.add(56);
	  set2.add(82);
	  set2.add(97);
	  set2.add(null);
	  set2.add(99);
	  set2.add(42);
	  set2.add(null);
	  
	  System.out.println(set2);
	  
	//RetainAll It print Common values
	  set1.retainAll(set2);
	  System.out.println(set1);
	  
   //RemoveAll To remove common values
	  set2.removeAll(set1);
	  System.out.println(set2);
	  
  //Addall To add both set
	  boolean addAll = set1.addAll(set2);
	  System.out.println(addAll);
	  System.out.println(set1);
	  
  //IsEmpty To check set is Empty Or/Not
	  boolean empty = set1.isEmpty();
	  System.out.println(empty);
	  
  //Equals  condition True/false
	  boolean equals = set1.equals(set2);
	  System.out.println(equals);
	  
	//  boolean remove = set1.remove(2);
	//  System.out.println(remove);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	 
	
}

}
