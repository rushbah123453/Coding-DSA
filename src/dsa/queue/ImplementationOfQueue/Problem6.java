//https://mycode.prepbytes.com/problems/queues/MAXSUB
package dsa.queue.ImplementationOfQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem6 {
   static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

        int inputSize=scanner.nextInt();
        int windowSize=scanner.nextInt();
        maxWindow(inputSize,windowSize);
    }

    private static void maxWindow(int inputSize, int windowSize) {
        int array[]=new int[inputSize];

        for (int i=0;i<inputSize;i++){
            array[i]=scanner.nextInt();
        }

        Queue<Integer> maxQueue=new LinkedList<>();


        for (int i=0;i<=inputSize-windowSize;i++){
            int max=array[i];
            for (int j=i;j<i+windowSize;j++){
                if (max<array[j]){
                   max=array[j];
                }
            }
            maxQueue.add(max);
        }


        while (!maxQueue.isEmpty()){
            System.out.print(maxQueue.remove()+" ");
        }
    }
}
