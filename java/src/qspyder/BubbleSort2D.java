package qspyder;

import java.util.Arrays;

public class BubbleSort2D {

	public static void main(String[] args) {
		int [][] a = {{2,4,1,7,0},{1,2,9,3,1}};
		for (int[] i:a) {
			System.out.println(Arrays.toString(i));}
		System.out.println("Sorted ");
		for (int[] i:a) {
		System.out.println(Arrays.toString(BubbleSort(i)));}
	}
	
	public static int[] BubbleSort (int[] a) {
		for (int i =0 ; i<a.length;i++) {
			for (int j =0; j<a.length-1;j++) {
				if (a[j]>a[j+1]) {
				int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;}
			}
		}
		return a;
	}
}
