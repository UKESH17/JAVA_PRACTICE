package BinarySearch;

public class orderAgnostic {
   public static void main(String[] args) {
	int[] arr = {60,40,30,20,0,-1,-8};
	int target = 0;
	System.out.println("The position of "+ target+"  "+"is"+" "+BinarySearch(arr,target));
	}
   public static int BinarySearch(int[] arr, int target) {
	   int start = 0;
	   int end = arr.length-1;
	   
	   
	   Boolean asc;
	   if (arr[start]>arr[end]) {
		   asc=false;
	   }else {
		   asc=true;
	   }
	   
	   if (asc) {
		 while(start<=end) {
		  int mid = start + (end-start)/2;
		   if (target>arr[mid]) {
			   start = mid+1;
		   }else if (target<arr[mid]) {
			   end =mid -1;
		   }else{
			   return mid;}
	   }return -1;
		 
	   }
	   else {
		   while(start<=end) {
			   int mid = start + (end-start)/2; 
			   if (target<arr[mid]) {
			   start = mid+1;
		   }else if (target>arr[mid]) {
			   end =mid -1;
		   }else{
			   return mid;}
	   }return-1;
	   }
   }
}
