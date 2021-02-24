package algorithms.fundamentalAlgosImplementation.TwoPointerAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> twoSum(int[] nums, int firstIdx, int secondIdx, int start, int end, int target, List<List<Integer>> res) {
        while (start < end) {
            List<Integer> fourVal = new ArrayList<Integer>();
            int value = nums[firstIdx] + nums[secondIdx] + nums[start] + nums[end];
            if (value < target) start++;
            else if (value > target) end--;
            else {
                fourVal.add(nums[firstIdx]);
                fourVal.add(nums[secondIdx]);
                fourVal.add(nums[start]);
                fourVal.add(nums[end]);
                res.add(fourVal);
                start++;
                end--;

                // check to avoid picking duplicate element
                // if nums[start-1] is picked and nums[start] is same as picked element we skip that element
                // here we are checking for start - 1 and not start + 1 element because our start variable is
                // always incremented, so we check if previous element was same
                while (start < end && nums[start] == nums[start - 1]) start++;
                while (start < end && nums[end] == nums[end + 1]) end--;
            }
        }
        return res;
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        // i will go till fourth last element.
        // j will go till third last element
        // in twoSum method we will iterate two elements last of which will be second last and last
        // i.e. start = second last and end = last
        for (int i = 0; i < nums.length - 3; i++) {

            // check to avoid picking same set twice.
            // if i value is same as in previous case we just skip the further logic
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;
                res = twoSum(nums, i, j, j + 1, nums.length - 1, target, res);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 0};
        int target = 0;
        FourSum fourSum = new FourSum();
        System.out.println("Solution: " + fourSum.fourSum(nums, target).toString());
    }
}
