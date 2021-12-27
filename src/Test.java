import java.util.*;

public class Test {
        public static List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            res.add(new ArrayList<Integer>());
            subsetsHelper(nums, res);
            return res;
        }
        public static void subsetsHelper(int[] nums, List<List<Integer>> subsets) {
            for(int i = 0; i < nums.length; i++) {
                int len = subsets.size();
                for(int j = 0; j < len; j++) {
                    List<Integer> currSubset = new ArrayList<>(subsets.get(j));
                    currSubset.add(nums[i]);
                    subsets.add(currSubset);
                }
            }
        }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println("Result: " + subsets(nums).toString());
    }

}
