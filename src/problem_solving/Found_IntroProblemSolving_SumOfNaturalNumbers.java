package problem_solving;

import java.util.Scanner;

public class Found_IntroProblemSolving_SumOfNaturalNumbers {

    // Q. You need to find the sum of first N natural numbers.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;

        sum = (n * (n + 1)) / 2;

        System.out.println(sum);
    }
}
