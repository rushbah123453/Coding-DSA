//https://leetcode.com/problems/move-zeroes/
package contest.leetcode.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem11 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int inputSize=scanner.nextInt();
        int arr[]=new int[inputSize];
        for (int i=0;i<inputSize;i++){
            arr[i]=scanner.nextInt();
        }
        moveZeroes(arr);


        //optimized Approach
        secondApproach(arr);
    }


    private static void moveZeroes(int[] nums) {
        List<Integer> arrayList=new ArrayList<>();

        for (int i=0;i<nums.length;i++){
           if (nums[i]!=0){
               arrayList.add(nums[i]);
           }
        }
        int i=0;
        for(;i<arrayList.size();i++){
            nums[i]=arrayList.get(i);
        }
        for (;i<nums.length;i++){
            nums[i]=0;
        }
        for (int x:nums){
            System.out.print(x+" ");
        }
    }

    private static void secondApproach(int[] arr) {

        int k=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=0){
               arr[k]=arr[i];
               k++;
            }
        }

        while (k<arr.length){
            arr[k]=0;
            k++;
        }


    }

}
