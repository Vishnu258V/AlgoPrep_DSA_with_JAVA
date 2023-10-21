package problem_solving;

import java.util.Scanner;

public class AlgoPrep_Found_Functions_Fact_NCR_NPR {

/*    Take as input
        1. first number: n
        2. second number: r
        Print n!, npr & ncr separated by lines.

        //nCr  =  n! / (r! * (n - r)!)
        //nPr  =  n! / (n - r)!
        //n!   =  1* upto n


 */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int nFactorial = loopUptoN_Numbers(n);
        int rFactorial = loopUptoN_Numbers(r);
        int n_rFactorial = loopUptoN_Numbers((n - r));

        int nCr = nFactorial / (rFactorial * n_rFactorial);
        int nPr = nFactorial / n_rFactorial;

        System.out.println(nFactorial);
        System.out.println(nPr);
        System.out.println(nCr);

    }

    static int loopUptoN_Numbers(int n) {
        int total = 1;
        for (int i = 1; i <= n; i++) {
            total = total * i;
        }
        return total;
    }

}
