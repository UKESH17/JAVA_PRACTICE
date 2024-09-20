package Bubble_sort;

import java.util.Arrays;

public class Bubble_sort {
  public static void main(String[] args) {
	  int[] arr = {2,8,6,1,999,9,0,4};
	  System.out.println(Arrays.toString(bubbleSort(arr)));
  }
  static int[] bubbleSort(int[] arr) {
	  for (int i =0; i<arr.length;i++) {
		  for(int j=0; j<arr.length-1;j++) {
			  if (arr[j]>arr[j+1]) {
				  int temp=arr[j];
				  arr[j]=arr[j+1];
				  arr[j+1]=temp;
			  }
		  }
	  }
	  return arr;
  }
  
	}


