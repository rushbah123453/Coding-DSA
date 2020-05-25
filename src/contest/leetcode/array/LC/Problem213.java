package contest.leetcode.array.LC;
//https://leetcode.com/problems/house-robber-ii/
public class Problem213 {
    public static void main(String[] args) {
        int nums[]={1,2,3,1};
        System.out.println(rob(nums));
    }

    public  static int rob(int[] nums) {
        int n=nums.length;
        if(n<=0){
            return 0;
        }else if(nums.length==1){
            return nums[0];
        }
        int dp1[]=new int[n];
        int dp2[]=new int[n];
        dp1[1]=nums[0];
        dp2[1]=nums[1];
        for(int i=1;i<n;i++){
            if(i<n-1){
                dp1[i+1]=Math.max(dp1[i-1]+nums[i],dp1[i]);
            }if(i>1 && n>2){
                dp2[i]=Math.max(dp2[i-2]+nums[i],dp2[i-1]);
            }
        }
        return Math.max(dp1[n-1],dp2[n-1]);
    }
}
