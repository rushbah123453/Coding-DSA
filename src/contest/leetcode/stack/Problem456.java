package contest.leetcode.stack;

import java.util.Stack;
//https://leetcode.com/problems/132-pattern/
public class Problem456 {

    public boolean find132pattern(int[] nums) {


        int secondLargest=Integer.MIN_VALUE;
        Stack<Integer> stack=new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
while(!stack.isEmpty() && stack.peek()<nums[i]){
                secondLargest=stack.pop();
            }
 if(!stack.isEmpty() && secondLargest>nums[i]){
                return true;
            }
stack.push(nums[i]);
        }

        return false;
    }
}
