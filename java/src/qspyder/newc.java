package qspyder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

public class newc {
	public static void main(String[] args) {
	int[] a= {1,2,3,4,3,1,2,4,0,5};
	Arrays.sort(a);
	int count=1;
    for(int i=0;i<a.length-1;i++) {
    	if (a[i]==a[i+1]) {
    		count++;
    	}else {
    		System.out.println(a[i]+"-"+count);
    		count=1;
    	}
    }System.out.println(a[a.length-1]+"-"+ count);

	}
}

