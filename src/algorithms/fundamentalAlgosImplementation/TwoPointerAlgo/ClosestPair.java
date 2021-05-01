package algorithms.fundamentalAlgosImplementation.TwoPointerAlgo;

import java.util.Arrays;

public class ClosestPair {
    public static int[] getClosestPair(int[] nums, int target) {
        int start = 0, end = nums.length - 1, minValue = Integer.MAX_VALUE, firstIndex = -1, secondIndex = -1;
        while(start < end) {
            if(Math.abs(nums[start] + nums[end] - target) < minValue) {
                firstIndex = start;
                secondIndex = end;
                minValue = Math.abs(nums[start] + nums[end] - target);
            } else if(nums[start] + nums[end] > target) end--;
            else start++;
        }
        return new int[] {nums[firstIndex], nums[secondIndex]};
    }
    public static void main(String[] args) {
        //Sorted array
        int[] nums = {1, 3, 4, 7, 10};
        int target = 15;
        System.out.println("Closest pair: " + Arrays.toString(getClosestPair(nums, target)));

    }
}
