package qspyder;

import java.util.Scanner;

public class missing {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
    int[] a = {1,2,3,4,5,7,9,22};
	for (int i =0; i<a.length-1;i++) {
		if (a[i]+1==(a[i+1])) {
			continue;
		}else {
			System.out.println("missing number :"+(a[i]+1));	
			
		}
	}
}
}
