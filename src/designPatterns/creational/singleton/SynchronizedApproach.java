/*
 * Synchronized Approach
 *
 * Advantages: Thread safe
 *
 * DrawBack :  Decreases the performance
 *
 * Synchronized is only required for first time , when one object is created we dont need synchronized
 * Hence it decreases the performance because threads wait to check if previous thread have completed operation or not
 *
 * */
package designPatterns.creational.singleton;

public class SynchronizedApproach {


    private static SynchronizedApproach instance=null;

    private static int data=0;

    private SynchronizedApproach(){}

    public static synchronized SynchronizedApproach getInstance(){

        if (instance==null)
            instance=new SynchronizedApproach();

        return instance;
    }

    public static int getData() {
        return data;
    }

    public static void setData(int data) {
        SynchronizedApproach.data = data;
    }
}
