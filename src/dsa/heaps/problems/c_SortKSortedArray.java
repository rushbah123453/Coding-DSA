package dsa.heaps.problems;

import java.util.PriorityQueue;

public class c_SortKSortedArray {
    public static void main(String[] args) {
        int arr[]={6,5,3,1,2,8,10,9,12};
        int k=3;
        sortKSortedArray(arr,k);
    }

    private static void sortKSortedArray(int[] arr, int k) {
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        int start=0;
        for (int x:arr){
            priorityQueue.offer(x);
            if(priorityQueue.size()>k){
             arr[start++]=priorityQueue.poll();
            }
        }

        while (!priorityQueue.isEmpty()){
            arr[start++]=priorityQueue.poll();
        }

        System.out.println("Sorted Array");

        for (int x:arr){
            System.out.print(x+" ");
        }
    }
}
