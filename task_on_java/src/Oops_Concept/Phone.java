package Oops_Concept;

public class Phone {
	
	public void onePlus() {
		System.out.println("One Plus: Made in China");
	}
	public void onePlus(String a) {
		System.out.println("Model Name" +"  "+a);
	}
	public void onePlus(int a) {
		System.out.println("IME number"+"  "+a);
	}
	public void onePlus(int a,String b) {
		System.out.println(b +"  "+ a);
	}
	public void onePlus(String a,String b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Phone ph=new Phone();
		ph.onePlus();
		ph.onePlus("one+1");
		ph.onePlus(12345);
		ph.onePlus(20000,"price");
		ph.onePlus("Review", "good");
		
	}





}
