//https://mycode.prepbytes.com/problems/recursion/PREFIX

package dsa.recursion;

import java.util.Scanner;

public class Problem15 {


    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
            int n = scanner.nextInt();
            printNums(n);
            System.out.println("");
        }


    }


    static void printRec(String number, int extraOnes,
                         int remainingPlaces)
    {
        // if number generated
        if (0 == remainingPlaces)
        {
            System.out.print( number +" ");
            return;
        }

        // Append 1 at the current number and
        // reduce the remaining places by one
        printRec(number + "1", extraOnes + 1,
                remainingPlaces - 1);

        // If more ones than zeros, append 0 to the
        // current number and reduce the remaining
        // places by one
        if (0 < extraOnes)
            printRec(number + "0", extraOnes - 1,
                    remainingPlaces - 1);
    }

    static void printNums(int n)
    {
        String str = "";
        printRec(str, 0, n);
    }

}
