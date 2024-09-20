package qspyder;

import java.util.Arrays;
import java.util.Scanner;

public class Left_shift {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int k = sc.nextInt();
	int[] arr = {10,20,30,40,50}; 
    k=k%arr.length;
	int[] n = new int[arr.length];
	for (int i=0,j=0;i<arr.length;i++) {
		if(k<arr.length) {
			n[i]=arr[k++];
		}else {
			n[i]=arr[j++];
		}
	}
	System.out.println(Arrays.toString(arr));
	System.out.println(Arrays.toString(n));
	
}
}
