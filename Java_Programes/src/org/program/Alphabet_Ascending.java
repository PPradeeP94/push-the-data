package org.program;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Alphabet_Ascending {
	
	
	public static void main(String[] args) {
		
		List<String> li= new ArrayList<String>();
		li.add("Naveen");
		li.add("Manoj");
		li.add("Raj");
		li.add("Ravi");
		li.add("Mani");
		li.add("Raj");
		
	//	System.out.println(li);
		
		Collections.sort(li);
		System.out.println(li);
		
		Collections.reverse(li);
		System.out.println(li);
		
//		Iterator itr=li.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}	
//		System.out.println(li);
	}

}
