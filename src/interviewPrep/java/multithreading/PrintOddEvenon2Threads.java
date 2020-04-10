package interviewPrep.java.multithreading;

public class PrintOddEvenon2Threads  implements Runnable{

   private int max;
   private boolean isEven;
   private Print print;

    public PrintOddEvenon2Threads(int max, boolean isEven,Print print) {
        this.max = max;
        this.isEven = isEven;
        this.print=print;
    }
    @Override
    public void run() {
        int number=isEven?2:1;
        while (number<=max){
            if(isEven){
                print.getEvenNumber(number);
            }else {
                print.getOddNumer(number);
            }
            number+=2;
        }
    }

    public static void main(String[] args) {
        Print print=new Print();
        Thread odd=new Thread(new PrintOddEvenon2Threads(10,false,print),"odd");
        Thread even=new Thread(new PrintOddEvenon2Threads(10,true,print),"even");
        odd.start();
        even.start();

    }


}
class Print{
    private volatile boolean isOdd=false;
    synchronized  void getOddNumer(int number) {
        while (isOdd){
            try {
                wait();
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }

        }
        System.out.println(Thread.currentThread().getName()+":"+number);
        isOdd=true;
        notify();
    }
    synchronized void getEvenNumber(int number) {
        while (!isOdd){
            try
            {
                wait();
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(Thread.currentThread().getName()+":"+number);
        isOdd=false;
        notify();
    }
}