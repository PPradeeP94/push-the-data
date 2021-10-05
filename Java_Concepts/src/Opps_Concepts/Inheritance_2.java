package Opps_Concepts;

public class Inheritance_2 extends Inheritance_1 {

	public void reader() {
		System.out.println("error reading");
	}

	public void showable() {
		System.out.println("showed");
	}
	
	public static void main(String[] args) {
		Inheritance_2 in = new Inheritance_2();
		in.printer();
		in.scanner();
		in.error();
		in.reader();
		in.showable();
	}

}
