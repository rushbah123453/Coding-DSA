package algorithms.fundamentalAlgosImplementation.Sorting;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;

public class KSortedArray {
    public static void heapSort(int[] arr, int n, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < k + 1; i++) {
            pq.add(arr[i]);
        }
        int index = 0;
        for(int i = k + 1; i < n; i++) {
            if(pq.peek() != null) {
                arr[index++] = pq.poll();
                pq.add(arr[i]);
            }
        }
        Iterator<Integer> it = pq.iterator();
        while(it.hasNext()) {
            if(pq.peek() != null) {
                arr[index++] = pq.poll();
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 2, 8, 10, 9};
        int k = 3;
        heapSort(arr, arr.length, k);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
