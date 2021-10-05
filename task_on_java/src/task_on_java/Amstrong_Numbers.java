package task_on_java;

public class Amstrong_Numbers {
	
	     static int n,ans,a;
	
	public static void main(String[] args) {
			
		for (int i = 1; i < 1000; i++) {
			n=i;
			ans=0;
			while (n >= 0) {
				a=n%10;
				ans=ans+(a*a*a);
				n=n/10;
				
			}
			if (ans==i) {
				System.out.println("Armstrong Number"+ans);
			}
		}
		
	}

}
