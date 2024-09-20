package qspyder;

import java.util.Arrays;

public class largest {
public static void main(String[] args) {
	int target = 10;
	int [] nums = {4,2,6,8,12,0,10,2,11,-1};
	sum(nums,target);
	
}
public static void sum(int[] a, int target) {
	for (int i =0; i<a.length;i++) {
		for (int j = i+1; j<a.length;j++) {
		      if (a[i]+a[j]==target) {
		    	  System.out.println(Arrays.toString(new int[] {a[i],a[j]}));
		      }	
		}
	}
}
}

