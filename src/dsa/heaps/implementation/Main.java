package dsa.heaps.implementation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Size of Heap");
        int maxSize=scanner.nextInt();
        MaxHeap maxHeap=new MaxHeap(maxSize);
        System.out.println("Enter Element");
        for (int i=1;i<=maxSize;i++){
            maxHeap.insert(scanner.nextInt());
        }
        maxHeap.print();
        System.out.println("");
        maxHeap.buildheap();
   //     System.out.println("Max element extracted ="+maxHeap.extractMax());
//maxHeap.buildheap();
//maxHeap.heapSort();
        //System.out.println("");
//maxHeap.print();
        System.out.println("Increase Key");
        maxHeap.increaseKey(2,100);
        maxHeap.print();
    }


}
