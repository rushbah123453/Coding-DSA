package algorithms.fundamentalAlgosImplementation.Sorting;

public class CountInversionsInArray {
    private static int inversionCount;
    public static void merge(int[] arr, int[] left, int leftIndex, int[] right, int rightIndex) {
        int i = 0, j = 0, k = 0;
        while(i < leftIndex && j < rightIndex) {
            if(left[i] <= right[j]) arr[k++] = arr[i++];
            else {
                arr[k++] = arr[j++];
                inversionCount += leftIndex - i;
            }
        }
    }
    public static void mergeSort(int[] arr, int n) {
        if(n < 2) return;
        else {
            int mid = n/2;
            int[] left = new int[mid];
            int[] right = new int[n - mid];
            for(int i = 0; i < mid; i++) left[i] = arr[i];
            for(int i = mid; i < n; i++) right[i - mid] = arr[i];
            mergeSort(left, mid);
            mergeSort(right, n - mid);
            merge(arr, left, mid, right, n - mid);
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 20, 6, 4, 5 };
        mergeSort(arr, arr.length);
        System.out.println("Inversions count: " + inversionCount);

    }
}
