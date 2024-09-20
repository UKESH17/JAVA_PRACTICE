package Kunal_Kushwaha;

public class palindrome {
   public static void main(String[] args) {
    String a ="aia";
    String reversed = reverse(a);
	if(a.equals(reversed)) {
		System.out.println("It is Palindrome '(" + a +" = "+reversed+")'");
	}else {
		System.out.println("It is not a Palindrome '(" + a +" != "+reversed+")'");
	}
}	   
   
   public static String reverse(String a) {
	   StringBuilder newString = new StringBuilder();
	   for (int i = a.length()-1;i>=0;i--) {
		   newString.append(a.charAt(i));
	   }
	   return newString.toString();
   }
}

