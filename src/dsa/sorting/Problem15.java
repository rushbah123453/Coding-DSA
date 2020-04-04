//https://mycode.prepbytes.com/problems/sorting/TRIPLET
package dsa.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Problem15 {


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
            searchTriplets(a);
        }
    }

    private static void searchTriplets(int[] a) {
        int n=a.length-1;
        boolean flag=false;
        for (int i=n;i>=0;i--){
            int low=0;
            int high=i-1;

            while (low<high && !flag){

                if (a[i]==(a[low]+a[high]))
                {
                    System.out.print(a[i]+" "+a[low]+" "+a[high]+" ");
                    flag=true;
                    break;
                }else if (a[i]>a[low]+a[high]){
                    low++;
                }else {
                    high--;
                }
            }


        }
        System.out.println("");

if(!flag)
    System.out.println(-1);

    }
}
