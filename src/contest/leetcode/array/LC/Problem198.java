package contest.leetcode.array.LC;
//https://leetcode.com/problems/house-robber/
public class Problem198 {

    public int rob(int[] nums) {
        if(nums.length<=0){
            return 0;
        }

        int kad[]=new int[nums.length+1];
        kad[1]=nums[0];
        int i=1;
        for(;i<nums.length;i++){
            kad[i+1]=Math.max(kad[i-1]+nums[i],kad[i]);
        }


        return kad[i];

    }
}
