package contest.leetcode.heap;

import java.util.*;

//https://leetcode.com/problems/top-k-frequent-words/
public class Problem692 {

    public List<String> topKFrequent(String[] words, int k) {

        HashMap<String,Integer> hashMap=new LinkedHashMap<>();
        for (String s: words){
            hashMap.put(s,hashMap.getOrDefault(s,0)+1);
        }

        PriorityQueue<String> priorityQueue=new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return hashMap.get(o2)-hashMap.get(o1);
            }
        });

        for (String s:hashMap.keySet()){
            priorityQueue.offer(s);
        }
        List<String> list=new ArrayList<>();
        for (int i=0;i<k;i++){
list.add(priorityQueue.poll());
        }

        return list;

    }
}
