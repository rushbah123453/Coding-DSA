//https://mycode.prepbytes.com/problems/searching/SRCHPROB1

package dsa.searching;

import java.util.Scanner;

public class Problem1 {


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
            int arraySize = scanner.nextInt();
            int a[] = new int[arraySize];
            for (int j = 0; j < arraySize; j++) {
             a[j]=scanner.nextInt();
            }

            voteResults(a);

        }

    }

    private static void voteResults(int[] a) {

        boolean flag=false;
        for (int i=0;i<a.length;i++){
            if(a[i]==1){
                flag=true;
                break;
            }

        }

        if (flag)
            System.out.println("hard");
        else
            System.out.println("easy");
    }


}
