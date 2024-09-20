package qspyder;

import java.util.Arrays;

public class circularPrimenumber {
   public static int[] possibleForms(int a) {
	  
	  String N = String.valueOf(a);
	  
	   int n = String.valueOf(a).length();
	   int[] possibleForms = new int[n];
	   char[] arr = N.toCharArray();
	   
	      for(int i =0,k=0;i<arr.length;i++) {
	    	  char first = arr[0];
	    	 
	    	  for(int j =0;j<arr.length-1;j++) {
	    		  arr[j]=arr[j+1];
	    	  }
	    	  arr[arr.length-1]=first;
	    	  System.out.println("arr "+Arrays.toString(arr));
	    	  possibleForms[k++]= Integer.valueOf(new String(arr));
	      }
		return possibleForms;
   }
  
   public static int length(int a) {
	   int count = 0;
	   while (a>0) {
	   a=a/10;
	   count++;
	   }
	   return count;
   }
  
   public static boolean prime (int a) {
	   if (a==0 || a==1) {
		   return false;
	   }
	   for (int i=2;i<a/2;i++) {
		   if (a%i==0) {
			   return false;
		   }else {
			   return true;
		   }
	   }
	   return false;
   }
   
   public static void main(String[] args) {
	   int num = 1193;
	   System.out.println("The num is "+num);
	   System.out.println("all possible forms :");
	   int[] arr =possibleForms(num);
	   System.out.println(Arrays.toString(arr));
	   
	   Boolean isprime = true;
	   for (int i =0; i<arr.length;i++) {
		   
		   if (prime(arr[i])==false) {
			   isprime = false;
			   break;
		   }
	   }
	   System.out.println((isprime)==true?"yes":"no");
}
}

