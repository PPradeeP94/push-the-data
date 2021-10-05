package Oops_Concept;

public class Panasonic_Service implements Panasonic {

	@Override
	public void fridge() {
		System.out.println("Double door");
	}

	@Override
	public void microven() {
		System.out.println();
	}
	public static void main(String[] args) {
		Panasonic_Service ps=new Panasonic_Service();
		ps.fridge();
		ps.microven();
	}
	
	

}
