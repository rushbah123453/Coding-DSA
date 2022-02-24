import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public static void main(String[] args) {
        String s = "abc";
        List<String> res = new ArrayList<>();
        permutationHelper(new StringBuilder(s), new StringBuilder(), res);
        System.out.println("Result:" + res.toString());


        /*

        Chandrakant LNU4:44 PM
        Given an array of integers and the absolute difference between two consecutive elements is 1 Find the all A[ i ] where
        A[ i ] > A[ i - 1 ] AND A[ i ] > A[ i + 1 ]
        OR
        A[ i ] < A[ i - 1 ] AND A[ i ] < A[ i + 1 ]

        Case 1: A [ ] = { -2, -1, 0, 1, 2, 1, 0, -1, -2}
        Output: 2
        Case 2: A [ ] = { -2, -1, 0, 1, 2, 1, 0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0, 1, 2, 3, 4 }
        Output: 2, 0, 5, 0
        */
//        int[] nums = { -2, -1, 0, 1, 2, 1, 0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0, 1, 2, 3, 4 };
//        List<Integer> res2 = new ArrayList<>();
//        getValues(nums, res2);
//        System.out.println("Result of 2nd sum:" + res2.toString());

    }

    private static void getValues(int[] nums, List<Integer> res) {
        int index = 0;
        while(index + 2 < nums.length) {
            if(nums[index] == nums[index + 2]) {
                res.add(nums[index + 1]);
                index = index + 3;
            } else {
                index++;
            }
        }
//        for(int i = 1; i < nums.length - 1; i++) {
//            if((nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) || (nums[i] < nums[i - 1] && nums[i] < nums[i + 1])) {
//                res.add(nums[i]);
//            }
//        }
    }

    private static void permutationHelper(StringBuilder s, StringBuilder currPerm, List<String> res) {
        if(s.length() == 0 && currPerm.length() > 0) {
            res.add(currPerm.toString());
            return;
        }

        for(int i = 0; i < s.length(); i++) {
            StringBuilder newString = new StringBuilder(s);
            StringBuilder newPerm = new StringBuilder(currPerm);
            Character c = newString.charAt(i);
            newString.deleteCharAt(i);
            newPerm.append(c);
            permutationHelper(newString, newPerm, res);
        }
    }
}
