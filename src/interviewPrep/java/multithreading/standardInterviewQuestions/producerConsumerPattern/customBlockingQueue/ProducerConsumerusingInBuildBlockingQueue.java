package interviewPrep.java.multithreading.standardInterviewQuestions.producerConsumerPattern.customBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerusingInBuildBlockingQueue {

    public static void main(String[] args) {

        BlockingQueue queue=new ArrayBlockingQueue(5);
        Producer producer=new Producer(queue);
        Consumer consumer=new Consumer(queue);

        Thread producerThread=new Thread(producer);
        Thread consumerThread=new Thread(consumer);

        producerThread.start();
        consumerThread.start();

    }
}

class Producer implements Runnable {
    BlockingQueue<Integer> queue;

    public Producer(BlockingQueue<Integer> queue) {
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

    BlockingQueue<Integer> queue;
    int valueTill=Integer.MIN_VALUE;
    public Consumer(BlockingQueue<Integer> queue){
        this.queue=queue;
    }

    @Override
    public void run() {
            while(valueTill!=5)
            {
                try {
                     valueTill = queue.take();
                    System.out.println("Consumed "+valueTill);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
}
