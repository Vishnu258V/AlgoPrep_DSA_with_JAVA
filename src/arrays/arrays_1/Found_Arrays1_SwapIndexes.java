package arrays.arrays_1;

import java.util.Scanner;

public class Found_Arrays1_SwapIndexes {

//    Given n length Array and 2 indexes, You have to swap the elements of 2 indexes and print the array.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int n;

        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            n = sc.nextInt();
            arr[i] = n;
        }

        int indexOne = sc.nextInt();
        int indexTwo = sc.nextInt();

        int temp = arr[indexOne];
        arr[indexOne] = arr[indexTwo];
        arr[indexTwo] = temp;

        for (int a : arr) {
            System.out.print(a + " ");
        }

    }

}
