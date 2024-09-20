package Kunal_Kushwaha;

public class Fibonacci_Series {
	public static void main(String[] args) {
		System.out.println(fibonnacci(10));

	}
	
	public static int fibonnacci(int n) {
		int a, b, c;
		a = 0;
		b = 1;
		for (int i = 0; i < n; i++) {

			System.out.print(a + " ");
			c = a + b;
			a = b;
			b = c;

		}
		System.out.println();
		System.out.print("the "+ n+"th "+"is ");
		return a;
	}

}
