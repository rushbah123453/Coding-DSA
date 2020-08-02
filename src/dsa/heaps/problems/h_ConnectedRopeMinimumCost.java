package dsa.heaps.problems;

import java.util.PriorityQueue;

public class h_ConnectedRopeMinimumCost {

    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int res=findMinimumCost(a);
        System.out.println(res);
    }

    private static int findMinimumCost(int[] a) {
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        for (int x:a){
                priorityQueue.offer(x);
        }

        int cost=0;
        while (priorityQueue.size()>=2){
            int sum=priorityQueue.poll()+priorityQueue.poll();
            cost+=sum;
            priorityQueue.offer(sum);
        }

        return cost;
    }
}
