package Mock;


	import java.util.HashMap;

	public class FrequencyCounter {
	    public static void main(String[] args) {
	        int[] array = {1, 2, 2, 3, 4, 4, 5};

	        // HashMap to store frequencies
	        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

	        // Count frequencies
	        for (int num : array) {
	            frequencyMap.put(num, frequencyMap.get(num) + 1);
	        }

	        // Print the frequency of each element
	        for (int key : frequencyMap.keySet()) {
	            System.out.println(key + " occurs " + frequencyMap.get(key) + " times");
	        }
	    }
	}


