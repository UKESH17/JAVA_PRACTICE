package basic;


public class pattern {
      public static void main(String[] args) {
    	 String a="hello";
      System.out.println(remove(a));
    	 
	}

       
      public static String remove(String a) {
    	 StringBuilder sb = new StringBuilder();
    	 char[] arr = a.toCharArray();
    	  for (char c:arr) {
    		  if ((c != 'A') && (c != 'E') && (c != 'I') && (c != 'O') && (c != 'U') &&
              (c != 'a') && (c!= 'e') && (c != 'i') && (c != 'o') && (c != 'u') ) {
    			  sb.append(c);
    		  }
    	  }return sb.toString();
      }
}

