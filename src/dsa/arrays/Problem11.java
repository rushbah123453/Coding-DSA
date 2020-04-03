//https://mycode.prepbytes.com/coding/arrays/GRTNEIGH

package dsa.arrays;

import java.util.Scanner;

public class Problem11 {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
            int arraySize = scanner.nextInt();
            int a[] = new int[arraySize];
            for (int j = 0; j < arraySize; j++) {
                a[j] = scanner.nextInt();

            }

            boolean flag=false;
            for (int j = 0; j < arraySize; j++) {
              if (j==0){
                  if(a[j]>a[j+1]){
                      System.out.print(j+" ");
                      flag=true;
                  }
              }else if(j==arraySize-1){
                  if(a[j]>a[j-1]){
                      System.out.print(j+" ");
                      flag=true;
                  }
              }else {
                  if (a[j]>a[j-1] && a[j]>a[j+1]){
                      System.out.print(j+" ");
                      flag=true;
                  }
              }

            }

            if (!flag)
                System.out.println(-1);
            System.out.println("");

        }
    }
}
