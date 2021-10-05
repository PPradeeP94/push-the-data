package task_on_java;

 public class Array_Two_Dimensional {
	
	 public static void main(String[] args) {		 
 /*				
		int [][] a= new int [3][2];
		
		a[0][0]=11;
		a[0][1]=21;
		a[1][0]=31;
		a[1][1]=41;
		a[2][0]=51;
		a[2][1]=61;
	//	a[2][0]=71;
	//	a[2][1]=81;
	//	a[2][2]=91;
	
		System.out.println(a.length);
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(a[i][j]+" ");			
			}
			
			}
 */
		int []a= {1,2,3};
		int []b= {4,5,6};
		int []c= {7,8,9};
		
		int [][]d= {{1,2,3},
				{4,5,6,7,8},
				{7,8,9,10,11}};
		
		int [][]cd= {a,b,c};
		
		
		
		for (int i = 0; i <3; i++) {
			for (int j = 0; j <cd[i].length; j++) {
				System.out.print(d[i][j]+" ");
			}
			}
			System.out.println();
			}
 
 }
 
 
		
	 



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	

