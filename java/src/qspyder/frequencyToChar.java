package qspyder;

public class frequencyToChar {
public static void main(String[] args) {
	String s="a3b2a3c1";
	String ans ="";
	char[] a =s.toCharArray();
	for(int i=0; i<a.length;i+=2) {
		for (int j =0;j<a[i+1]-48;j++) {
			ans = ans + a[i];
			
		}
	}
	System.out.println(ans);
	
}
}
