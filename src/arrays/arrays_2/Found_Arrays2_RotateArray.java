package arrays.arrays_2;

import java.util.Scanner;

/*
    Q. Given an integer array nums of size N, rotate the array to the right by k steps, where k is non-negative.
 */
public class Found_Arrays2_RotateArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int nums[] = new int[size];

        int element;
        for (int i = 0; i < size; i++) {
            element = sc.nextInt();
            nums[i] = element;
        }

        int k = sc.nextInt();
        k = k % nums.length;
        swapArrayElements(nums, 0, (nums.length - 1));
        swapArrayElements(nums, 0, (k - 1));
        swapArrayElements(nums, k, (nums.length - 1));

        for (int n : nums) {
            System.out.print(n + " ");
        }
    }

    static void swapArrayElements(int[] arr, int indexOne, int indexTwo) {

        while (indexOne < indexTwo) {
            int temp = arr[indexOne];
            arr[indexOne] = arr[indexTwo];
            arr[indexTwo] = temp;

            indexOne++;
            indexTwo--;
        }


    }
}
