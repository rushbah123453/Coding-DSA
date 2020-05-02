package contest.leetcode.array;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int inputSize=scanner.nextInt();
        int arr[]=new int[inputSize];
        for (int i=0;i<inputSize;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println( findNumbers(arr));

    }

    private static int findNumbers(int[] nums) {
       int res=0;
        for (int x:nums){
            int count=0;
            while (x!=0){
                x=x/10;
                count++;
            }
            if (count%2==0){
              res++;
            }
        }
        return res;
    }
}
