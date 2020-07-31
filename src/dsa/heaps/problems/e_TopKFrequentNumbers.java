package dsa.heaps.problems;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class e_TopKFrequentNumbers {

    public static void main(String[] args) {
        int arr[]={1,1,1,3,2,2,4};
        int k=2;
        findTopKFrequentNumbers(arr,k);
    }

    private static void findTopKFrequentNumbers(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o1)-map.get(o2);
            }
        });

        for (int x:arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        for (Map.Entry<Integer,Integer> hash:map.entrySet()){
            priorityQueue.offer(hash.getKey());
            if(priorityQueue.size()>k)
                priorityQueue.poll();
        }

        while (!priorityQueue.isEmpty()){
            System.out.print(priorityQueue.poll()+" ");
        }
    }
}
