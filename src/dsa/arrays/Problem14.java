//https://mycode.prepbytes.com/coding/arrays/MONK
package dsa.arrays;

import java.util.Scanner;

public class Problem14 {


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
            int arraySize[]=new int[2];
            for (int k=0;k<2;k++){
                 arraySize[k] = scanner.nextInt();
            }

            int a[] = new int[arraySize[0]];
            for (int j = 0; j < arraySize[0]; j++) {
                a[j] = scanner.nextInt();

            }

            if (arraySize[1]>arraySize[0])
                arraySize[1]=arraySize[1]%arraySize[0];

         revesalAlgoArray(a,arraySize[0]-arraySize[1],arraySize[0]-1);
            revesalAlgoArray(a,0,arraySize[0]-arraySize[1]-1);
            revesalAlgoArray(a,0,arraySize[0]-1);


            for (int m=0;m<arraySize[0];m++){
                System.out.print(a[m]+" ");
            }
            System.out.println("");

        }
    }

    private static void revesalAlgoArray(int[] a, int start, int end) {

        int temp;
        while (start<end){
            temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }

}
