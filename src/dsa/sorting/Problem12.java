//https://mycode.prepbytes.com/problems/sorting/COPYING
package dsa.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Problem12 {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
            int arraySize = scanner.nextInt();
            int a[] = new int[arraySize], sum = 0;
            for (int j = 0; j < arraySize; j++) {
                a[j] = scanner.nextInt();
            }

            Arrays.sort(a);
            copyingHero(a);

        }
        }

    private static void copyingHero(int[] a) {
        int operation=0;
        for (int i=0;i<a.length;i++){
            operation+=Math.abs(a[i]-(i+1));
        }
        System.out.println(operation);
    }
}
