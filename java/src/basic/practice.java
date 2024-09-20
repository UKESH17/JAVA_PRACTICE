package basic;

import java.util.ArrayList;
import java.util.Arrays;

public class practice {
	public static void main(String[] args) {
		int[] l1 = new int[] {2,3,4};
		int[] l2 = new int [] {4,2,4};
		int [] op = addTwoNumbers(l1,l2);
		System.out.println(op[1]);
		System.out.println(Arrays.toString(op));


	}

	public static int[] addTwoNumbers(int[] l1, int[] l2) {
		StringBuilder a = new StringBuilder();
		StringBuilder b = new StringBuilder();

		for (int i : l1){
			a.append(i);
		}
		for (int j : l2){
			b.append(j);
		}
		int n1 = reverse(Integer.parseInt(a.toString())); 
		int n2 = reverse(Integer.parseInt(b.toString()));    

		int sum = reverse(n1+n2);
		int[] output = new int[length(sum)];
		int k=0;
		while(sum>0) {
			int digit= sum%10;
			output[k++]=digit;
			sum=sum/10;
		} 

		return output;

	}
	
	public static int length(int num) {
		int count =0;
		while (num>0) {
			num = num/10;
			count++;
		}
		return count;
	}
	
	public static int reverse(int num){
		int rev =0;
		while (num>0){
			int digit = num%10;
			rev   = rev*10+digit;
			num= num/10;
		}return rev;
	}
}




