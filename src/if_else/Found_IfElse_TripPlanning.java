package if_else;

import java.util.Scanner;

/*
    Q. Take a number n as input representing Budget of trip.
       Print "goa" if the budget is greater than equal to 10000 else Print "murthal".
 */

public class Found_IfElse_TripPlanning {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int inputBudget = sc.nextInt();

        if (inputBudget >= 10000) {
            System.out.println("goa");
        } else {
            System.out.println("murthal");
        }

    }
}
