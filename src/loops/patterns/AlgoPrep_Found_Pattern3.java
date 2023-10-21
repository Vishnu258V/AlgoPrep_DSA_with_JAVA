package loops.patterns;

import java.util.Scanner;

public class AlgoPrep_Found_Pattern3 {

    /*
       Q. Take as input a number n, the number of rows
          Print the following pattern
                  *
                 ***
                *****
                 ***
                  *
                for n = 5.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int str = 1;
        for (int row = 1; row <= N; row++) {
            for (int col = 1; col <= N; col++) {
                if (((N - str) / 2) + 1 != col) {
                    System.out.print(" ");
                } else {
                    for (int k = 1; k <= str; k++) {
                        System.out.print("*");
                    }
                }
            }

            if ((N / 2) >= row) {
                str = str + 2;
            } else {
                str = str - 2;
            }
            System.out.println();
        }

    }

}
