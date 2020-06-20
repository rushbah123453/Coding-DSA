package contest.leetcode.array.LC;
//https://leetcode.com/problems/find-the-duplicate-number/
public class Problem287 {

    public int findDuplicate(int[] nums) {

        int slowPointer=nums[0];
        int fastPointer=nums[nums[0]];

        while(slowPointer!=fastPointer){
            slowPointer=nums[slowPointer];
            fastPointer=nums[nums[fastPointer]];
        }

        slowPointer=0;

        while(slowPointer!=fastPointer){
            slowPointer=nums[slowPointer];
            fastPointer=nums[fastPointer];
        }

        return slowPointer;




    }
}
