package contest.leetcode.array.LC;

import java.util.Arrays;

//https://leetcode.com/problems/product-of-array-except-self/
public class Problem238 {

    public int[] productExceptSelf(int[] nums) {
        if(nums.length<=1){
            return nums;
        }
        int size=nums.length;
        int left[]=new int[size];
        Arrays.fill(left,1);
        for(int i=1;i<size;i++){
            left[i]=left[i-1]*nums[i-1];
        }
        int r=1;
        for(int i=size-1;i>=0;i--){
            left[i]=left[i]*r;
            r=r*nums[i];
        }
        return left;
    }
}
