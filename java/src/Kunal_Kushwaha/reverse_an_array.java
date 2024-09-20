package Kunal_Kushwaha;

import java.util.Arrays;

public class reverse_an_array {
	
public static void main(String[] args) {
	
	int [] num = new int[] {1,2,3,4,5,4949 };
	int [] arr = num;
	System.out.println("The copy : "+Arrays.toString(Copy(arr)));
	System.out.println("Sum of the given arr "+Arrays.toString(num) +" is "+ Sum(num));
	System.out.println("The reverse of the array : "+Arrays.toString(reverse(arr)));
	
}

public static int[] reverse(int[] nums) {
	for (int i =0; i<nums.length/2;i++) {
		int temp=nums[i];
		nums[i] = nums[nums.length-i-1];
		nums[nums.length-i-1] = temp;
	}return nums;
}

public static int[] Copy(int [] arr) {
	int[] newArr = new int[arr.length];
	for(int i =0; i<arr.length; i++) {
		newArr[i]= arr[i];
	}
	return newArr;
}
public static int Sum(int[] arr) {
	int sum = 0;
	for (int i=0; i<arr.length;i++) {
		sum = sum +arr[i];
	}return sum;
}
}                 