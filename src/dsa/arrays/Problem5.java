//https://mycode.prepbytes.com/coding/arrays/MININD

package dsa.arrays;

import java.util.Scanner;

public class Problem5 {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
            int arraySize = scanner.nextInt();
            int a[] = new int[arraySize];
            for (int j=0;j<arraySize;j++){
                a[j]=scanner.nextInt();

            }
            int minIndex=minIndex(a);

System.out.println(minIndex);
        }
    }

    private static int minIndex(int[] a) {
        int min=a[0],index=0;
        for (int i=0;i<a.length;i++){
           if(min>a[i]){
               min=a[i];
               index=i;

           }
        }


        return index;

    }
}
