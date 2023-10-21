package loops.patterns;

import java.util.Scanner;

public class AlgoPrep_Found_Pattern1 {

    /*
        Q. Take as input a number n, the number of rows
        Print the following pattern
            *
            *	*
            *	*	*
            *	*	*	*
            *	*	*	*	*
            for n = 5.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();

        for (int i = 1; i <= inputNumber; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }


}
