package if_else;

import java.util.Scanner;

public class Found_IfElse_OddOrEven {

//   Q. Take a number n as input. Print "even" if the number is even else Print "odd".

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();

        if (inputNumber % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

    }

}
