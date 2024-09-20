package Patterns;

public class zoho {
public static void main(String[] args) {
	String s ="ZOHO";
	int n = s.length();
	
	for(int i =0 ; i<n;i++) {
		
		for (int j=0;j<n;j++) {
			if (i==j) {	
				System.out.print(s.charAt(i));	
			}
			else if (i+j==n-1 ) {
				System.out.print(s.charAt(n-1-i));
			}
			else {
				System.out.print(" ");
			}
			}
		System.out.println();
		}
	} 
}

