package algorithms.fundamentalAlgosImplementation.Sorting;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

// Priority Queue by default implements min heap
// To make Priority Queue a max heap ->
// PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
// For K largest use min heap, for K smallest use max heap
public class KLargest {
    public static void main(String[] args) {
        int[] nums = { 1, 23, 12, 9, 30, 2, 50 };
        int k = 3;
        Queue<Integer> q = getKLargest(nums, k);
        System.out.println("K Largest: ");
        for(int i = 0; i < k; i++) System.out.println(q.poll());
    }
    public static Queue<Integer> getKLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            // as pq is min heap the elements will auto arrange so that min element is at top
            pq.add(num);

            // when we remove top element it removes the min element living the max elements at bottom
            if (pq.size() > k) pq.poll();
        }
        return pq;
    }
}
