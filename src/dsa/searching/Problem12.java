
//https://mycode.prepbytes.com/problems/searching/BOOKS
package dsa.searching;

import java.util.Scanner;

public class Problem12 {


    public static void main(String[] args) {



        Scanner scanner=new Scanner(System.in);
        int a[] = new int[2];
        for (int i=0;i<2;i++) {

            a [i]=scanner.nextInt();

        }

        long[] chapterSizeArray=new long[a[0]];
        for (int j=0;j<a[0];j++){
            chapterSizeArray[j]=scanner.nextInt();
        }

        countOfBooksRead(chapterSizeArray,a[1]);

    }

    private static void countOfBooksRead(long[] chapterSizeArray, long x) {

        int start=0;
        int end=chapterSizeArray.length-1;
        int count=0;


        while (start<=end){

            if (x>=chapterSizeArray[start]){
                count++;

                start++;
            }

           else if (x>=chapterSizeArray[end]){
                count++;

                end--;
            }else {
                break;
            }


        }
        System.out.println(chapterSizeArray.length-count);

    }


}
