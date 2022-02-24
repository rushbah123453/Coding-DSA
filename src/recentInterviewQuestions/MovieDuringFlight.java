package recentInterviewQuestions;

//You are a in-flight movie service provider. You are given a list of movie lengths and the duration of the flight.
// Return a pair of (2) movies whose combined length is the highest and is less than or equal to flight duration.
// If multiple such combinations are possible, return the pair which has the movie of longer longest duration
//Ex :
//MovieLenghts : {27, 1,10, 39, 12, 52, 32, 67, 76}
//Flight Duration : 77.
//The 2 possible pairs are (1,76) and (10,67), The answer is (1,76) as per the last constraint

import java.util.*;

public class MovieDuringFlight {
    public static void main(String[] args) {
        int[] movieLengths = {27, 1,10, 39, 12, 52, 32, 67, 76};
        int flightDuration = 77;
        System.out.println("Possible pairs: " + getPossiblePairs(movieLengths, flightDuration));
        System.out.println("Possible pairs In O(n): " + getPossiblePairInOofN(movieLengths, flightDuration));
    }

    //Time: O(nlogn) | Space: O(1)
    public static List<List<Integer>> getPossiblePairs(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> possiblePairs = new ArrayList<>();
        int start = 0, end = nums.length - 1;
        while(start < end) {
            int sum  = nums[start] + nums[end];
            if(sum < target) start++;
            else if(sum > target) end--;
            else {
                possiblePairs.add(Arrays.asList(nums[start], nums[end]));
                start++;
                end--;
            }
        }
        return possiblePairs;
    }

    //Time: O(n) | Space: O(n)
    public static List<List<Integer>> getPossiblePairInOofN(int[] nums, int target) {
        Set<Integer> set = new HashSet<>();
        List<List<Integer>> possiblePairs = new ArrayList<>();
        for(int num : nums) {
            if(set.contains(target - num)) {
                possiblePairs.add(Arrays.asList(num, target - num));
            } else {
                set.add(num);
            }
        }
        return possiblePairs;
    }
}
