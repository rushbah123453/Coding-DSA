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
maxHeap.buildheap();
        System.out.println("");
maxHeap.print();
    }


}
