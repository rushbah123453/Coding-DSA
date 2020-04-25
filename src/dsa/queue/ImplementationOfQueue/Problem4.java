package dsa.queue.ImplementationOfQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++){
            binaryQueue(scanner.nextInt());
        }
    }

    private static void binaryQueue(int n) {

        Queue<String> queue=new LinkedList<>();
        queue.add("1");

        while (n-->0){
            String s1=queue.remove();
            System.out.println(s1);
            String s2=s1;
            queue.add(s1+"0");
            queue.add(s2+"1");
        }




    }
}
