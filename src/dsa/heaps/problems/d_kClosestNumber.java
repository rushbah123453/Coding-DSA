package dsa.heaps.problems;

import java.util.Comparator;
import java.util.PriorityQueue;

public class d_kClosestNumber {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int num=7;
        int k=3;

        kClosestNumber(arr,num,k);
    }

    private static void kClosestNumber(int[] arr, int num, int k) {
        PriorityQueue<Store> priorityQueue=new PriorityQueue<>(new Comparator<Store>() {
            @Override
            public int compare(Store o1, Store o2) {
                return o2.difference-o1.difference;
            }
        });

        for (int x:arr){
            Store store=new Store();
            store.difference=Math.abs(num-x);
            store.value=x;
            priorityQueue.offer(store);
            if (priorityQueue.size()>k){
                priorityQueue.poll();
            }
        }

        while (!priorityQueue.isEmpty()){
            System.out.print(priorityQueue.poll().value+" ");
        }
    }
}

class Store{
    Integer difference;
    Integer value;
}
