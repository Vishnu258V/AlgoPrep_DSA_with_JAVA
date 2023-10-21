package problem_solving;

import java.util.Scanner;

public class Found_IntroProblemSolving_ValidPerfectSquares_HW {

    /*
        Q. Given a positive integer num, return true if num is a perfect square or false otherwise.
           A perfect square is an integer that is the square of an integer.
           In other words, it is the product of some integer with itself.
           You must not use any built-in library function, such as sqrt.
     */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(perfectSquare(n));
    }

    static boolean perfectSquare(int n) {
        boolean output = false;
        for (int i = 1; (i * i) <= n; i++) {
            if ((i * i) == n) {
                output = true;
            } else {
                output = false;
            }
        }
        return output;
    }


}
