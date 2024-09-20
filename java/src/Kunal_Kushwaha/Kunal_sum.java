package Kunal_Kushwaha;

//Kunal is allowed to go out with his friends only on the even days of a given month. 
//Write a program to count the number of days he can go out in the month of August.

public class Kunal_sum {
    public static void main(String[] args) {
		int count =0;
		for (int i =1 ; i<=28;i++ ) {
			if (i%2==0) {
				count++;
			}
		}
		System.out.println("the number days Kunal can go out is "+count+" days");
	}
}
