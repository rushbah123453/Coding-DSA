package interviewPrep.java.multithreading.standardInterviewQuestions.producerConsumerPattern.UsingNotifyWait;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyBlockingQueue<E> {
    private int size;
    private Queue<E> queue;
    private ReentrantLock lock = new ReentrantLock(true);
    private Condition notEmpty=lock.newCondition();
    private Condition notFull=lock.newCondition();

    public MyBlockingQueue(int size) {
        System.out.println("Blocking queue using notify and wait");
        this.size = size;
        queue = new LinkedList<E>();
    }


    public synchronized void put(E e) {

        try {
            synchronized (queue) {
                if (queue.size() == size) {
                    queue.wait();
                }
            }
            synchronized (queue) {
                queue.add(e);
                queue.notifyAll();
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public  E take() {

        E item=null;
        try {
            synchronized (queue) {
                while (queue.size() == 0) {
                    queue.wait();
                }
            }
            synchronized (queue) {
                item = queue.poll();
                queue.notifyAll();
                return item;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return item;
    }

}
