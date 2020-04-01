package designPatterns.creational.singleton;

public class LazyEvaluation {

    private static LazyEvaluation uniquieInstance=null;

    private int data=0;


    private LazyEvaluation(){}

    public static LazyEvaluation getInstance(){

        if (uniquieInstance==null)
            uniquieInstance=new LazyEvaluation();

        return uniquieInstance;

    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

}
