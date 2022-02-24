package algorithms.Interview;

import java.util.HashMap;

// I dont know how we can do it using tabular method yet.
// So i will do it using recursion using memoization
// Time complexity: 0(n*total)
// Space complexity: 0(n)
public class _2EqualPartitionSum {

    public static void main(String[] args) {
        int arr[]={1, 5, 6};
        boolean partition=isEqualPartition(arr);
        System.out.println(partition);
    }

    private static boolean isEqualPartition(int[] arr) {
        int total = 0;
        for (int x : arr){
            total += x;
        }
        // If some is odd no need to perform further check
        if(total % 2 != 0) return false;

        // else call recursive method
        // 0 -> partialSum which will be updated on iterating through values
        // hashmap -> for memoization
        else return canPartition(arr, 0, 0, total, new HashMap<String, Boolean>());

    }

    private static boolean canPartition(int[] arr, int index, int partialSum, int total, HashMap<String, Boolean> state) {
        String key = index + ":" + partialSum;
        if(state.containsKey(key)) return state.get(key);

        // if sum till now is half the total, the rest should add up to total, as (sum till now) + (rest sum) == total
        else if(partialSum * 2 == total) return true;
        else if(partialSum > total || index >= arr.length) return false;
        else {

            // we check for both cases, in first case the current value is considered and hence subtracted from total
            // in next case current value is not considered
            boolean result = canPartition(arr, index + 1, partialSum + arr[index], total, state)
                    || canPartition(arr, index + 1, partialSum, total, state);
            state.put(key, result);
            return result;
        }
    }
}
