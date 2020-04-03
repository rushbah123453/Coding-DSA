//https://mycode.prepbytes.com/coding/recursion/FIBRC

package dsa.recursion;

import java.util.Scanner;

public class Problem5 {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
            int n=scanner.nextInt();

            System.out.println(fibonnaci(n));
        }
    }

    private static long fibonnaci(long n) {
      if(n==0 || n==1)
          return n;
      return fibonnaci(n-1)+fibonnaci(n-2);

    }
}
