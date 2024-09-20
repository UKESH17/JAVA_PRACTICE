package basic;

import java.util.Arrays;

public class reverse_This_is_Awesome  {
      public static void main(String[] args) {
		String a ="this is awesome";
		String[] arr = a.split(" ");
		System.out.println(Arrays.toString(arr));
		System.out.println(reversed(output(arr)));
	}
      
      public static String output(String[] arr) {
    	  StringBuilder sb = new StringBuilder ();
    	  for (int i=0; i<=arr.length-1;i++) {
    		  String reversedvalue = reversed(arr[i]);
    		  sb.append(reversedvalue+" ");
    		 
    	  }
    	  return sb.toString();
      }
      
      public static String reversed(String a) {
    	  StringBuilder sb = new StringBuilder ();
    	  for(int i =a.length()-1; i>=0;i--) {
    		  char c = a.charAt(i);
    		   sb.append(c);
    	  }return sb.toString();
      }
}
