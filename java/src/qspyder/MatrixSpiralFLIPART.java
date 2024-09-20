package qspyder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//
//	_________________
//	|               | 
//	| ------------> |
//	| >---------> | |
//	| | >-------| | |
//	| | ^-------< | |
//	| ^---------- < |
//	|_______________|
//	

public class MatrixSpiralFLIPART {
public static void main(String[] args) {
	int[][] a = {{1,2,3,4,5,5},
	             {6,7,8,9,0,5},
	             {1,2,3,4,5,3}
	            };  
//	for(int []i: a) {
//		System.out.println(Arrays.toString(i));
//	}
	
	 int n = 5;
	 for (int []i :generateMatrix(n)) {
		 System.out.println(Arrays.toString(i));
	 } 
}

public static void SpiralClockWise(int[][]a) {
     int n = 6;
     int right =0,top =0 ,left =5,bottom =2;
     
     while (right <= left && top <= bottom) {
    	 
    	 for (int i = right; i<=left ;i++) {
    		 System.out.print(a[top][i]+" ");
    	 }top++;
    	 
    	 for (int i =top ; i<=bottom ;i++) {
    		 System.out.print(a[i][left]+" ");
    	 }left--;
	 
    	 for (int i = left; i>=right ;i--) {
    		 System.out.print(a[bottom][i]+" ");
    	 }bottom--;
    	 
    	 for (int i = bottom; i>=top ;i--) {
    		 System.out.print(a[i][right]+" ");
    	 }right++;
     }
     
}

public static void SpiralAntiClockWise(int[][]a) {
    int n = 6;
    int right =0,top =0 ,left =n-1,bottom =n-1;
    
    while (right <= left && top <= bottom) {
   	 
   	 for (int i = left; i>=right ;i--) {
   		 System.out.print(a[top][i]+" ");
   	 }top++;
   	 
   	 for (int i =top ; i<=bottom ;i++) {
   		 System.out.print(a[i][right]+" ");
   	 }right++;
	 
   	 for (int i = right; i<=left ;i++) {
   		 System.out.print(a[bottom][i]+" ");
   	 }bottom--;
   	 
   	 for (int i = bottom; i>=top ;i--) {
   		 System.out.print(a[i][left]+" ");
   	 }left--;
    }
    
}
public static List<Integer> spiralOrder(int[][] a) {
    List<Integer> arr = new ArrayList<Integer>();
    int right =0, top =0, left = a[0].length-1, bottom = a.length-1; 

     while (right <= left && top <= bottom) {
	 
	 for (int i = right; i<=left ;i++) {
		 arr.add(a[top][i]);
	 }top++;
	 
	 for (int i =top ; i<=bottom ;i++) {
		 arr.add(a[i][left]);
	 }left--;
 
	 for (int i = left; i>=right ;i--) {
		 arr.add(a[bottom][i]);
	 }bottom--;
	 
	 for (int i = bottom; i>=top ;i--) {
		 arr.add(a[i][right]);
	 }right++;
 }
 return arr;
}

public static int[][] generateMatrix(int n) {
    int [][] a = new int[n][n] ;
     int right =0,top =0 ,left =n-1,bottom =n-1,num=0;
     
     while (right <= left && top <= bottom) {
    	 
    	 for (int i = right; i<=left ;i++) {
    		 a[top][i]= ++num;
    	 }top++;
    	 
    	 for (int i =top ; i<=bottom ;i++) {
    		 a[i][left] = ++num;
    	 }left--;
	 
    	 for (int i = left; i>=right ;i--) {
    		 a[bottom][i] = ++num; 
    	 }bottom--;
    	 
    	 for (int i = bottom; i>=top ;i--) {
    		a[i][right] = ++num;
    	 }right++;
     }return a;
    }

}
