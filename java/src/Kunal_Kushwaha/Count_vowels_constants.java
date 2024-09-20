package Kunal_Kushwaha;

import java.util.Scanner;

public class Count_vowels_constants {
        public static void main(String[] args) {
        	String vowels = "aeiouAEIOU";
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the String : ");
            String a = sc.next();
            
            int Count1=0; // count the vowels
            int Count2=0; // count the constant
            
            for(int i = 0;i<a.length();i++) {
            	char ch = a.charAt(i);
            	if (vowels.indexOf(ch) != -1) {
            		Count1++;
            	}else {
            		Count2++;
            	}
            }
            
            System.out.println("the count the vowels in "+a+" = "+Count1);
            System.out.println("the count the Constants in "+a+" = "+Count2);
            
		}
        
}
