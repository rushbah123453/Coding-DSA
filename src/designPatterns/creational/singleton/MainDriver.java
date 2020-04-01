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
        System.out.println("Third reference"+synchronizedApproach);
        System.out.println("Data: "+synchronizedApproach.getData());



    }
}
