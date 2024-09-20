package qspyder;

import java.util.Arrays;

public class AdditionOf2d {
	public static void main(String[] args) {
		int [][] a = {{1,2,3 },{4,5,6},{1,0,1}};
		int [][] b = {{1,2,3},{4,5,6},{1,0,1}};
		System.out.println(Arrays.deepToString(Addition(a,b)));

	}

	public static int[][] Addition (int[][]a, int[][]b){
		int [][] c = new int[a.length ][a[0].length];
		for (int i =0 ; i<a.length;i++) {
			for (int j =0; j<a[i].length;j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}
}
