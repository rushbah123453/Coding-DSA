
//https://mycode.prepbytes.com/problems/searching/CNTPAIR
package dsa.searching;

import java.util.Arrays;
import java.util.Scanner;

public class Problem13 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int a[] = new int[2];
        for (int i=0;i<2;i++) {

            a [i]=scanner.nextInt();

        }

        int[] inputArray=new int[a[0]];
        for (int j=0;j<a[0];j++){
            inputArray[j]=scanner.nextInt();
        }

        Arrays.sort(inputArray);

        countOfPairs(inputArray,a[1]);


    }

    private static void countOfPairs(int[] inputArray, int i) {

        int l=0,r=0,count=0;

        while (r<inputArray.length){

            if (inputArray[r]-inputArray[l]==i){
               count++; r++;l++;
            }

            else if (inputArray[r]-inputArray[l]<i){
                r++;
            }
            else if(inputArray[r]-inputArray[l]>i){
                l++;
            }


        }
System.out.println(count);

    }
}
