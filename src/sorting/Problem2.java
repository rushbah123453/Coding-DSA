//https://mycode.prepbytes.com/problems/sorting/EASYPROB

package sorting;

import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
            int arraySize = scanner.nextInt();
            int a[] = new int[arraySize], sum = 0;
            for (int j = 0; j < arraySize; j++) {
               a[j]= scanner.nextInt();
            }

            sortChocolateBags(a,0,a.length-1);
            selectMaxBags(a,a.length-1);
        }
    }

    private static void selectMaxBags(int[] a,int n) {
        int addBags=0;
        while (n>=0){
           addBags+=a[n];
           n-=2;
        }

        System.out.println(addBags);
    }

    private static void sortChocolateBags(int[] a, int l, int r) {

        if (l<r){
            int mid=l+(r-l)/2;
            sortChocolateBags(a,l,mid);
            sortChocolateBags(a,mid+1,r);
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

        for (int j=0;j<n2;j++){
            R[j]=a[mid+1+j];
        }

        int i=0,j=0,k=l;

        while (i<n1 && j<n2){

            if (L[i]<=R[j]) {
                a[k] = L[i];
                i++;
            }else{
                a[k]=R[j];
                j++;
            }
            k++;
        }

        while (i<n1){
            a[k]=L[i];
            i++;
            k++;
        }

        while (j<n2){
            a[k]=R[j];
            j++;
            k++;
        }

    }
}
