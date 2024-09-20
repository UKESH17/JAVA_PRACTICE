package BinarySearch;
public class Leetcode1 {
	public static void main(String[] args) {
		char[] letter ={'a','d','j'}; 
		char target ='a';
		
	}
       public char nextGreatestLetter(char[] letter,char target) {
    	   int start = 0;
    	   int end = (letter.length)-1;
    	   
    	    		   
//    		 find the middle element
//    		  mid =(start+end)/2; might be possible the (start+end) exceeds the range of INTEGER
    	  
    	   while (start<=end) {   
    	      int mid = start + (end-start)/2;
    	   
    	        if (target<letter[mid]) {
    		      end = mid-1;
       	        }else{
    		       start = mid+1;
      	   }
       	        }
    	        
           return letter[start%letter.length];
    	   
       }
       }

