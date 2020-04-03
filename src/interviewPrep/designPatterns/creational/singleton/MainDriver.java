package interviewPrep.designPatterns.creational.singleton;

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



        /**
         *
         * Eager-Initialization Approach : Thread safe , High performance
         * JVM initializes the instance when classis loaded ,so we dont need to use synchronized
         * Drawback: This instance will be created even if the client never uses it
         */
        EagerInit eagerInit=EagerInit.getInstance();
        eagerInit.setData(28);
        System.out.println("First reference"+eagerInit);
        System.out.println("Data: "+eagerInit.getData());

        eagerInit=null;
        eagerInit=EagerInit.getInstance();
        System.out.println("Second reference"+eagerInit);
        System.out.println("Data: "+eagerInit.getData());

        EagerInit eagerInit1=EagerInit.getInstance();
        System.out.println("Third reference"+eagerInit1);
        System.out.println("Data: "+eagerInit1.getData());



        /**
         *
         * Bill-Pugh Approach : Thread safe , High performance
         * JVM initializes the instance when static inner method is called ,
         *  This instance will be created only if the client calls it
         */
        Bill_Pugh_Approach bill_pugh_approach=Bill_Pugh_Approach.getInstance();
        bill_pugh_approach.setData(29);
        System.out.println("First reference"+bill_pugh_approach);
        System.out.println("Data: "+bill_pugh_approach.getData());

        bill_pugh_approach=null;
         bill_pugh_approach=Bill_Pugh_Approach.getInstance();
        System.out.println("Second reference"+bill_pugh_approach);
        System.out.println("Data: "+bill_pugh_approach.getData());

        Bill_Pugh_Approach bill_pugh_approach1=Bill_Pugh_Approach.getInstance();
        System.out.println("Third reference"+bill_pugh_approach1);
        System.out.println("Data: "+bill_pugh_approach1.getData());



    }
}
