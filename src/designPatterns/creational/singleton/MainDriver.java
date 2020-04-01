package designPatterns.creational.singleton;

public class MainDriver {

    public static void main(String[] args) {

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


    }
}
