package qspyder;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_2d {
public static void main(String[] args) {
 Scanner sc =new Scanner(System.in);
 System.out.print("Enter the rows : ");
 int rows = sc.nextInt();
 System.out.print("Enter the columns : ");
 int columns = sc.nextInt();
 int[][] arr = new int[rows][columns];
 
 for (int i =0;i<rows;i++) {
	 for (int j =0; j<columns;j++) {
		 System.out.print("Enter the Number : ");
		 arr[i][j] = sc.nextInt();
	 }
 }
 System.out.println();
 System.out.print("Enter the Target : ");
 int Target = sc.nextInt();
	
 System.out.println("The 2d Array is :");
for(int[] Arrayrows : arr) {
	System.out.println(Arrays.toString(Arrayrows));
}
 
System.out.print("The Output is : ");
 System.out.print(Arrays.toString( Bs2d(arr,Target)));
}

public static int[] Bs2d (int[][] arr ,int Target) {
//	int[] output = new int[] {-1,-1};
	for (int i=0;i<arr.length;i++) {
		int SearchArray = BS(arr[i],Target);
		if(SearchArray!=-1) {
			return  new int[] {i,SearchArray};
		}
		}
	return null;
	}

public static int BS (int [] nums,int Target) {
	int start = 0;
	int end = nums.length-1;
	while (start<=end) {
		int mid = start+(end-start)/2;
	if (Target<nums[mid]) {
		end =mid-1;
	}
	else if (Target>nums[mid]) {
		start = mid+1;
	}
	else {
		return mid;
	}
	}return -1;
}

}
