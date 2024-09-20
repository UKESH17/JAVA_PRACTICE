package BinarySearch;

import java.util.Arrays;

public class Find_the_firstandend_Occurences {

	public static void main(String[] args) {
		int[] nums = {1,2,2,2,3,4,5,6};
		int target =2;
		
		Find_the_firstandend_Occurences occurences = new Find_the_firstandend_Occurences();
		int[] Occurences = occurences.searchRange(nums, target);
		System.out.println(Arrays.toString(Occurences));

	}
	public int[] searchRange(int[] nums, int target) {
		int[] ans= {-1,-1};
		int start = search(nums,target,true);
		int end =search (nums,target,false);
		
		ans[0] = start;
		ans[1] = end;
		
		return ans;
	}
	
	public int search(int[]nums,int target,boolean Findfirst) {
	
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
				if (Findfirst) {
					end = mid-1;
				}else {
					start = mid+1;
				}	
			}	
		}return ans;
		
		
		
	}

}
