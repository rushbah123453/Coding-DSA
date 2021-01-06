package algorithms.fundamentalAlgosImplementation.TwoPointerAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSum {
    public static List<List<Integer>> getTriplets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++) {
            int start = i + 1, end = nums.length - 1;
            while(start < end) {
                if(nums[start] + nums[end] == -nums[i]) {
                    List<Integer> val = new ArrayList<>();
                    val.add(nums[i]);
                    val.add(nums[start]);
                    val.add(nums[end]);
                    res.add(val);
                    start++;
                    end--;
                } else if(nums[start] + nums[end] < -nums[i]) start++;
                else end--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {0, -1, 2, -3, 1};
        System.out.println("Triplets found: " + getTriplets(nums).toString());
    }
}
