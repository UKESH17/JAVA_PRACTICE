package qspyder;

import java.util.Arrays;

public class zig_zag {

	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] b = {5,6,7,8};
		int[] news = new int[a.length+b.length];
		for(int i =0,m=0,n=0;i<news.length;i++) {
			if(i%2==0) {
				news[i]=a[m++];
			}else {
				news[i]=b[n++];
			}
		}
System.out.println("the output : "+Arrays.toString(news));
	}

}
