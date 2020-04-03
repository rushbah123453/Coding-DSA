//https://mycode.prepbytes.com/problems/sorting/GAME1
package dsa.sorting;

import java.util.Scanner;

public class Problem5 {

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
            findMedian(a);

        }
    }

    private static void sort(int[] a, int l, int r) {


        if (l<r){

            int mid=l+((r-l)/2);

            sort(a,l,mid);
            sort(a,mid+1,r);

            merge(a,l,mid,r);





        }


    }

    private static void findMedian(int[] a) {

        int mid=(a.length-1)/2;

        System.out.println(a[mid]);
    }

    private static void merge(int[] arr, int l, int mid, int r) {


        int n1=mid-l+1;
        int n2=r-mid;

        int L[]=new int[n1];
        int R[]=new int[n2];

        for (int i=0;i<n1;i++)
            L[i]=arr[l+i];

        for (int j=0;j<n2;j++)
            R[j]=arr[mid+1+j];

        int i=0,j=0,k=l;

        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }


        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }




    }

}
