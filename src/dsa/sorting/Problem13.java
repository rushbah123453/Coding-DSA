//https://mycode.prepbytes.com/problems/sorting/POKEMON

//Not completed yet
package dsa.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem13 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
            int arraySize = scanner.nextInt();
            int a[] = new int[arraySize];
            int b[]=new int[arraySize];
            for (int j = 0; j < arraySize; j++) {
                a[j] = scanner.nextInt();
            }

            for (int j = 0; j < arraySize; j++) {
                b[j] = scanner.nextInt();
            }

            Arrays.sort(a);
            Arrays.sort(b);

            winingMatches(a,b);

        }
    }

    private static void winingMatches(int[] a, int[] b) {

        int start=0,end=0;
        for (int j=0;j<a.length;j++){
        for (int i=0;i<a.length;i++){
            if(a[j]>b[i]){
                start=j;
                break;
            }
        }}


        for (int j=a.length-1;j>=0;j--){
            for (int i=a.length-1;i>=0;i--){
                if(a[j]>b[i]){
                    end=j;
                }
            }}



        System.out.println(end-start+1);
    }
}
