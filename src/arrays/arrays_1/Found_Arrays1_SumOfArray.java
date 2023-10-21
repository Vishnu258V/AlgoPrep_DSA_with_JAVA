package arrays.arrays_1;

import java.util.Scanner;

public class Found_Arrays1_SumOfArray {
    // Q. Given n length Array, You have to return sum of all the elements.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int n;
        int sum = 0;
        while(size > 0){
            n = sc.nextInt();
            sum = sum + n;
            size--;
        }

        System.out.println(sum);
    }
}
