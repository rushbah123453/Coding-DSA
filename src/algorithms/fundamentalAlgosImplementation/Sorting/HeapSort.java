package algorithms.fundamentalAlgosImplementation.Sorting;

import java.util.Arrays;

public class HeapSort {
    public static void maxHeapify(int[] arr, int n, int start) {
        int largestIndex = start;
        int leftChildIndex = start * 2 + 1;
        int rightChildIndex = start * 2 + 2;
        if(leftChildIndex < n && arr[largestIndex] < arr[leftChildIndex]) {
            largestIndex = leftChildIndex;
        }
        if(rightChildIndex < n && arr[largestIndex] < arr[rightChildIndex]) {
            largestIndex = rightChildIndex;
        }
        if(largestIndex != start) {
            swap(arr, start, largestIndex);
            maxHeapify(arr, n, largestIndex);
        }
    }

    private static void swap(int[] arr, int start, int largestIndex) {
        int temp = arr[start];
        arr[start] = arr[largestIndex];
        arr[largestIndex] = temp;
    }

    public static void heapSort(int[] arr, int n) {
        // We will run the loop till the height of the array. Height (log n) or (n/2 - 1)
        for(int i = n/2 - 1; i >= 0; i--) {
            // Step 1. Max heapifying the array
            maxHeapify(arr, n, i);
        }
        for(int i = n - 1; i >= 0; i--) {
            // swap first and last index. First index = max value, so now that value will be last.
            // For next iteration last value will not be considered as last value will be in correct
            // position
            swap(arr, 0, i);

            // After swap max heapify again so that the next largest value will be on top
            maxHeapify(arr, i, 0);
        }
    }
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        heapSort(nums, nums.length);
        System.out.println("Sorted array: " + Arrays.toString(nums));
    }
}
