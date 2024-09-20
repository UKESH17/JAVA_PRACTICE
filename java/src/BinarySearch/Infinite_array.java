package BinarySearch;

public class Infinite_array {
	
	
	// here we don't known the length of the array 
	
	  public static void main(String[] args) {
		int[] arr = {22,33,44,55,66,77,88,99,100};
		int target =55;
		Infinite_array find= new Infinite_array();
		System.out.println(find.findRange(arr,target));
	}
	
	
      public int findRange(int[] arr, int target) {
    	  
	       
	       // since it is infinite array we need to first find the end and start point where the target is present
	       // so we need to first start with the box of two
	       // then we need to double the size of the box 
	       // end= end +(end-start+1)*2;  	  
    	  
    	  int start =0;
    	  int end =1;
    	  
    	  while (target> arr[end]){
    	       int newstart= end+1;       
    	       end = end + (end-start +1)*2;
    	       start = newstart;
    	       
    	  }
    	  System.out.println("start point : "+start);
    	  System.out.println("end point : "+end);
    	  return  Find(arr,target,start,end);
    	  }
      
      public int Find(int[] arr,int target,int start, int end) {  	   
   		   
//   		 find the middle element
//   		  mid =(start+end)/2; might be possible the (start+end) exceeds the range of INTEGER
   	  
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
