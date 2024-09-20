package BinarySearch_2d;



public class Searching_2d {
	    public static void main(String[] args) {
	        int[][] array = {
	            {1, 3, 5, 7},
	            {10, 11, 16,78,90},
	            {23, 30, 34, 60}
	        };
	        int target = 35;
	        
	        int[] result = search(array, target);
	        if (result != null) {
	            System.out.println("Target found at index: (" + result[0] + ", " + result[1] + ")");
	        } else {
	            System.out.println("Target not found in the array.");
	        }
	    }

		public static int[] search(int[][] array, int target) {
		        for (int i=0;i<=array.length;i++) {
		        int searcharray = binarysearch(array[i],target);
		        if (searcharray != -1) {
		        	return new int[] {i,searcharray};
		        }else
		        {
		        	return null;
		        }
		        }return null;
		        
		}
		
		public static int binarysearch(int[] arr,int target) {
			int start =0;
			int end = arr.length -1;
			while (start<=end) {
				int  mid = start + (end-start)/2;
				if (arr[mid]==target) {
					return mid;
				}
				else if (arr[mid]<target) {
					start = mid+1;
				}else {
					end= mid-1;
				}
				
			}return -1;
			
		}
	

	

}
