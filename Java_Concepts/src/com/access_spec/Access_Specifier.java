package com.access_spec;

import org.omg.CORBA.PRIVATE_MEMBER;

import com.Scanner.Scanner_Type;

import Opps_Concepts.Method_overide_1;

public class Access_Specifier  {
	
//	public
//	PRIVATE
//	Protected
//	default
	
	int a=10;
	public void add() {
		System.out.println("public  :"+a);
	}
	private void add1() {
		System.out.println("Private  :" +a);

	}
	 void add2() {
		 System.out.println("Default :"+a);

	}
	protected void add3() {
		System.out.println("Protected :"+a);
	}
	
	public static void main(String[] args) {
		Access_Specifier ac = new Access_Specifier();
		ac.add();
		ac.add1();
		ac.add2();
		ac.add3();
	}

}

// public      it is a global level access(same package+different package)
// private     it is class level access
// protected   we have to use extends keyword(Inside Package + outside Package)
// default     package level access (Inside package only)

