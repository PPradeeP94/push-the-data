package com.collectionss;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Array_List {
	
	public static void main(String[] args) {
		
		
		Collection<Object> ob = new ArrayList<Object>();
		ob.add(56);
		ob.add("ravi");
		List<Object> bo = new ArrayList<Object>();
		bo.add(45);
		bo.add(56);
		bo.add(67);
		bo.add(89);
		
		
		
		Object object = bo.get(0);
//		System.out.println(object);
//		System.out.println(bo);
		
		for (int i = 0; i < bo.size(); i++) {
			
			System.out.println(i);
		}
			System.out.println(bo);
		 
	
		}
}



// list is an interface
// it is a index based
// it allow duplicates
//it prints in insertion order


// searching and retering is very easy      -----> Array list
// insertion and deleting is very difficult -----> Array list
// Asynorchied

// searching and retering is very difficult      -----> LinkedArray list
// insertion and deleting is very easy            -----> LinkedArray list
// Asynorchied

// synorchied
// Thread safe,slow procees
