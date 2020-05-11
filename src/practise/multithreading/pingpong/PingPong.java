package practise.multithreading.pingpong;

public class PingPong implements Runnable {

    String word;

    PingPong(String word) {
        this.word = word;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.print(word+" ");
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
