package Patterns;

public class sum_1 {
 
	public static void main(String[] args) {
		int n =7;
		int num =3;
		for (int i =0; i<n;i++) {
			for (int j =0; j<n;j++) {
				if (i==0 || j==0 || i==n-1 || j==n-1 ) {
					System.out.print(num);
				}
				else if (i==1 || j==1 || i==n-2 || j==n-2 ) {
					
					System.out.print(num-1);
				}
				else if (i==2 || j==2 || i==n-3 || j==n-3 ) {
					
					System.out.print(num-2);
				}else {
					
					System.out.print(num-3);
				}
			}
			System.out.println();
		}
	}
	
	
}
