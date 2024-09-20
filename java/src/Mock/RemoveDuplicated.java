package Mock;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicated {
public static void main(String[] args) {
	int[] a = {4,4,1,2,4,2,3,9,99};
	ArrayList <Integer> arr = new ArrayList <Integer>();
	
   System.out.println(Arrays.toString(a));
	for(int i =0;i<a.length;i++) {
		if(!arr.contains(a[i])) {
			arr.add(a[i]); 
		}
		}
	System.out.print(arr);
	}
    
}

