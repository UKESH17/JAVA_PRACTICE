package qspyder;

import java.util.Arrays;
import java.util.Scanner;

public class SoftSuave {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String digits=sc.next();
//		System.out.println();
//		System.out.println("Enter the digit");
//		String nums=sc.next();
		String digits = "6785432109";
		String nums ="564";
		int time = time(digits,nums);
		System.out.println(time);
	}

	public static int time(String digits, String nums) {
		
		char[] dig = digits.toCharArray();
		char[] num = nums.toCharArray();
		System.out.println(Arrays.toString(dig));
		System.out.println(Arrays.toString(num));
		int time=0;
		int j=0;
		int start=0;
		for(int i=0;i<dig.length;i++) {
			
			if(j<num.length) {
				if(num[j]==dig[i]) {
					int temp=start;
					System.out.println("i:"+dig[i]);
					temp= i-temp;
					
					if(temp<0) {
						temp= temp*-1;
					}
					
					System.out.println(temp);
					time = time+temp;
					start=i;
					
					j++;
					System.out.println();
					i=-1;
				}
				
			}
			else {
				break;
			}
		}
		return time;
		
	}
}
