package qspyder;

public class array {
public static void main(String[] args) {
	String a = "Ukesh123";
	char[] s=a.toCharArray();
	for (int i =0; i<s.length;i++) {
		System.out.println(s[i]<0?true:false);
	}
}
}
