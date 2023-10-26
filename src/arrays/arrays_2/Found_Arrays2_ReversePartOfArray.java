package arrays.arrays_2;

import java.util.Scanner;

/*
    Q. Given n length Array and two valid index [s,e], You have to Reverse the array from s to e and print the final array.
 */
public class Found_Arrays2_ReversePartOfArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        int element;
        for (int i = 0; i < size; i++) {
            element = sc.nextInt();
            arr[i] = element;
        }

        int startingIndex = sc.nextInt();
        int lastIndex = sc.nextInt();

        while (startingIndex < lastIndex) {
            int temp = arr[startingIndex];
            arr[startingIndex] = arr[lastIndex];
            arr[lastIndex] = temp;
            startingIndex++;
            lastIndex--;
        }

        for (int n : arr) {
            System.out.print(n + " ");
        }


    }
}
