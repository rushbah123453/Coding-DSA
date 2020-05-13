package contest.leetcode.array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/wiggle-sort-ii/
public class Problem27 {

    public static void main(String[] args) {
        int nums[]={1,5,1,1,6,4};
        wiggleSort(nums);
    }

    private static void wiggleSort(int[] nums) {
        Queue<Integer> queue1=new LinkedList<>();
        Queue<Integer> queue2=new LinkedList<>();

        Arrays.sort(nums);

        int length= (nums.length)%2==0?(nums.length/2):((nums.length/2)+1);


     for (int i=0;i<length;i++){
         queue1.add(nums[i]);
     }

     for (int i=length;i<nums.length;i++){
         queue2.add(nums[i]);
     }

      for (int i=0;i<nums.length;i++){
          if (!queue1.isEmpty()){
              nums[i]=queue1.remove();
              i++;
          }

          if (!queue2.isEmpty()){
             nums[i]= queue2.remove();

          }

      }


      for (int x:nums){
          System.out.print(x+" ");
      }


    }
}
