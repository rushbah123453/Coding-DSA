package algorithms.fundamentalAlgosImplementation.TwoPointerAlgo;

import java.util.Arrays;

public class TripletClosestSum {
    public static int threeSumClosest(int[] nums, int target) {
        int minSum = nums[0] + nums[1] + nums[nums.length - 1];
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++) {
            int start = i + 1, end = nums.length - 1;
            while(start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if(Math.abs(sum - target) < Math.abs(minSum - target)) {
                    minSum = sum;
                } else if(sum > target) {
                    end--;
                } else {
                    start++;
                }
            }
        }
        return minSum;
    }

    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        int target = 1;
        System.out.println("Closest sum: " + threeSumClosest(nums, target));
    }
}
