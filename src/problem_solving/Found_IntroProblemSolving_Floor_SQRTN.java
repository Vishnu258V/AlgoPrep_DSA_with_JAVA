package problem_solving;

import java.util.Scanner;

public class Found_IntroProblemSolving_Floor_SQRTN {

    /*
        Q. You need to find the square root of a given number N.
            If N is not a perfect square, then floor(√x) must be returned.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double sqrt = Math.sqrt(n);
        System.out.println((int) sqrt);
    }

}
