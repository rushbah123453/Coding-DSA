package interviewPrep.java.AccessModifiers;

public class ClassA {

    public static void main(String[] args) {
        ClassB access=new ClassB();
        access.a=11;
        System.out.println(access.a);
    }
}
