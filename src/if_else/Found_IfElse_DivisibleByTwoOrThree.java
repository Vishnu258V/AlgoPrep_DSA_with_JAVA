package if_else;

import java.util.Scanner;

public class Found_IfElse_DivisibleByTwoOrThree {

    //Take a number n as input. Print "divisible" if the number is divisible by 2 or 3 else Print "not divisible".

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();

        if (inputNumber % 2 == 0 || inputNumber % 3 == 0) {
            System.out.println("divisible");
        } else {
            System.out.println("not divisible");
        }

    }

}
