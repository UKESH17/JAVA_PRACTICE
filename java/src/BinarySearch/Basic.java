package BinarySearch;

public class Basic {
       public static void main(String[] args) {
		    int[] arr= {2,3,5,7,8};
		    int target = 5;
		    System.out.println(Find(arr,target));
	   }      
       public static int Find(int[] arr,int target) {
    	   int start = 0;
    	   int end = (arr.length)-1;
    	   
    		   
//    		 find the middle element
//    		  mid =(start+end)/2; might be possible the (start+end) exceeds the range of INTEGER
    	  
    	   while (start<=end) {   
    	      int mid = start + (end-start)/2;
    	   
    	        if (target<arr[mid]) {
    		      end = mid-1;
       	        }else if (target>arr[mid]) {
    		       start = mid+1;
        	    }else {
    		      return mid;
    	        }
    	        
           }return -1;
    	   
       }
}
