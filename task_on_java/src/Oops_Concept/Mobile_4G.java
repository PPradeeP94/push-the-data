package Oops_Concept;

public class Mobile_4G extends Mobile_3G{
	
	public void oppoPhone() {
		System.out.println("Good demand");
	}
	public void vivoPhone() {
		System.out.println("Bad Demand ");
	}
	public static void main(String[] args) {
		Mobile_4G mb=new Mobile_4G();
		mb.airtelSim();
		mb.ideaSim();
		mb.aircelSim();
		mb.vodafoneSim();
		mb.oppoPhone();
		mb.vivoPhone();
	}

}
