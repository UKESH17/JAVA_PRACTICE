package qspyder;

import java.util.Arrays;

public class pangram {
public static void main(String[] args) {
	String s = "The Quick brown fox jumps over the lazy dog";
	s=s.toUpperCase();
	String n= s.replace(" ","");
	System.out.println(n);
	String alphabets= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	boolean flag = false;
	for(int i =0;i<n.length();i++) {
		char ch = n.charAt(i);
		System.out.print(flag+ " ");
		System.out.println(alphabets.indexOf(ch)); 
		if (alphabets.indexOf(ch)!=-1) {
			flag = true;
			}else {
				flag = false;
				break;
			}
		}
	
    if (flag == true) {
    	System.out.println("Yes");
    }else {
    	System.out.println("No");
    }
	}
	
}

