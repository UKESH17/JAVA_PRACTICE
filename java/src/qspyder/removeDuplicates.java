package qspyder;

import java.util.Arrays;

public class removeDuplicates {
	public static void main(String[] args) {
		int[] a = {1,2,2,3,3,4,4,4,4};
		int[] b = new int[a.length];
		int index=0;
		for (int i=0;i<a.length-1;i++) {
			boolean flag = false;
			for (int j=0;j<i;j++) {
				if(a[i]==a[j]) {
					flag = true;
					break;
				}
			}
			if(flag==false) {
				b[index]= a[i];
				index++;
			}
		}	System.out.println(Arrays.toString(b));

	}
}
