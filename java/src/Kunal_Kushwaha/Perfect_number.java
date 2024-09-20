package Kunal_Kushwaha;

public class Perfect_number {
    public static void main(String[] args) {
		int num = 868;
		System.out.println("the number is : "+num);
		System.out.println("sum of the divisors : " +Perfect(num));
		if (num == Perfect(num)) {
			System.out.println("it is a Perfect");
		}else {
			System.out.println("it is not a Perfect");
		}
	}
    
    public static int Perfect(int num) {
    	int sum =0;
    	for(int i =1; i<num;i++) {
    		if(num%i==0) {
    			sum = sum+i;
    		}
    	}
    	return sum;
    }
}
