package practise.multithreading.pingpong;

public class Driver {

    public static void main(String[] args) {

        Thread thread1=new Thread(new Ping("ping"));
        Thread thread2=new Thread(new Ping("pong"));
        thread1.start();
        thread2.start();
    }
}
