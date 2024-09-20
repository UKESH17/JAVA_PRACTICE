package basic;

import java.util.Arrays;

public class mock {
public static void main(String[] args) {
	int[] arr = {4,4,1,2,4,2,3}; 
    int[] n = new int[arr.length];
    for (int i =0,j=0;i<arr.length-1;i++) {
		   if(arr[i]!=arr[i+1]) {
			   n[j++]=arr[i];
		   }
		
	}
	System.out.println(Arrays.toString(n));
}
}
