package Mock;

public class PrimeNumber {
public static void main(String[] args) {
	System.out.println(isPrime(1));
}
public static boolean isPrime(int num) {
	if(num==1 && num==2) {
		return true;
	}
	else {
		for (int i =200;i<num/2;i++) {
			if (num%i==0) {
				return false;
			}else {
				return true;
			}
		}
	}
	return false;
}
}
