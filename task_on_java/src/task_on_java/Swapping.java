package task_on_java;

public class Swapping {
	
	static int f1=0, f2=1,f3;
	public static void main(String[] args) {
		
		System.out.println(f1);
		System.out.println(f2);
		
		for (int i = 0; i <50; i++) {
			if (i==20) {
				break;
			}
			
			f3=f1+f2;
			
			System.out.println(f3);
				
			f1=f2;
			f2=f3;
		}
	
}

}
