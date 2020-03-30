
//https://mycode.prepbytes.com/problems/sorting/SORTNO
package sorting;

import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
            int arraySize = scanner.nextInt();
            int a[] = new int[arraySize], sum = 0;
            for (int j = 0; j < arraySize; j++) {
                a[j] = scanner.nextInt();
            }

            dutchFlagSort(a);
            printArray(a);
        }
    }

    private static void printArray(int[] a) {
        for (int x=0;x<a.length;x++){
            System.out.print(a[x]+" ");
        }
        System.out.println("");

    }

    private static void dutchFlagSort(int[] a) {

        int n=a.length-1;
        int low=0;
        int high=n;
        int travserse=0;

        while (travserse<=high){
            switch (a[travserse]){
                case 0: swapNumbers(a,travserse,low);
                travserse++;
                low++;
                break;
                case 1: travserse++;
                break;
                case 2:
                    swapNumbers(a,travserse,high);
                    high--;
                    break;
            }
        }


    }

    private static void swapNumbers(int arr[],int a, int b) {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

}
