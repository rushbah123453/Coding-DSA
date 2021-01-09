package algorithms.fundamentalAlgosImplementation.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
    public static int getPartitionIndex(int[] arr, int start, int end) {
        int pivot = arr[end];
        int partitionIndex = start;
        for(int i = start; i < end; i++) {
            if(arr[i] <= pivot) {
                swap(arr, i, partitionIndex);
                partitionIndex++;
            }
        }
        swap(arr, partitionIndex, end);
        return partitionIndex;
    }
    public static void quickSort(int[] arr, int start, int end) {
        if(start < end) {
            int partitionIndex = getPartitionIndex(arr, start, end);
            quickSort(arr, start, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }
    public static void main(String[] args) {
        int[] arr = { 8, 4, 2, 1 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(arr));

    }
}
