package polymorphism;

public class Abstract_ext extends Abstraction {

	@Override
	public void bikeColor() {
		System.out.println("Bike color: black");		
	}
	@Override
	public void speedLimit() {
		System.out.println("limt: 120km/hr");	
	}
	
	public static void main(String[] args) {
		Abstract_ext ab=new Abstract_ext();
		ab.bike_Model();
		ab.bike_BreakSytem();
		ab.bikeColor();
		ab.speedLimit();
	}
}
