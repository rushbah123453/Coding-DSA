package contest.leetcode.array.LC;
//https://leetcode.com/problems/maximum-subarray/
public class Problem53 {
    public static void main(String[] args) {
        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    private static int maxSubArray(int[] nums) {

        if (nums.length<=0){
            return -1;
        }
        int max=nums[0];
        int currentMax=nums[0];

        for (int i=1;i<nums.length;i++){
            currentMax=Math.max(nums[i]+currentMax,nums[i]);

           if (currentMax>max){
               max=currentMax;
           }
        }
        return max;
    }
}
