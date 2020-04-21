//https://mycode.prepbytes.com/problems/queues/ENDEQ
package dsa.queue.ImplementationOfQueue;

import java.util.Scanner;

public class Problem1 {
   static Queue queue;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int testCase=scanner.nextInt();
        queue=new Queue();
        for (int i=0;i<testCase;i++){
            queue.enqueue(scanner.nextInt());
            queue.printQueue();
        }
        for (int i=0;i<testCase;i++){
            queue.dequeue();
            queue.printQueue();
        }

    }

}
class Queue{
    int front,rear,size,capacity,array[];
    Queue(){
        this.array=new int[1000];
        this.capacity=1000;
        this.size=0;
        this.front=0;
        this.rear=capacity-1;
    }

    private boolean isFull(){
        return (size==capacity);
    }

    private boolean isEmpty(){
        return (size==0);
    }

    public void enqueue(int data){

        if (isFull())
            return;
        rear=(rear+1)%capacity;
        array[rear]=data;
        size++;

    }


    public int dequeue(){
        if (isEmpty())
            return Integer.MIN_VALUE;

        int temp=array[front];
        front=(front+1)%capacity;
        size--;
        return temp;
    }


    public int front(){
        if (isEmpty())
            return Integer.MIN_VALUE;

        return array[front];

    }

    public int rear(){
        if (isEmpty())
            return Integer.MIN_VALUE;
        return array[rear];

    }

    public void printQueue(){

        if (isEmpty())
            return;

        int tempFront=front;
       for (int i=0;i<size;i++){
           System.out.print(array[tempFront]+" ");
           tempFront=(tempFront+1)%capacity;
       }
        System.out.println("");

    }

}