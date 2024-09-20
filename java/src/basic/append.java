package basic;


import java.util.Arrays;
import java.util.Scanner;

public class append {
 public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	String[] a = sc.nextLine().split(" ");
	System.out.println(Arrays.toString(a));
	char[] nums = new char[a.length];
	for(int i =0;i<a.length; i++) {
		nums[i]=(char)Integer.parseInt(a[i]);
	}
	System.out.println("nums : "+Arrays.toString(nums));
	
	
	
	
	
//			int sum =0;
//	for(int i =0;i<a.length;i++) {
//		sum = Integer.parseInt(a[i]) +Integer.parseInt(a[i]);
//	}System.out.println(sum);
	
	
 }
}
