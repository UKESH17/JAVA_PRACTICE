package Kunal_Kushwaha;

import java.util.HashMap;
import java.util.Map;

public class Occurence_of_each_number {
  public static void main(String[] args) {
	int [] arr = {1,2,3,4,3,4,51,0,0,0,0,0,0,0,3};
	count(arr);
	System.out.println();
}
  public static void count(int[] arr) {
	          // HashMap to store frequencies
	          HashMap<Integer, Integer> frequencyMap = new HashMap<>();

	          // Count frequencies
	          for (int num : arr) {
	              frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
	          }
              System.out.println(frequencyMap.keySet());
	          // Print the frequency of each element
	          for (int key : frequencyMap.keySet()) {
	              System.out.println(key + " occurs " + frequencyMap.get(key) + " times");
	          }
	          for (int key : frequencyMap.keySet()) {
	          if (frequencyMap.get(key)==1 ) {
	        	  System.out.print(key+" ");
	          }
	          
	          }
	          System.out.println("Unique Keys :");
	          for (int key : frequencyMap.keySet()) {
		 
		        	  System.out.print(key+" ");
		          
	          }
	          System.out.println();
	          System.out.print("Size: ");
	         System.out.print(frequencyMap.size());
	  
	          
  }
  }
