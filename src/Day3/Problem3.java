package Day3;

import java.util.Arrays;

// Reverse aan array without using extra space
public class Problem3 {
    public static void main(String[] args) {
        int[] arr = {76, 23, 41, -56, 8, -98, 4};
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            arr[i] = arr[i] + arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = arr[i] - arr[(arr.length - 1) - i];
            arr[i] = arr[i] - arr[(arr.length - 1) - i];
        }

        System.out.println(Arrays.toString(arr));
    }
}
