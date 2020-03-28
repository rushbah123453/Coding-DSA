
//https://mycode.prepbytes.com/problems/searching/NUMCHOC
package searching;

import java.util.Arrays;
import java.util.Scanner;

public class Problem14 {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        int arraySize=scanner.nextInt();
        int a[] = new int[arraySize];
        for (int i=0;i<arraySize;i++) {

                a[i] = scanner.nextInt();
        }
        int moneyArraySize=scanner.nextInt();

        int moneyArray[]=new int[moneyArraySize];
        Arrays.sort(a);
        for (int j=0;j<moneyArraySize;j++){

            moneyArray[j]=scanner.nextInt();
            numberOfChocolate(a,moneyArray[j]);
        }




    }

    private static void numberOfChocolate(int[] a, int moneyArray) {

        int low=0;
        int high=a.length-1;
        int mid=0;

        while (low<=high){
            mid=low+((high-low)/2);
            if(a[mid]>moneyArray && a[mid-1]<=moneyArray){
                System.out.println(mid);
                break;
            }
            if (moneyArray<=a[mid]){
                high=mid-1;
            }
            else if (moneyArray>a[mid]){
               low=mid+1;
            }



        }

      //  System.out.println(mid+1);





    }
}
