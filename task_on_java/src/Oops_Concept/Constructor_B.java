package Oops_Concept;

public class Constructor_B extends Constructor{
	
	public	Constructor_B () {
		super();
		System.out.println("Default child");
	}
	
	public	Constructor_B (int a) {
		super("tyuu");
		System.out.println(" child  A");
		
	}
	
	public	Constructor_B (String b) {
		super(89);
		System.out.println("child B");
		
	}
	
	public static void main(String[] args) {
		Constructor_B cb=new Constructor_B("uuu");
	
		
	}

}
