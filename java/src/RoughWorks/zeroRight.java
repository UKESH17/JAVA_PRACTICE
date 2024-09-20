package RoughWorks;

import java.util.Arrays;

public class zeroRight {
	public static void main(String[] args) {
		
int[] a = {0,4,2,0,0,7,0,-1};
for(int i=0;i<a.length-1;i++) {
	for(int j=i+1;j<a.length;j++) {
		if(a[i]!=0) {
			int temp = a[i];
			a[i]=a[j];
			a[j]=temp;
			
		}
		else {
			continue;
		}
		}
	}
System.out.println(Arrays.toString(a));
}
}

