/**
 *
 * Eager-Initialization Approach : Thread safe , High performance
 * JVM initializes the instance when classis loaded ,so we dont need to use synchronized
 *
 * Drawback: This instance will be created even if the client never uses it
 */
package designPatterns.creational.singleton;
public class EagerInit {

    private static final EagerInit uniquieInstance=new EagerInit();

    private int data=0;


    private EagerInit(){}

    public static EagerInit getInstance(){
        return uniquieInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
