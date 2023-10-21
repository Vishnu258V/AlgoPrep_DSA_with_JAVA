package if_else;

import java.util.Scanner;

public class Found_IfElse_PassOrFail {
    /*
        Q. Take a number n as input representing marks of a student.
           Print "pass" if the mark is greater than equal to 35 else Print "fail".
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int inputMarks = sc.nextInt();

        if (inputMarks >= 35) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }

    }


}
