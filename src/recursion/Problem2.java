
//https://mycode.prepbytes.com/coding/recursion/PATRN
package recursion;

import java.util.Scanner;

public class Problem2 {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
            int n=scanner.nextInt();
       func(n);
       System.out.println("");
        }
    }

    private static int func(int n) {



        System.out.print(n+" ");
        if ((n<=0))
            return n;
         func(n-5);
        System.out.print(n+" ");
    return 0;
    }
}
