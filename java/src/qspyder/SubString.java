package qspyder;

import java.util.ArrayList;
import java.util.Arrays;

public class SubString {
public static void main(String[] args) {
String s="Ukesh";
int n =s.length();
ArrayList<char[]>arr = new ArrayList<>();
for (int i =0;i<n;i++) {
	for(int j=i;j<n;j++) {
		String t ="";
		for(int k=i;k<=j;k++) {
			t+=s.charAt(k);
			System.out.print(s.charAt(k));
			
		}arr.add(t.toCharArray());
		System.out.println();
	}
	
}
System.out.println(Arrays.deepToString(arr.toArray()));

}

}
