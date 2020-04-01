//https://mycode.prepbytes.com/problems/sorting/HLPJRVS1
package sorting;

import java.util.*;

public class Problem7 {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();

        for (int i=0;i<testCases;i++) {

        int a=scanner.nextInt();

        int array[]=intToArray(a);

        sort(array,0,array.length-1);

        printAnswer(array);

        }
    }

    private static void printAnswer(int[] sortedArray) {
        int start=0;
        int end=sortedArray.length-1;
        int length=sortedArray.length;
int Actualsum=0;
boolean flag=true;
int firstElement=sortedArray[0];
        for (int i=0;i<end;i++){

            if(sortedArray[i+1]!=sortedArray[i]+1){
              flag=false;
              break;
            }
        }

        if(flag)
            System.out.println("YES");
        else
            System.out.println("NO");

    }

    private static void sort(int a[], int l, int r) {

        if (l<r){
           int mid=l+(r-l)/2;
            sort(a,l,mid);
            sort(a,mid+1,r);
            merge(a,l,mid,r);



        }



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

    private static int[] intToArray(int a) {
        int length=String.valueOf(a).length();
        int array[]=new int[length];
        for (int i=0;a>0;i++){
            array[i]=a%10;
            a=a/10;
        }

return array;

    }


}
