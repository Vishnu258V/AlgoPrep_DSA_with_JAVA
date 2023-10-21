package loops;

import java.util.Scanner;

public class Found_Loops_IsPrime {

    // Q. Take as input a number n. Determine whether it is prime or not. If it is prime,
    //    print "Prime" otherwise print "Not Prime".

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();

        boolean flag = false;

        if (inputNum <= 1) {
            flag = true;
        }

        for (int i = 2; i < inputNum / 2; i++) {
            if (inputNum % i == 0) {
                flag = true;
            }
        }

        if (flag) {
            System.out.println("Not Prime");
        } else {
            System.out.println("Prime");
        }

    }

}
