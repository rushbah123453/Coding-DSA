package dsa.heaps.problems;

import java.util.Comparator;
import java.util.PriorityQueue;

public class a_kthSmallestElementInArray {

    public static void main(String[] args) {
        int arr[]={7,10,4,3,20,15};
        int k=4;
      int ans=  findkthSmallestElementOfArray(arr,k);
        System.out.println(k+"th smallest Element is "+ans);
    }

    private static int findkthSmallestElementOfArray(int[] arr, int k) {
        //max heap
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        for (int x:arr){
            priorityQueue.offer(x);
            if(priorityQueue.size()>k){
                priorityQueue.poll();
            }
        }

        return priorityQueue.poll();

    }
}
