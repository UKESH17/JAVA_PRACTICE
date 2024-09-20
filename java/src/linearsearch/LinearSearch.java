package linearsearch;

//Linear Search in Array//  

public class LinearSearch{
  public static <T> int target_finder(T[] Array, T Target){
	   for (int i=0 ; i<Array.length;i++) {	  
			  if (Array[i].equals(Target)) {
				  return i;
			  }
       }
	   return -1;
}
  public static void main(String[] args) {
	String[] StrArray = {"apple" ,"banana","Mango"};
	Integer[] IntArray= {1 ,5 ,4,3};
	System.out.println("For String");
	System.out.println(target_finder(StrArray,"banana"));
	System.out.println("For Int");
	System.out.println(target_finder(IntArray,0));
}
}