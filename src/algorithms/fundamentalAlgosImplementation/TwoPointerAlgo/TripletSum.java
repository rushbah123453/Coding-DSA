package algorithms.fundamentalAlgosImplementation.TwoPointerAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSum {
    public static void checkIfSumIsZero(int[] nums, int currentIdx, List<List<Integer>> triplets) {
        int start = currentIdx + 1, end = nums.length - 1;
        while(start < end) {
            int sum = nums[currentIdx] + nums[start] + nums[end];
            if(sum < 0) start++;
            else if(sum > 0) end--;
            else {
                List<Integer> triplet = Arrays.asList(nums[currentIdx], nums[start], nums[end]);
                triplets.add(triplet);
                start++;
                end--;
                // To avoid duplicate values
                // if value at start and start - 1 is same then no need to pick the number at start
                // as it will produce duplicate
                while(start < end && nums[start] == nums[start - 1]) start++;
                while(start < end && nums[end] == nums[end + 1]) end--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {-2,0,1,1,2};
        Arrays.sort(nums);
        List<List<Integer>> triplets = new ArrayList<List<Integer>>();
        for(int i = 0; i < nums.length - 2; i++) {
            //To avoid duplicate. if number at i pos equals number at i-1
            // then no need to check for number at pos i, as it will lead duplicate values
            if(i > 0 && nums[i] == nums[i-1]) continue;
            checkIfSumIsZero(nums, i, triplets);
        }
        System.out.println("Triplets found: " + triplets.toString());
    }
}
