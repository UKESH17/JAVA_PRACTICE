package Kunal_Kushwaha;

public class Permutations_Combinations {
    public static void main(String[] args) {
		int n = 5;
		int r =2;
		System.out.println("The Permutations "+n +"P"+r +" : "+Permutations(n,r)+" ways");
		System.out.println("The Combinatons "+n +"C"+r +" : "+Combinations(n,r) +" ways");
	}
    public static int Permutations(int n, int r) {
    	// nPr = n! / (n-r)!
    	int Permutations = fact(n)/fact(n-r);
    	return Permutations;
    }
    
    public static int Combinations(int n, int r) {
    	// nPr = n! / (n-r)!
    	int Permutations = fact(n)/(fact(r)*fact(n-r));
    	return Permutations;
    }
    
    public static int fact(int num) {
        int fact = 1;
        while (num>0) {
        	fact = fact*(num);
        	num--;
        	
        }return fact;
}
}
