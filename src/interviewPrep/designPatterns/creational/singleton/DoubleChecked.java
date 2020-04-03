/*
 * Double-Check Approach
 *
 * Advantages : Thread safe , High Performance  as Synchronized is called atmost one time
 *
 *
 *
 *  You can use the java volatile variable, which will instruct JVM threads to read the
 * value of volatile variable from main memory and don’t cache it locally
 *
 * Inshort , using volatile , Thread will read most recent value of that variable
 *
 * */

package interviewPrep.designPatterns.creational.singleton;
public class DoubleChecked {


    private static volatile DoubleChecked instance=null; //volatile added

    private static int data=0;

    private DoubleChecked(){}

    public static  DoubleChecked getInstance(){

        if (instance==null){
            synchronized (DoubleChecked.class){      //we only synchronize first time
                if (instance==null){
                    instance=new DoubleChecked();
                }
            }
        }


        return instance;
    }

    public static int getData() {
        return data;
    }

    public static void setData(int data) {
        DoubleChecked.data = data;
    }
}
