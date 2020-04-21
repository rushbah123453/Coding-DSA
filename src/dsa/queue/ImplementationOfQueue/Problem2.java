//https://mycode.prepbytes.com/problems/queues/RVRSEQU
package dsa.queue.ImplementationOfQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Problem2 {

static Queue<Integer> queue;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++){
            int inputQueueLength=scanner.nextInt();
                queue=new LinkedList<>();
            for (int j=0;j<inputQueueLength;j++){
                queue.add(scanner.nextInt());
            }
            reverseQueue();
            printQueue();
            queue=null;
        }
    }

    private static void reverseQueue() {
        Stack<Integer> stack=new Stack<>();
        while (!queue.isEmpty()){
            stack.push(queue.peek());
            queue.remove();
        }

        while (!stack.isEmpty()){
            queue.add(stack.pop());
        }

    }

    public static void printQueue(){
        while (!queue.isEmpty()){
            System.out.print(queue.peek()+" ");
            queue.remove();
        }
        System.out.println("");
    }


}
