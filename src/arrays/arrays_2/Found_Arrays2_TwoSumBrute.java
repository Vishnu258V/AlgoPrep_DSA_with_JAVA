package arrays.arrays_2;


import java.util.Scanner;

/*
    Q. Given n length array "arr" and an integer k, Check if there exists a pair(i,j) such that arr[i]+arr[j] == k and i!=j
        return true if i+j = k otherwise false.
 */
public class Found_Arrays2_TwoSumBrute {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        int element;
        for (int i = 0; i < size; i++) {
            element = sc.nextInt();
            arr[i] = element;
        }

        int k = sc.nextInt();

        System.out.println(twoSum(arr, k));

    }

    static boolean twoSum(int[] arr, int k) {

        for (int i = 0; i < (arr.length - 2); i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == k) {
                    return true;
                }
            }
        }
        return false;
    }

}
