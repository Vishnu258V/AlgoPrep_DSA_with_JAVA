package arrays.arrays_2;

/*
Given n length array "arr". Find the pair with maximum value of arr[i] - arr[j].
need to print max value of (arr[i] - arr[j]) possible and not the (i,j) itself.
Note: Doing it by checking all the possible pairs. Works but can you do something smart?
 */

import java.util.Scanner;

public class Found_Arrays2_MaxDifference1_HW {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        int element;
        for (int i = 0; i < size; i++) {
            element = sc.nextInt();
            arr[i] = element;
        }

        int leastNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;


        for (int j = 0; j < arr.length; j++) {

            if (arr[j] < leastNum) {
                leastNum = arr[j];
            }

            if (arr[j] > maxNum) {
                maxNum = arr[j];
            }
        }

        System.out.println(maxNum - leastNum);

    }

}
