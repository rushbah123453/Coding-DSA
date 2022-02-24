package algorithms.fundamentalAlgosImplementation.Sorting;

import java.util.Arrays;

//[38, 27, 43, 3, 9, 82, 10]
// left = 0, right = 6;
public class MergeSort {
    public static void merge(int[] arr, int[] left, int leftCount, int[] right, int rightCount) {
        int i = 0, j = 0, k = 0;
        while(i < leftCount && j < rightCount) {
            if(left[i] <= right[j]) arr[k++] = left[i++];
            else arr[k++] = right[j++];
        }
        while(i < leftCount) arr[k++] = left[i++];
        while(j < rightCount) arr[k++] = right[j++];
    }
    public static void mergeSort(int[] arr, int n) {
        if(n < 2) return;
        int mid = n/2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];
        for(int i = 0; i < mid; i++) left[i] = arr[i];
        for(int i = mid; i < n; i++) right[i - mid] = arr[i];
        mergeSort(left, mid);
        mergeSort(right, n - mid);
        merge(arr, left, mid, right, n - mid);
    }
    public static void main(String[] args) {
        int[] arr = { 5, 8, 9, 2, 10, 3 };
        mergeSort(arr, arr.length);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
