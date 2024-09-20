package qspyder;

public class Binary_Search {
  public static void main(String[] args) {
	int a[] = {1,3,4,6,7,9,10};
	Binary_Search B = new Binary_Search(); 
	int result = B.Bs(a, 7);
	System.out.println(result);
}
  public int Bs(int[] arr, int Target) {

	  int start = 0;
	  int end = arr.length-1;

	  
	  while (start<=end) {
		  int mid = start+(end-start)/2;
		  if (Target<arr[mid]) {
			  end = mid-1;	
			  }
		  else if (Target>arr[mid]) { 
		      start = mid+1;
		  }else {
			  return mid;
		  }  
	  }
	   
	return -1;
	  
  }
}
