package dsa.heaps.problems;

import java.util.Comparator;
import java.util.PriorityQueue;

public class g_KClosestPointFromOrigin {

    public static void main(String[] args) {
        int a[][]={{1,3},{-2,2},{5,8},{0,1}};
        int k=2;
        findKClosestPointFromOrigin(a,k);
    }

    private static void findKClosestPointFromOrigin(int[][] a, int k) {

        //
        PriorityQueue<int[]> priorityQueue=new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return (b[0]*b[0]+b[1]*b[1])-(a[0]*a[0]+a[1]*a[1]);
            }
        }) ;

        for (int x[]:a){
            priorityQueue.offer(x);
            if(priorityQueue.size()>k){
                priorityQueue.poll();
            }
        }


        while (!priorityQueue.isEmpty()){
            int[] res =priorityQueue.poll();
            System.out.print("{"+res[0]+","+res[1]+"}");
        }

    }
}
