package Kunal_Kushwaha;

import java.util.Scanner;

//Leap year happens in years divisible by four, but every 100 years, there is not a leap year. 
//However, every 400 years, you do have a leap year.

public class Leapyear_or_not {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter the year : ");
	   int year = sc.nextInt();
	   if(LeapYear(year)) {
		   System.out.println("It is a Leap year");
	   }else {
		   System.out.println("It not a leap year");
	   }
	   
}
   public static boolean LeapYear(int year) {
	   boolean flag = false;
	   if ((year%4==0 && year %100!=0) || year%400==0) {
		   flag = true;
	   }else {
		   flag = false;
	   }
	   return flag;
   }
}
