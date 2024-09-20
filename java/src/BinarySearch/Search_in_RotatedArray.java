package BinarySearch;

//Not completed

 // Search in rotated array
public class Search_in_RotatedArray {
     public static void main(String[] args) {
	    int []nums = {4,5,6,7,8,0,1,2} ;
	    int target = 0;
	    System.out.println(FindIndex(nums,target));
	}
     
 public static int FindIndex(int[] nums,int target) {
	 int start = 0;
	 int end = nums.length -1;
     
	 while (start<=end) {
		 int mid = start +(end-start)/2;
		 if (nums[mid]>nums[mid+1]) {
			 
		 }
	 }return -1;
	 
}
     
}
