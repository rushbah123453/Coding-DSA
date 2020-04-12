package interviewPrep.java.OOPs.inheritance;

public class ClassC extends ClassA{
    public ClassC() {
        System.out.println("In Constructor : Class C");
    }

    @Override
    public void show() {
        //super.show();
        System.out.println("Class C show");
    }

    public void noShow(){

        System.out.println("Class C No show");
    }

    public static void main(String[] args) {

        ClassA a=new ClassC();
        a.show();
        ClassC c=new ClassC();
        c.noShow();

    }
}
