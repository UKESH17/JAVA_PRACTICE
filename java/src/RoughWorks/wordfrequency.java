package RoughWorks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class wordfrequency {
	public static void main(String[] args) {
		System.out.println("Enter the line ->");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String b =s.toLowerCase();
		String[] arr = b.split(" ");
		HashMap<String,Integer> map1 = frequency(arr);
		for(String key : map1.keySet()) {
			System.out.println(key +" : "+map1.get(key));
		}
		

	}

	public static HashMap<String, Integer> frequency(String[] arr) {
		HashMap<String, Integer> map = new HashMap<>();

		for(int i =0;i<arr.length;i++) {
			map.put(arr[i],map.getOrDefault(arr[i],0)+1);
		}
		return map;
	}
}
