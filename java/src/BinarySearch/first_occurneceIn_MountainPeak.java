package BinarySearch;

public class first_occurneceIn_MountainPeak {
	public static void main(String[] args) {
		int[] arr = {1,2,3,5,3,0};
		int target =0;
		System.out.println(search(arr,target));
	}
	public static int search(int[]nums,int target) {
		
		int start = 0;
		int end =nums.length -1;
		int ans =-1;
		while (start<=end) {
			
			int mid = start + (end-start)/2;
			if (nums[mid]>target) {
				end = mid-1;
			}else if (nums[mid]<target) {
				start = mid+1;
			}else {
				ans = mid;
				end = mid-1;

			}	
		}return ans;
}
	}
