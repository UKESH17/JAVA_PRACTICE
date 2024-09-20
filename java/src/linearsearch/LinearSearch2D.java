package linearsearch;

import java.util.Arrays;
import java.util.Scanner;

//Linear Search in 2D Array

public class LinearSearch2D {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the row");
		int row = sc.nextInt();
		System.out.println("Enter the size of the column");
		int column = sc.nextInt();
		System.out.println("Enter the numbers :-)");
		int[][] Array2D= new int[row][column];
		
		for(int i=0; i<row;i++) {
			for (int j=0;j<column;j++) {
				Array2D[i][j]=sc.nextInt();
			}
		}
		
	    System.out.println("2D Array:");
	        for (int[] rowArray : Array2D) {
	            System.out.println(Arrays.toString(rowArray));
	        }
	        
	     System.out.println("enter the target");
	     int Target = sc.nextInt();
	     System.out.println("The index");
	    int[] search = Find(Array2D,Target);
	    System.out.println(Arrays.toString(search));
	    
	    sc.close();
	        
	}  
    public static int[] Find (int[][] Array2D,int Target)  {
    	for(int i=0; i<Array2D.length;i++) {
			for (int j=0;j<Array2D[i].length;j++) {
                     if(Array2D[i][j]==Target) {
                    	 return new int[] {i,j};               }
			}
		}
    	return new int[] {-1,-1};
    }
    
   
}
