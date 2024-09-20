package qspyder;

import java.util.Arrays;
import java.util.Scanner;

//smallest number / greatest number


public class suum {
public static void main(String[] args) {
	int[] arr = {5,2,4,1,8};
	System.out.println(Arrays.toString(arr));
	System.out.println("if you want smallest (enter S) for largest (enter L) ");
	Scanner sc = new Scanner (System.in);
	char a = sc.nextLine().charAt(0);
	if (a=='S') {
	int sum =arr[0];
	for (int i=0;i<arr.length-1;i++) {
		if (arr[i]>arr[i+1]) {
			sum = arr[i+1];
		}else {
			sum=arr[i];
		}
		
	}
	System.out.println("The smallest number of the arr:"+ sum);
}
	else if(a=='L') {
		int sum =arr[0];
		for (int i=0;i<arr.length-1;i++) {
			if (arr[i]<arr[i+1]) {
				sum = arr[i+1];
			}else {
				sum=arr[i];
			}
			
		}
		System.out.println("The largest number of the arr : "+sum);

	}
}
}
