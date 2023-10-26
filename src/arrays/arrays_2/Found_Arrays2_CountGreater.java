package arrays.arrays_2;


import java.util.Scanner;

/*
    Q. Given n length Array, You have to count total no.of elements in the array having atleast 1 element greater than itself.
 */
public class Found_Arrays2_CountGreater {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        int element;
        for (int i = 0; i < size; i++) {
            element = sc.nextInt();
            arr[i] = element;
        }

        int max = Integer.MIN_VALUE;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
        }

        int count = 0;
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] == max) {
                count++;
            }
        }

        System.out.println(arr.length - count);

    }


}
