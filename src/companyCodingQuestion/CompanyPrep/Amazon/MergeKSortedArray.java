package companyCodingQuestion.CompanyPrep.Amazon;

import java.util.PriorityQueue;
import java.util.Queue;

public class MergeKSortedArray {

    public static void main(String[] args) {
        int a[][]={{1,10,45},{2,5,18},{5,23,78}};
        int res[]=mergerkArray(a);
        print(res);
    }

    private static void print(int[] res) {
        for (int x:res){
            System.out.print(" "+x+" ");
        }
        System.out.println("");
    }

    private static int[] mergerkArray(int[][] a) {
        Queue<QueueObject> queue=new PriorityQueue<>();
        int size=0;
        for(int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
              if (j==0){
                  queue.add(new QueueObject(0,i,a[i][j]));
              }
              size+=1;
            }
        }


        int res[]=new int[size];
        for(int i=0;!queue.isEmpty();i++){
            QueueObject temp=queue.poll();
            res[i]=temp.value;
            int newIndex=temp.index+1;
            int arraynumber=temp.arrayNumber;
            if(newIndex<a[arraynumber].length){
                queue.add(new QueueObject(newIndex,arraynumber,a[arraynumber][newIndex]));
            }
        }

        return res;
    }

    static class QueueObject implements Comparable<QueueObject>{

        int value;
        int index;
        int arrayNumber;

        public QueueObject(int index,int arrayNumber,int value){
            this.index=index;
            this.value=value;
            this.arrayNumber=arrayNumber;
        }

        @Override
        public int compareTo(QueueObject queueObject) {
            if(value>queueObject.value)return 1;
            if(value<queueObject.value)return -1;
            return 0;
        }
    }
}
