package contest.leetcode.array.LC;
//https://leetcode.com/problems/missing-number/
public class Problem268 {

    public static void main(String[] args) {
        int nums[]={0,1,3};
        System.out.println(missingNumber(nums));
    }

    private static int missingNumber(int[] nums) {
        int actualSum=0,expectedSum=0;
        int n=nums.length;
        expectedSum=n*(n+1)/2;
        for (int i=0;i<nums.length;i++){
            actualSum+=nums[i];
        }

        return expectedSum-actualSum;
    }
}
