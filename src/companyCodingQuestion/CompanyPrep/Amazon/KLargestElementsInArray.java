package companyCodingQuestion.CompanyPrep.Amazon;


import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class KLargestElementsInArray {

    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,4,8,12,90,56,23,11,10};
        int k=3;
        int res[]=findKLargestElements(a,k);
        for (int x:res){
            System.out.print(x+" ");
        }
    }

    private static int[] findKLargestElements(int[] a, int k) {

       PriorityQueue<Integer> queue=new PriorityQueue<>();

       for (int i=0;i<a.length;i++){
           queue.add(a[i]);
           if(queue.size()>k){
               queue.poll();
           }
       }

       int res[]=new int[k];

       for (int i=0;i<k;i++){
           res[i]=queue.poll();
       }

       return res;
    }
}
