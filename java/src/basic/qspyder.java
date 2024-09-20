 package basic;

import java.util.Scanner;

public class qspyder {
    public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("enter the number:");
		int num = sc.nextInt();
		
		System.out.println("The result is "+Strong(num));
	   if (num == Strong(num)){
		   System.out.println(num+" "+"is a Strong number");
	   }else {
		   System.out.println(num+" "+"is a not Strong number");
	   }
		}
    
    
    public static int Strong(int num) {
    	int Strong = 0;
		while(num>0) {
			int digit = num%10;
			Strong = Strong + fact(digit);
			num= num/10;
    }return Strong;
    }
		
    
    public static int fact(int num) {
    int fact = 1;
    while (num>0) {
    	fact = fact*(num);
    	num--;
    	
    }
    return fact;
    
}
}
