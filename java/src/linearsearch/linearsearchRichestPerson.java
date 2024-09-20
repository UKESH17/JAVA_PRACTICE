package linearsearch;

public class linearsearchRichestPerson {
     public static int maxwealth(int[][] accounts) {
    	 int max=add(accounts[0]);
    	 for(int i=0; i<accounts.length;i++) {
    		if (add(accounts[i])>max) {
    			max= add(accounts[i]);
    	    } 		
         }
    	 return max;
	}
	public static int add(int[] nums) {
    	 int sum=0;
    	 for(int i=0;i<nums.length;i++) {
    		 sum=sum+nums[i];
    	 }
    	 return sum;
     }
     public static void main(String[] args) {
    	int[][] accounts = {{1,2,3},{3,2,4},{10,20,20,50}}; 
    	System.out.println(maxwealth(accounts));
	}
}
