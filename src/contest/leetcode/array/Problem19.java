//https://leetcode.com/problems/max-consecutive-ones/
package contest.leetcode.array;

import java.util.Scanner;

public class Problem19 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int inputSize=scanner.nextInt();
        int arr[]=new int[inputSize];
        for (int i=0;i<inputSize;i++){
            arr[i]=scanner.nextInt();
        }
       int x= findMaxConsecutiveOnes(arr);
        System.out.println(x);
    }

    private static int findMaxConsecutiveOnes(int[] nums) {

        int count=0;
        int maxTilNow=-1;

        for (int i=0;i<nums.length;i++){
            if (nums[i]==1){
                count++;
            }else {
             maxTilNow= Math.max(count,maxTilNow);
             count=0;
            }
        }



return Math.max(count,maxTilNow);
    }
}
