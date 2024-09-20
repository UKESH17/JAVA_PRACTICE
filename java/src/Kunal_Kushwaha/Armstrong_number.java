package Kunal_Kushwaha;

public class Armstrong_number {
	public static void main(String[] args) {
		int n = 153;
		String a = Integer.toString(n);
		int length = a.length();
		
		int num= n;
        int sum=0;
		while (num > 0) {
			int digit = num % 10;
			sum = (int) (sum + Math.pow(digit,length));
            num = num/10;
		}
		
		System.out.println(n +" & "+sum);
		if (n == sum) {
			System.out.println("Its is Amstrong Number");
		}else {
			System.out.println("its not a Amstrong Number");
		}
	}

}
