//https://mycode.prepbytes.com/coding/recursion/SMOFDGT

package recursion;

import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
            int n=scanner.nextInt();

            System.out.println(func(n));
        }
    }

    private static int func(int n) {
        return n==0?0:(n%10)+func(n/10);

    }
}

