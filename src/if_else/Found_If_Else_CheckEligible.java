package if_else;

import java.util.Scanner;

/*
    Q. Take a number n as input representing age of a person.
       Print "eligible" if the person is Eligible for driving license else Print "not eligible".
 */

public class Found_If_Else_CheckEligible {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int personAge = sc.nextInt();

        if (personAge >= 18) {
            System.out.println("eligible");
        } else {
            System.out.println("not eligible");
        }

    }
}
