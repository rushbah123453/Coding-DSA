package interviewPrep.java.OverloadingVsOveriding;

public class Overloading {

    public void add(int a ,int b){
        System.out.println("i am in void add");
    }
    public int add(int b){
        System.out.println("i am in void add");
        return 1;
    }
    public float add(int a,int b,int c){
        System.out.println("i am in void add");
        return 1;
    }

}
