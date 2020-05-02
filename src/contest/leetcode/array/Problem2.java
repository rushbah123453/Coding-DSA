//https://leetcode.com/problems/duplicate-zeros/
package contest.leetcode.array;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int inputSize=scanner.nextInt();
        int arr[]=new int[inputSize];
        for (int i=0;i<inputSize;i++){
            arr[i]=scanner.nextInt();
        }
        duplicateZeros(arr);
    }

    private static void duplicateZeros(int[] arr) {
        for (int i=0;i<arr.length;i++){
            if (arr[i]==0 && i<arr.length-1){
                rotate(arr,i+1);
                arr[++i]=0;

            }
        }
    }

    private static void rotate(int[] arr, int start) {
        int end=arr.length-1;

        for (int i=end;i>start;i--){
            arr[i]=arr[i-1];
        }
    }
}
