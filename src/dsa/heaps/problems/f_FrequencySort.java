package dsa.heaps.problems;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class f_FrequencySort {
    public static void main(String[] args) {
        int a[]={1,1,1,3,2,2,4};
        frequenctSort(a);
    }

    private static void frequenctSort(int[] a) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int x:a){
            hashMap.put(x,hashMap.getOrDefault(x,0)+1);
        }

        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return hashMap.get(o2)-hashMap.get(o1);
            }
        });

    for (Map.Entry<Integer,Integer> map:hashMap.entrySet()){
        priorityQueue.offer(map.getKey());
    }

    while (!priorityQueue.isEmpty()){
        int key=priorityQueue.poll();
        for (int i=0;i<hashMap.get(key);i++){
            System.out.print(key+" ");
        }
    }

    }
}
