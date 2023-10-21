package arrays.arrays_1;

import java.util.Scanner;

public class Found_Arrays1_LargestNumberAtLeastTwice_HW {

    // Q. You need to find whether the largest element in the array is at least twice as much as every other number in the array.

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println(dominantIndex(arr));
    }

    public static int dominantIndex(int[] arr) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        int second = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                second = max;
                max = arr[i];
                index = i;
            } else if (arr[i] > second)
                second = arr[i];
        }
        return second * 2 <= max ? index : -1;
    }

}
