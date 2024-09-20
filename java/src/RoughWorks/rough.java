package RoughWorks;

import java.util.Arrays;

public class rough {
public static void main(String[] args) {
	String s ="I love you by power";
	String[] arr = s.split(" ");
	System.out.println(Arrays.toString(arr));
	String d ="";
	for(int i=0;i<arr.length;i++) {
		if(i<arr.length-1) {
		d+=rev(arr[i])+" ";
		}
		else {
			d+=rev(arr[i]);	
		}
	}
	System.out.println(d);
}

public static String rev(String s , String r) {
	int[] arr = { 1,2};
	int [] a=arr;
	return String;
	
    }
    
    
    
}



