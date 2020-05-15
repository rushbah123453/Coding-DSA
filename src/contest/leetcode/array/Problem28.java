package contest.leetcode.array;

import java.util.Arrays;

//https://leetcode.com/problems/kth-largest-element-in-an-array/
public class Problem28 {
    public static void main(String[] args) {
        int arr[]={3,2,1,5,6,4};
        System.out.println(  findKthLargest(arr,2));
    }

    private static int findKthLargest(int[] arr, int k) {

        Arrays.sort(arr);

        return arr[arr.length-1-k];
    }
}
