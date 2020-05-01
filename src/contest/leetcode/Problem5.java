//https://leetcode.com/problems/remove-element/
//optimize: use 2 pointer
package contest.leetcode;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int inputSize=scanner.nextInt();
        int arr[]=new int[inputSize];
        for (int i=0;i<inputSize;i++){
            arr[i]=scanner.nextInt();
        }
        int val=scanner.nextInt();
        System.out.println(removeElement(arr,val));
    }

    private static int removeElement(int[] nums,int val) {
        ArrayList<Integer> arrayList=new ArrayList<>();
int count =0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==val){
                count++;
            }else {
                arrayList.add(nums[i]);
            }
        }
        for (int i=0; i < arrayList.size(); i++)
        {
            nums[i]= arrayList.get(i);
        }

        return nums.length-count;
    }
}
