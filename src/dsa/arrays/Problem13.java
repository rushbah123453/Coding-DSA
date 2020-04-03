//https://mycode.prepbytes.com/coding/arrays/LEADARR

package dsa.arrays;

import java.util.Scanner;

public class Problem13 {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
            int arraySize = scanner.nextInt();
            int a[] = new int[arraySize];
            for (int j = 0; j < arraySize; j++) {
                a[j] = scanner.nextInt();

            }

            int maxTillNow=a[a.length-1];
            System.out.print(maxTillNow+" ");
            for (int k=a.length-2;k>=0;k--){
                if (a[k]>=maxTillNow){
                    maxTillNow=a[k];
                    System.out.print(maxTillNow+" ");
                }
            }
            System.out.println("");
        }
        }
}
