package interviewPrep.java.multithreading.standardInterviewQuestions.producerConsumerPattern.customBlockingQueue;

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
        this.size = size;
        queue = new LinkedList<E>();
    }


    public void put(E e) {
        lock.lock();
        try {
            if(queue.size()==size){
                notFull.await();
            }
            queue.add(e);
            notEmpty.signalAll();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public E take() {
        lock.lock();
        E item=null;
        try {
            while (queue.size()==0)
            {
                notEmpty.await();
            }
             item = queue.poll();
            notFull.signalAll();
            return item;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return item;
    }

}
