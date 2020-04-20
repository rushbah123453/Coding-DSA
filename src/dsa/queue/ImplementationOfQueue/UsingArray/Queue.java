package dsa.queue.ImplementationOfQueue.UsingArray;

public class Queue {

    int front,rear,size,capacity,array[];

    Queue(int capaity){

        this.front=0;
        this.capacity=capaity;
        this.size=0;
        this.rear=capaity-1;
        this.array=new int[capaity];
    }


    private boolean isFull(){
        return (size==capacity);
    }

    private boolean isEmpty(){
        return (size==0);
    }

    public void enqueue(int data){

        if (isFull())
            return ;

        rear=(rear+1)%capacity;
        array[rear]=data;
        size++;
        System.out.println(data+ " enqueued to queue");

    }


    public int dequeue(){
        if (isEmpty())
            return Integer.MIN_VALUE;

        int temp=array[rear];
        front=(front+1)%capacity;
        size--;
        return temp;


    }


    int front(){
        if (isEmpty())
            return Integer.MIN_VALUE;
        return array[front];
    }

    int rear(){
        if (isEmpty())
            return Integer.MIN_VALUE;
        return array[rear];
    }


}
