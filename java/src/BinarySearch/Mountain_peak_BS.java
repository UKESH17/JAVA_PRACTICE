package BinarySearch;

public class Mountain_peak_BS {
 public static void main(String[] args) {
	
	int[] arr = {0,4,6,5,4,3,1};
	
	Mountain_peak_BS find= new Mountain_peak_BS();
	System.out.println(find.findPeak(arr));
}
 public int findPeak(int[] arr) {
	int start = 0;
	int end = arr.length -1;
	
	while (start<end) {
		int mid = start + (end-start)/2;


		if (arr[mid]>arr[mid+1] ){
			end=mid;
		}else {
			start = mid+1;
			}	    
		 
	}
	return arr[start];
	 
 }
 
 
}
