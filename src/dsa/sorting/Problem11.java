
//https://mycode.prepbytes.com/problems/sorting/MERGESO
package dsa.sorting;

import java.util.Scanner;

public class Problem11 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
            int arraySize = scanner.nextInt();
            int a[] = new int[arraySize], sum = 0;
            for (int j = 0; j < arraySize; j++) {
                a[j] = scanner.nextInt();
            }

            sort(a,0,a.length-1);
            print(a);
        }
    }

    private static void print(int[] a) {

        int n=a.length;
        for (int i=0;i<n;i++){

            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }

    private static void sort(int[] a, int l, int r) {

    if(l<r){

        int mid=l+(r-l)/2;

        sort(a,l,mid);
        sort(a,mid+1,r);

        merge(a,l,mid,r);

    }



    }

    private static void merge(int[] a, int l, int mid, int r) {

        int n1=mid-l+1;
        int n2=r-mid;

        int L[]=new int[n1];
        int R[]=new int[n2];


        for (int i=0;i<n1;i++){
            L[i]=a[l+i];
        }

        for (int i=0;i<n2;i++){
            R[i]=a[mid+1+i];
        }

        int k=l;
        int i=0,j=0;
        while (i<n1 && j<n2){

            if(L[i]>=R[j]){
                a[k]=R[j];
                j++;
            }
            else {
                a[k]=L[i];
                i++;
            }
            k++;

        }

        while (i<n1){
            a[k]=L[i];
            i++;k++;
        }
        while (j<n2){
            a[k]=R[j];
            j++;k++;
        }


    }

}
