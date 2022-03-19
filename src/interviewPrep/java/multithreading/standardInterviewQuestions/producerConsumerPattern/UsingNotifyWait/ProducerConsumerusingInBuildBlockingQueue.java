package interviewPrep.java.multithreading.standardInterviewQuestions.producerConsumerPattern.UsingNotifyWait;


import java.util.concurrent.ArrayBlockingQueue;


public class ProducerConsumerusingInBuildBlockingQueue {

    public static void main(String[] args) {

        MyBlockingQueue<Integer> queue=new MyBlockingQueue<>(5);
        Producer producer=new Producer(queue);
        Consumer consumer=new Consumer(queue);

        Thread producerThread=new Thread(producer);
        Thread consumerThread=new Thread(consumer);

        producerThread.start();
        consumerThread.start();

    }
}

class Producer implements Runnable {
    MyBlockingQueue<Integer> queue;

    public Producer(MyBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for(int i=0;i<=5;i++)
        {
            try {
                queue.put(i);
                System.out.println("Produced "+i);
            }catch (Exception e)
            {

            }
        }
    }
}


class Consumer implements Runnable{

    MyBlockingQueue<Integer> queue;
    int valueTill=Integer.MIN_VALUE;
    public Consumer(MyBlockingQueue<Integer> queue){
        this.queue=queue;
    }

    @Override
    public void run() {
            while(valueTill!=5)
            {
                valueTill = queue.take();
                System.out.println("Consumed "+valueTill);

            }
    }
}
