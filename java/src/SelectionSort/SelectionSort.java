package SelectionSort;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
    int[] arr = {2,5,2,7,1,0,8};
    System.out.println(Arrays.toString(selectionSort(arr)));
	}
	
	public static int[] selectionSort(int [] arr) {
		for (int i =0;i<arr.length;i++) {
			
			for (int j = i+1;j<arr.length-1;j++) {
				if (arr[j]<arr[i]) {
					int Smallest = j;
					int temp = arr[i];
					arr[i]=arr[Smallest];
					arr[Smallest] =temp;
				}
			}
		}return arr;
	}
}
