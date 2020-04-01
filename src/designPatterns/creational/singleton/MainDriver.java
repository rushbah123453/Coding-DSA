package designPatterns.creational.singleton;

public class MainDriver {

    public static void main(String[] args) {

        /**
         * Lazy Approach - Not Thread Safe
         */
        LazyEvaluation instance=LazyEvaluation.getInstance();
        instance.setData(25);
        System.out.println("First reference"+instance);
        System.out.println("Data: "+instance.getData());

        instance=null;
        instance=LazyEvaluation.getInstance();
        System.out.println("Second reference"+instance);
        System.out.println("Data: "+instance.getData());

        LazyEvaluation newInstance=LazyEvaluation.getInstance();
        System.out.println("Third reference"+newInstance);
        System.out.println("Data: "+newInstance.getData());



        /**
         *
         * Synchronized Approach : Thread safe ,But decrease the performance
         */
        SynchronizedApproach synchronizedApproach=SynchronizedApproach.getInstance();
        synchronizedApproach.setData(26);
        System.out.println("First reference"+synchronizedApproach);
        System.out.println("Data: "+synchronizedApproach.getData());

        synchronizedApproach=null;
        synchronizedApproach=SynchronizedApproach.getInstance();
        System.out.println("Second reference"+synchronizedApproach);
        System.out.println("Data: "+synchronizedApproach.getData());

        SynchronizedApproach synchronizedApproach1=SynchronizedApproach.getInstance();
        System.out.println("Third reference"+synchronizedApproach1);
        System.out.println("Data: "+synchronizedApproach1.getData());






        /**
         *
         * Double-Checked Approach : Thread safe , High performance
         */
        DoubleChecked doubleChecked=DoubleChecked.getInstance();
        doubleChecked.setData(27);
        System.out.println("First reference"+doubleChecked);
        System.out.println("Data: "+doubleChecked.getData());

        doubleChecked=null;
        doubleChecked=DoubleChecked.getInstance();
        System.out.println("Second reference"+doubleChecked);
        System.out.println("Data: "+doubleChecked.getData());

        DoubleChecked doubleChecked1=DoubleChecked.getInstance();
        System.out.println("Third reference"+doubleChecked1);
        System.out.println("Data: "+doubleChecked1.getData());



    }
}
