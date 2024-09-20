package linearsearch;

import java.util.ArrayList;
import java.util.List;

public class even_number_of_digits {
	public static void main(String[] args) {
		int[] number= {1,121,4562,22,906768,12000};
		System.out.println("the even number in the array :"+even(number));
		List<Integer> count_elements=even(number);
		int count = count_elements.size();
		System.out.println("count of even number :"+count);
		
	
	}
	
    public static List<Integer> even(int[] number) {
    	List <Integer> result = new ArrayList<>();
    	for (int i = 0; i<number.length;i++) {
    		if (countdigits(number[i])%2==0) {
    			result.add(number[i]);
    		}
    	   }return result;
    	}
    
   public static int countdigits(int num ) {
	   int digitcount=0;
	   if (num==0) {
		   digitcount=1;
	   }
	   while (num>0) {
		  num= num/10;
		  digitcount++;
	   }
	   return digitcount;
    }
}
