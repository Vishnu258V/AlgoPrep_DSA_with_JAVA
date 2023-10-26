package arrays.arrays_2;

import java.util.Scanner;

public class Found_Arrays2_ReverseArray {

    // Q. Given n length Array, You have to Reverse the entire array and print it.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        //Optimized Way
        int startingIndex = 0;
        int endIndex = arr.length - 1;

        while (startingIndex < endIndex) {

            int temp = arr[startingIndex];
            arr[startingIndex] = arr[endIndex];
            arr[endIndex] = temp;

            startingIndex++;
            endIndex--;
        }

        for (int n : arr) {
            System.out.print(n + " ");
        }

        //  Not Optimized way
        // for(int j = (arr.length-1); j >= 0; j--){
        //     System.out.print(arr[j] + " ");
        // }

    }
}
