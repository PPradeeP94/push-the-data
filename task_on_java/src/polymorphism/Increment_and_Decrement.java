package polymorphism;

public class Increment_and_Decrement {
	
	static int i=3;
	
	public static void main(String[] args) {
		// Increment
		
	//	System.out.println(i);
		System.out.println(i++);
		System.out.println(++i);
		
		System.out.println(i++ + ++i);
		System.out.println(i++ + i++);
		System.out.println(++i + ++i);
		System.out.println(++i + i++);
		
		//Decrement
		
		System.out.println(i--);
		System.out.println(--i);
		System.out.println(--i + --i);
		System.out.println(i-- + --i);
		
	}
	
	

}
