package Kunal_Kushwaha;

public class Happy_number {
	public static void main(String[] args) {
		int num = 49;                                
		if (Sum(num) == 1) {
			System.out.println("it is a Happy number");
		} else {
			System.out.println("it is not happy");
		}
	}

	public static int Sum(int a) {
		int sum = 0;
		int num = a;
		
		while (num > 0) {
			int digit = num % 10;
			sum = sum + (digit * digit);
			num = num / 10;
		}System.out.println("--> " + sum);
		
       if(sum<1) {
    	   return -1;
       } else {
       if (sum != 1 && sum!=4 ) {
			num = sum;
		   sum = Sum(num);
		   
		   
		} else {
			if (sum == 1) {
				return 1;
			}return -1;
		}
		return sum;
		
       }
	}
}
