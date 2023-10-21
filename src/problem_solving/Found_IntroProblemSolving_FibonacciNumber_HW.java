package problem_solving;

import java.util.Scanner;

public class Found_IntroProblemSolving_FibonacciNumber_HW {

/*
    Q. Take as input a number n.
        Print the nth number of Fibonacci sequence where
        0th Fibonacci is 0 and 1st Fibonacci is 1. Here is a sample
        0 1 1 2 3 5 8 13 21 34 55
 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int previousNum = 0;
        int currentNum = 1;

        if(n == 0){
            System.out.println(previousNum);
        }else if(n == 1){
            System.out.println(currentNum);
        }else{
            System.out.println(fibonacciSequence(previousNum, currentNum, n));
        }

    }

    static int fibonacciSequence(int previousNum, int currentNum, int n){
        int newNum = 0;
        for(int i = 2; i <= n; i++){
            newNum = previousNum + currentNum;
            previousNum = currentNum;
            currentNum = newNum;
        }
        return newNum;
    }


}
