package polymorphism;

public class Method_Override_2 extends Method_Override_1 {
	
	
	@Override
	public void employeetDetails(String b) {
		super.employeetDetails(b);
	}
	@Override
	public void employeeid(int a) {
		super.employeeid(a);
	}
	@Override
	public void employeecompant(String c) {
		super.employeecompant(c);
	}
	
	
	
    	public static void main(String[] args) {
		Method_Override_2 mv=new Method_Override_2();
		mv.employeetDetails("har");
		mv.employeeid(20000);
		mv.employeecompant("Hexaware");
	}
	
	
	
	
	}


