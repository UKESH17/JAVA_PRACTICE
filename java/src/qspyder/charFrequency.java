package qspyder;

public class charFrequency {
public static void main(String[] args) {
	String s ="aabbcccdd";
	char[] a =s.toCharArray();
    System.out.println(s);
    
    int count =1;
    for (int i=0;i<a.length-1;i++) {
    	if(a[i]==a[i+1]) {
    		count++;
    	}
    	else {
    		System.out.print(a[i]+""+count);
    		count =1;
    	}
    }
    System.out.print(a[a.length-1]+""+count);
}
}
