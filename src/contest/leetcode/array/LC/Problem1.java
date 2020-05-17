package contest.leetcode.array.LC;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum/
public class Problem1 {
    public static void main(String[] args) {
        int nums[]={3,2,4};
        int target=6;
       int res[]= twoSum(nums,target);
        System.out.println(res[0]+" "+res[1]);
    }

    private static int[] twoSum(int[] nums, int target) {
        int res[]=new int[2];

        Map<Integer,Integer> map=new HashMap<>();

        for (int i=0;i<nums.length;i++){
            if (!map.containsKey(target-nums[i])){
                map.put(nums[i],i);
            }else {
               res[0]= map.get(target-nums[i]);
               res[1]=i;
               break;
            }
        }
        return res;
    }
}
