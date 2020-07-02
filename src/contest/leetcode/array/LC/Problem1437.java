package contest.leetcode.array.LC;

public class Problem1437 {

    public boolean kLengthApart(int[] nums, int k) {

        int currCount=k;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                currCount++;
            }else{
                if(currCount<k){
                    return false;
                }
                currCount=0;
            }

        }
        return true;

    }
}
