package loops.patterns;

import java.util.Scanner;

public class AlgoPrep_Found_Pattern4 {

    /*
        Q. Take as input a number n, the number of rows
           Print the following pattern
            *** ***
            **   **
            *     *
            **   **
            *** ***
            for n = 5.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int space = 1;
        for (int row = 1; row <= N; row++) {
            for (int col = 1; col <= (N + 3); col++) {
                if ((((N + 2) - space) / 2 + 1) != col) {
                    System.out.print("*");
                } else {
                    for (int k = 1; k <= space; k++) {
                        System.out.print(" ");
                        col++;
                    }
                }
            }

            if ((N / 2) >= row) {
                space = space + 2;
            } else {
                space = space - 2;
            }
            System.out.println();
        }
    }


}
