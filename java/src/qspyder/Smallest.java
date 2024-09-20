package qspyder;

import java.util.Arrays;

public class Smallest {
	public static void main(String[] args) {
		int [][] a = {{1,3,7,-2,4,1},{1,2,4,5,6}};
		System.out.println(Arrays.deepToString(a));
		System.out.println(smallest2D(a));
	}
	private static int smallest2D(int[][] a) {
		System.out.println("hello");
		int small = a[0][0];
		for (int i =0 ; i<a.length;i++) {
			for (int j =0; j<a[i].length;j++) {
				if (a[i][j]<small) {
					small =a[i][j];
				}
			}
		}
		return small;
	}


	public static int smallest(int [] a) {
		int Small = a[0];
		for (int i =1; i<a.length-1;i++) {
			if (a[i]<Small) {
				Small = a[i];
			}
		}
		return Small;
	}
}
