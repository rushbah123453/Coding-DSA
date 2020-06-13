package contest.leetcode.heap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

//https://leetcode.com/problems/top-k-frequent-elements/
public class Problem347 {

    public int[] topKFrequent(int[] nums, int k) {

        int res[]=new int[k];
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int x:nums){
            hashMap.put(x,hashMap.getOrDefault(x,0)+1);
        }

        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return hashMap.get(o2)-hashMap.get(o1);
            }
        });


        for (int x:hashMap.keySet()){
            priorityQueue.offer(x);
        }

        for (int i=0;i<k;i++){
           res[i]=priorityQueue.poll();
        }


        return res;
    }
}
