package interviewPrep.java.multithreading.Synchronization;

import java.util.HashMap;
import java.util.Map;

class SharedProductResource {
    private Map<String, Integer> products = new HashMap<>();

    public SharedProductResource() {
        products.put("PEN", 10);
        products.put("BOOK", 1);
        products.put("PENCIL", 10);
    }

    public synchronized String buyProduct(String key) {
        if(products.containsKey(key)) {
            Integer qty = products.get(key);
            if(qty != 0) {
                products.put(key, qty - 1);
                return "Processing successful." + key + " is out for delivery to: " + Thread.currentThread().getName();
            }
        }

        return "OOPS!! Product out of stock. Sorry " + Thread.currentThread().getName();
    }
}

class BuyPen implements Runnable {
    private final SharedProductResource sharedProductResource;

    public BuyPen(SharedProductResource sharedProductResource) {
        this.sharedProductResource = sharedProductResource;
    }

    @Override
    public void run() {
        System.out.println("Buy Pen: " + sharedProductResource.buyProduct("PEN"));
    }
}

class BuyBook implements Runnable {
    private final SharedProductResource sharedProductResource;
    public BuyBook(SharedProductResource sharedProductResource) {
        this.sharedProductResource = sharedProductResource;
    }

    @Override
    public void run() {
        System.out.println("Buy Book: " + sharedProductResource.buyProduct("BOOK"));
    }
}

public class Code {

    public static void main(String[] args) {
        SharedProductResource sharedProductResource = new SharedProductResource();
        //2nd argument is thread name(optional)
        Thread student1 = new Thread(new BuyBook(sharedProductResource), "student1");
        Thread student2 = new Thread(new BuyPen(sharedProductResource), "student2");
        Thread student3 = new Thread(new BuyBook(sharedProductResource), "student3");

        student1.start();
        student2.start();
        student3.start();
    }
}

