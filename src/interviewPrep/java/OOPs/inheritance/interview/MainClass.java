package interviewPrep.java.OOPs.inheritance.interview;

 class A {
}

class B extends A{}

class C extends B{}

public class MainClass {
    public static void main(String[] args) {

        C c=new C();
        print(c);
    }

    static void print(A a)
    {
        System.out.println("Animal");
    }


    static void print(B a)
    {
        System.out.println("Body");
    }

    static void print(Object a)
    {
        System.out.println("Object");
    }


}
