package interviewPrep.java.multithreading.ThreadCreation;

public class ThreadDemo {

    public static void main(String[] args) {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("In thread "+Thread.currentThread().getName());
            }
        });

        thread.setPriority(Thread.MAX_PRIORITY); // Developer can set static Priority (Dynamic Prioirty=Static Priority+Bonus)
        thread.setName("Initial-Thread");
        System.out.println("Before Thread Start !!!");
        thread.start(); // OS Will put this thread on scheduler
        System.out.println("After Thread Start !!!");
    }
}
