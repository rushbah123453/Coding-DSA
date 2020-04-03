//https://mycode.prepbytes.com/coding/recursion/PRNTSMRC

package dsa.recursion;

import java.util.Scanner;

public class Problem1 {


    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
        int n=scanner.nextInt();
       System.out.println(  sum(n));
        }


    }

    private static int sum(int n) {

        if(n<1)
            return 0;

        return n+sum(n-1);


    }
}
