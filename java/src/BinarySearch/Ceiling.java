package BinarySearch;

public class Ceiling {
    public static void main(String[] args) {
		int[] arr= {70,66,65,61,60,56};
		
		int target= 67;
		System.out.println("The Ceiling of the target : "+ceiling(arr,target));
    }
	
		static int ceiling(int[] arr, int target)
		{
			int start = 0;
			int end = arr.length - 1 ;
			
			boolean asc;
			if (arr[start]<arr[end]) {asc = true;}
			else {asc=false;}
		  
	       if (asc) {
			while (start<=end){
				int mid = start + (end-start)/2;
				if (arr[mid]<target) {
					start=mid+1;
				}else if (arr[mid]>target) {
					end=mid-1;
				}else {
					return arr[mid];
				}
				}	return arr[start];
			}

			else {
				while (start<=end){
					int mid = start + (end-start)/2;
					if (arr[mid]>target) {
						start=mid+1;
					}else if (arr[mid]<target) {
						end=mid-1;
					}else {
						return arr[mid];
					}	
				}
				return arr[end];
				}
	       }
}
			
			
			
			
			
	
		
		  
		
 

