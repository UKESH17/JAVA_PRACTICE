package RoughWorks;
import java.util.*;

public class NonRepeatingElements {
    public static List<Integer> getNonRepeatingElements(int[] arr) {
        List<Integer> nonRepeatingElements = new ArrayList<>();
        
        // Loop through the array
        for (int i = 0; i < arr.length; i++) {
            boolean isRepeating = false;
            
            // Check if arr[i] repeats by comparing it with other elements
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isRepeating = true;
                    break;
                }
            }
            
            // If element is not repeating, add it to the result list
            if (!isRepeating) {
                nonRepeatingElements.add(arr[i]);
            }
        }
        
        return nonRepeatingElements;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 3, 6};
        List<Integer> nonRepeatingArr = getNonRepeatingElements(arr);

        // Print the non-repeating elements
        System.out.println("Non-repeating elements: " + nonRepeatingArr);
    }
}
