package qspyder;

public class REVERSEsTRING {
public static void main(String[] args) {
	String s ="I am Ukesh";
	String[] arr = s.split(" ");
	StringBuilder newStr = new StringBuilder ();
	for (int i=0;i<arr.length;i++) {
		String z = rev(arr[i]);
		newStr.append(z+" ");
	}
	System.out.println(newStr);
}

public static String rev(String a) {
	StringBuilder newStr = new StringBuilder ();
	for (int i=a.length()-1;i>=0;i--) {
		newStr.append(a.charAt(i));
	}
	return newStr.toString();
}
}
