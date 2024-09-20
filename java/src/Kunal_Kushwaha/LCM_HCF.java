package Kunal_Kushwaha;

public class LCM_HCF {
   public static void main(String[] args) {
	   int a= 4;
	   int b = 5;
	   System.out.println("the Hcf is : "+ calculateHCF(a,b));
	   System.out.println("the Lcm is : "+calculateLCM(a,b));
}
   public static int calculateHCF(int a , int b) {
	   while (b!=0) {
		   int temp = b;
		   b = a%b;
		   a = temp;
	   }return a;
   }
   public static int calculateLCM(int a , int b) {
	   int product = a*b;
	   int HCF= product/calculateHCF(a,b);
	   return HCF;
   } 
   
}
