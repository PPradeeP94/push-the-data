package task_on_java;

public class Swapping_4digit {
	
	static int f,f1=2,f2=1,f3=1;
	
	public static void main(String[] args) {
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		//System.out.println(f4);
		
		for (int i = 0; i <=10; i++) {
			
		f=f1+f2+f3;
		
		System.out.println(f);
		f1=f2;
		f2=f3;
		f3=f;
	}
	}
}
