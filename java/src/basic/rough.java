package basic;

class Solution {
	
	public static void main(String[] args) {
		String s="{}[]";
		System.out.println(s);
		System.out.println(isValid(s));
	}
	
	public static boolean isValid(String s) {
		char [] arr = s.toCharArray();
		boolean flag = false;

		for (int i =0;i<arr.length-1;i+=2){
			if(arr[i]==(arr[i+1])){
				flag = true;
			}
		}
		return flag;
	}
	
}
