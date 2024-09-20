package Mock;

import java.util.Arrays;

public class StrongNumber {
	public static void main(String[] args) {
		int[] a = {1,1,2,2,2,3,3,4,5,6,6,7,7,7,7,7,7,7,7,8};
		removeDuplicates(a);
	}


	public static void removeDuplicates(int[] a) {
		int range = unique(a);
		int[] b = new int[range];
		int temp =a[0];
        b[0]=temp;
		for (int i =1,k=1;i<a.length;i++) {

			if (temp!=a[i]) {
				
				temp=a[i];
				
				b[k++]=temp;
				
			}
		}
	for(int i :b) {
		System.out.print(i+" ");
	}
	
	}
		public static int unique(int[] a){
			int unique =1;
			int temp =a[0];
			for (int i =1;i<a.length;i++) {

				if (temp!=a[i]) {
					temp=a[i];
					unique++;
				}
			}System.out.println("unique "+unique);
				return unique;
			}
		
	}

