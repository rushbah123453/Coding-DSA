package dsa.heaps.problems;

import java.util.PriorityQueue;

//https://leetcode.com/problems/kth-largest-element-in-an-array/
public class Problem215 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        for(int x:nums){

            if(queue.size()<k)
                queue.offer(x);
            else if(queue.peek()<x){
                queue.offer(x);
                queue.poll();
            }
        }


        return queue.poll();
    }
}
