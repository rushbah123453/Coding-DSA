//https://mycode.prepbytes.com/problems/searching/PEAKELE

package dsa.searching;

import java.util.Scanner;

public class Problem8 {


    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
            int arraySize = scanner.nextInt();
            int a[] = new int[arraySize];
            for (int j = 0; j < arraySize; j++) {
                a[j]=scanner.nextInt();
            }

            peakHouse(a);

        }
    }

    private static void peakHouse(int[] a) {
        int length=a.length;

        for (int i=0;i<length;i++){

            if(i==0){
                if(a[i]>a[i+1]){
                    System.out.println(i);
                    break;
                }
            }

           else if(i==length-1){
                if(a[i]>a[i-1]){
                    System.out.println(i);
                    break;
                }
            }

          else  if(a[i]>Math.max(a[i-1],a[i+1])){
                System.out.println(i);
                break;
            }


        }


    }
}
