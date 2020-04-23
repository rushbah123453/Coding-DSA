package interviewPrep.java.staticVsNonStactic;

public class A {


    public static void main(String[] args) {
        A a=new A();
        a.methodC();

    }


    public static void methodB(){
        System.out.println("I am Static method B");
    }

    public static void methodA(){
        System.out.println("I am Static method A");

    }

    public void methodC(){
        System.out.println("I am Not Static method , B ");
        System.out.println("But I can call static methods");
        //methodA();
       // methodA();

    }

    public final void methodD(){
       methodC();
    }

}
class B extends A{
    public static void main(String[] args) {
        A.methodA();
        methodA();
    }

    public static final void methodA(){
        System.out.println("I am Static method A of class B");

    }

}