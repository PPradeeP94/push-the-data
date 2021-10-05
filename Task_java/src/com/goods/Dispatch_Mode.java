package com.goods;

import java.util.Scanner;

public class Dispatch_Mode {
	public  void urGent() {
			
Scanner s =new Scanner(System.in);
System.out.println("Enter the weight");
int w = s.nextInt();
System.out.println(w);
System.out.println("Enter the distance");
int d = s.nextInt();
System.out.println(d);


		if (w < 100 )
		{
	if(d<50)
	{
System.out.println("Mode of transport by van");

	}
	else 
	{
		System.out.println("Mode of Transport by train");
	}
	
}else
	
{
	System.out.println("Mode of transport by train");
}}
	public  void nonUrgent() {
Scanner s1 =new Scanner(System.in);
System.out.println("Enter the Weight");
int a = s1.nextInt();
System.out.println(a);
System.out.println("Enter the Distance ");
int b = s1.nextInt();
System.out.println(b);

if (a<5) {
	System.out.println("mode of transort by post ");
}
	else if (a>5) {
	if(b<=250)
	{
		System.out.println("mode of transport by lorry");
	}
	else {
		System.out.println("mode of transport by train");
	}
}else 
{
	System.out.println("mode of transport by train");
}

	
}
	public static void main(String[] args) {
		Dispatch_Mode d=new Dispatch_Mode();
		System.out.println("dispatch Mode ");
	
		//d.urGent();
		//d.nonUrgent();
		Scanner s2=new Scanner (System.in);
		String c = s2.next();
		switch (c) {
		case "A":
		{
			d.urGent();
			
		}
			break;
		case "B":
		{
			d.nonUrgent();
			
		}
			break;

		default:System.out.println("invalid data ");
			break;
		}
		
	}

	}

