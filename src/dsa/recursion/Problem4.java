//https://mycode.prepbytes.com/coding/recursion/FACTRC

package dsa.recursion;

import java.util.Scanner;

public class Problem4 {


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
            int n=scanner.nextInt();

            System.out.println(factorial(n));
        }
    }

    private static long factorial(long n) {
        return n==0?1:(n*factorial(n-1));

    }

}
