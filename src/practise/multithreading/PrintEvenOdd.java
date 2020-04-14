package practise.multithreading;

public class PrintEvenOdd implements Runnable{
    int max;
    boolean isEven;
    Print print;


    PrintEvenOdd(int max,boolean isEven,Print print){
        this.max=max;
        this.isEven=isEven;
        this.print=print;
    }

    @Override
    public void run() {
        int number=isEven?0:1;
        while (number<=max){
            if (isEven){
                print.printEven(number);
            }else{
                print.printOdd(number);
            }
            number+=2;
        }

    }

    public static void main(String[] args) {
        Print print=new Print();
        Thread odd=new Thread(new PrintEvenOdd(10,false,print));
        Thread even=new Thread(new PrintEvenOdd(10,true,print));
       odd.start();
       odd.start();
       even.start();
    }


}
 class Print {
   volatile  boolean isEven=true;
     synchronized void  printEven(int number) {

        while (!isEven){
            try {
                wait();
            }catch (Exception e){
Thread.currentThread().interrupt();
            }
        }
        System.out.println("Even "+number);
         isEven=false;
         notify();
    }




     synchronized void  printOdd(int number) {
         while (isEven){
             try {
                 wait();
             }catch (Exception e){
Thread.currentThread().interrupt();
             }
         }
         System.out.println("Odd "+number);
         isEven=true;
         notify();
     }
}