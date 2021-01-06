package algorithms.fundamentalAlgosImplementation.TwoPointerAlgo;

import java.util.Arrays;

public class ClosestPairFor2Arrays {
    public static int[] getClosestPair(int[] nums1, int[] nums2, int target) {
        int start=0, end=nums2.length-1, minValue=Integer.MAX_VALUE, firstIndex=-1, secondIndex=-1;
        while(start < nums1.length && end >= 0) {
            if(Math.abs(nums1[start]+nums2[end]-target) < minValue) {
                firstIndex=start;
                secondIndex=end;
                minValue=Math.abs(nums1[start]+nums2[end]-target);
            } else if(nums1[start]+nums2[end] > target) end--;
            else start++;
        }
        return new int[] {nums1[firstIndex], nums2[secondIndex]};
    }

    public static void main(String[] args) {
        //Sorted Arrays
        int[] nums1 = {1, 4, 5, 7};
        int[] nums2 = {10, 20, 30, 40};
        int target = 50;
        System.out.println(Arrays.toString(getClosestPair(nums1, nums2, target)));

    }
}
