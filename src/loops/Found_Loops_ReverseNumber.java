package loops;

import java.util.Scanner;

public class Found_Loops_ReverseNumber {

    // Q. Take as input n. Print the number in reverse.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();

        StringBuffer sb = new StringBuffer();
//         ArrayList<Long> arrList = new ArrayList();

        int digit = 0;
        while (inputNum != 0) {
            digit = inputNum % 10;
            sb.append(digit);
            inputNum = inputNum / 10;

        }
        int newNum = Integer.parseInt(sb.toString());
//         Collections.reverse(arrList);
        System.out.println(newNum);


    }


}
