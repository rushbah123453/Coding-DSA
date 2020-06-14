package contest.leetcode.heap;

import java.security.Principal;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

//https://leetcode.com/problems/sort-characters-by-frequency/
public class Problem451 {

    public static void main(String[] args) {
        frequencySort("tree");
    }

    public static String frequencySort(String s) {

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (Character input : s.toCharArray()) {
            hashMap.put(input, hashMap.getOrDefault(input, 0) + 1);
        }


        PriorityQueue<Character> priorityQueue = new PriorityQueue<>(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return hashMap.get(o2) - hashMap.get(o1);
            }
        });


        for (Character input : hashMap.keySet()) {
            priorityQueue.offer(input);
        }

        String res = "";


        for (int i = 0; i < hashMap.size(); i++) {

            Character c = priorityQueue.poll();

            for (int j = 0; j < hashMap.get(c); j++) {
                res = res + c;
            }

        }


        return res;
    }
}
