package RoughWorks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class removeDupes {
public static void main(String[] args) {
	int[] arr = {1,2,1,3,4,3,7,7,7, 5};
	ArrayList <Integer> arr1 = new ArrayList<>();
	for(int i =0;i<arr.length;i++) {
		if (!arr1.contains(arr[i])) {
			arr1.add(arr[i]);
		}
	}
	System.out.println(Arrays.toString(arr));
	System.out.print("REMOVED DUPLICATES : ");
	System.out.print(arr1);
	System.out.println();
	System.out.print("UNIQUE ELEMENTS : " + unique(arr));
}
public static ArrayList<Integer> unique(int[] arr) {
	ArrayList<Integer> unique = new ArrayList<Integer> ();
	HashMap<Integer, Integer> map = new HashMap<>();

	for(int i =0;i<arr.length;i++) {
		map.put(arr[i],map.getOrDefault(arr[i],0)+1);
	}
	
	for(Integer key : map.keySet()) {
		if(map.get(key)==1) {
			unique.add(key);
		}
	}
	return unique;
	
}
}
