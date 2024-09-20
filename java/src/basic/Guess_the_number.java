package basic;

import java.util.Scanner;

public class Guess_the_number{
     public static void main(String[] args) {
		int Sysnum = (int)(Math.random()*100);
		boolean flag =true;
		System.out.println("\t\tGame Starts...");
		
	 do {
		 Scanner sc = new Scanner (System.in);
		 
		 System.out.print("Guess the Number :");		
		 int usernum = sc.nextInt();
		 if (usernum > Sysnum) 
			 System.out.println("its high!");
		 else if (usernum<Sysnum)
			 System.out.println("low!");
		 
		 else if(usernum==Sysnum) {
			 System.out.println("Congrats!!!!");
			 System.out.println("Enter \n1.continue\n2.Exits");
			 int n = sc.nextInt();
			 if (n==1)
			 {		flag = true; 
		 }else {
			 System.out.println("Come Again!");
			 flag = false;}
		 }
		 
	 }	while(flag);
	
	} 
}
 