//https://mycode.prepbytes.com/problems/searching/BOXES

package dsa.searching;

import java.util.Scanner;

public class Problem18 {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        int a[] = new int[3];
        for (int i=0;i<testCases;i++) {

            for (int j = 0; j < 3; j++) {
                a[j] = scanner.nextInt();
            }

            printMaxChoclateBox(a);

        }
}

    private static void printMaxChoclateBox(int[] a) {

        int min=Math.min(a[0],a[1]);
        int total=a[0]+a[1]+a[2];
        if (total>=(min*3)){
            System.out.println(min);
        }else {
            int minOfChoc=Math.min(min*3,total);
            System.out.println(minOfChoc/3);
        }
    }
    }
