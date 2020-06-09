package practise.heap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int maxSize=scanner.nextInt();
        MaxHeap maxHeap=new MaxHeap(maxSize);

        for (int i=1;i<=maxSize;i++){
            maxHeap.insert(scanner.nextInt());
        }
        maxHeap.print();

      //  maxHeap.buildHeap();
        maxHeap.heapSort();
        System.out.println("");
        maxHeap.print();

    }
}
