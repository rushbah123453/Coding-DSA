package dsa.heaps.problems;

import java.util.PriorityQueue;

public class b_kthLargestElementInArray {

    public static void main(String[] args) {
        int arr[]={1,8,3,5,2,7,10};
        int k=2;
        int ans=findkthLargestElement(arr,k);
        System.out.println(k+"th largest element is "+ans);

    }

    private static int findkthLargestElement(int[] arr, int k) {
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        for (int x:arr){
            priorityQueue.offer(x);
            if(priorityQueue.size()>k){
                priorityQueue.poll();
            }
        }

        return priorityQueue.peek();
    }
}
