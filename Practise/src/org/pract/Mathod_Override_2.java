package org.pract;

public class Mathod_Override_2 extends Method_Override{
 
	@Override
	public void laptopCompany(String a) {
		super.laptopCompany(a);
	}
	@Override
	public void laptopModel(int a) {
		super.laptopModel(a);
	}
	@Override
	public void laptopSize(String b, int a) {
		super.laptopSize(b, a);
	}
	@Override
	public void laptopService(String b) {
		super.laptopService(b);
	}
	public static void main(String[] args) {
		Mathod_Override_2 mv=new Mathod_Override_2();
		mv.laptopCompany("DEll");
		mv.laptopModel(342);
		mv.laptopSize("inch", 15);
		mv.laptopService("perambur");
		
	}
}
