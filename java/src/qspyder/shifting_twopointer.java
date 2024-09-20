package qspyder;

import java.util.Arrays;

public class shifting_twopointer {
    public static void main(String[] args) {
        int[] a = {1, 0, 2, 0, 3, 0, 4, 4, 0};
        System.out.println(Arrays.toString(a));
        int left = 0;
        int right = a.length - 1;
        
        while (left < right) {
            if (a[left] != 0 && a[right] == 0) {
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
            }
            if (a[left] == 0) {
                left++;
            }
            if (a[right] != 0) {
                right--;
            }
        }
        
        System.out.println(Arrays.toString(a));
    }
}
