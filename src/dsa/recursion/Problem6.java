package dsa.recursion;

import java.util.Scanner;

public class Problem6 {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            System.out.println(gcd(a,b));
        }
    }

    private static long gcd(int a,int b) {
       if(b==0)
           return a;

       return gcd(b,a%b);


    }


}
