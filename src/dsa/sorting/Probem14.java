
//https://mycode.prepbytes.com/problems/sorting/QUICKSO
package dsa.sorting;

import java.util.Scanner;

public class Probem14 {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
            int arraySize = scanner.nextInt();
            int a[] = new int[arraySize], sum = 0;
            for (int j = 0; j < arraySize; j++) {
                a[j] = scanner.nextInt();
            }

            quickSort(a,0,a.length-1);
            printArray(a);
        }
        }

    private static void printArray(int[] a) {
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }

    private static void quickSort(int[] a, int low, int high) {

        if (low<high){

            int pi=partition(a,low,high);
            quickSort(a,low,pi-1);
            quickSort(a,pi+1,high);


        }
    }

    private static int partition(int[] a, int low, int high) {

        int pivot=a[high];
        int i=low-1;
        for (int j=low;j<high;j++){
            if (a[j]<pivot){
i++;
swap(a,i,j);
            }

        }

swap(a,i+1,high);
        return i+1;

    }

    private static void swap(int[] a, int i, int j) {
        int temp;
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

}
