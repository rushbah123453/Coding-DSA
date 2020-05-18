package contest.leetcode.maycircuit20;/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

import java.math.BigInteger;
import java.util.Scanner;

class TestClass {
    public static void main(String args[] ) throws Exception {


        //Scanner
        Scanner s = new Scanner(System.in);
        int x=s.nextInt();
        BigInteger n= s.nextBigInteger();

        int power=calculatePower(n);
        int res=(int)(Math.pow(x%10,power)%10);
        System.out.println(res);
    }

    private static int calculatePower(BigInteger n) {
        if (n.equals(new BigInteger("1"))){
            return 1;
        }else if(n.equals(new BigInteger("2"))){
            return 2;
        }else if (n.equals(new BigInteger("3"))){
            return 6;
        }else if (n.equals(new BigInteger("4"))){
            return 4;
        }else {
            return 0;
        }

    }
}
