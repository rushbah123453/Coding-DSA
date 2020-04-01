/**
 *
 * Bill-Pugh Approach : Thread safe , High performance
 * JVM initializes the instance when static inner method is called ,
 *  This instance will be created only if the client calls it
 *
 *
 Because the first time getInstance() is called, the JVM will call inner static class .
 If another thread calls getInstance() concurrently, the JVM won't load the inner static class a
 second time: it will wait for the first thread to have completed the class loading,
 and at the end of the loading and initialization of the holder class, both thread will
 see the holder class properly initialized and thus containing the unique singleton instance
 */

package designPatterns.creational.singleton;
public class Bill_Pugh_Approach {


    private int data=0;


    private Bill_Pugh_Approach(){}

    public static class SingletonHelper{

        private static final Bill_Pugh_Approach uniquieInstance=new Bill_Pugh_Approach();
    }

    public static Bill_Pugh_Approach getInstance(){
        return SingletonHelper.uniquieInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
