package loops.patterns;

import java.util.Scanner;

public class AlgoPrep_Found_Pattern2 {

    /*
    Q. Take as input a number n, the number of rows
    Print the following pattern
        1
        2	3
        4	5	6
        7	8	9	10
        for n = 4.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        int numIncrement = 1;

        for (int row = 1; row <= inputNumber; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(numIncrement + " ");
                numIncrement++;
            }
            System.out.println();
        }


    }
}
