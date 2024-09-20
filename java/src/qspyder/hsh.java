package qspyder;

import java.util.Arrays;

public class hsh {

	public static void main(String[] args) {
		String s="i will be goodboy";
		String[] arr= s.split(" ");
		StringBuilder str = new StringBuilder();
		for(int i=0;i<arr.length;i++) {
			if (i!=arr.length-1) {
				str.append(rev(arr[i])+" ");
			}else {
				str.append(rev(arr[i]));
			}
		}
		System.out.println(str);

	}

	public static String rev(String s) {

		char[] arr = s.toCharArray();
       if (s.length()>2) {
		for (int i =0;i<s.length()-2;i=i+2) {
			char temp = arr[i];
			arr[i] = arr[i+1]  ;
			arr[i+1]=temp;
		}
       }else {
    	   for (int i =0;i<s.length()-1 ;i++) {
   			char temp = arr[i];
   			arr[i] = arr[i+1]  ;
   			arr[i+1]=temp;
       }
       }
		String str = new String (arr);



		return str;
	}
}

