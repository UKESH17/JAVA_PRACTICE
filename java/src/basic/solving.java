package basic;

import java.util.Scanner;

class solving{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the length :");
		
		int a = sc.nextInt();
		System.out.println("Enter the Char:");
		char[] nums = new char[a];
		for (int i=0;i<a;i++) {
			char arr = sc.next().charAt(0);
			nums[i] = arr;
		}
		
		for(int i=0; i<nums.length;i++) {
			System.out.println(nums[i]+":"+(int)nums[i]);
		}
		
		
	}
}