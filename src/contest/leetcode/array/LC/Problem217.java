package contest.leetcode.array.LC;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/contains-duplicate/
public class Problem217 {
    public static void main(String[] args) {
        int nums[]={1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }

    private static boolean containsDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for (int i=0;i<nums.length;i++){
            if (!set.contains(nums[i])){
                set.add(nums[i]);
            }else {
                return true;
            }
        }
        return false;
    }
}
