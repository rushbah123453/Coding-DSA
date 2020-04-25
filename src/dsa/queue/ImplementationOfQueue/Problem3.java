package dsa.queue.ImplementationOfQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int testCase=scanner.nextInt();
        for (int i=0;i<testCase;i++){
            stone(scanner.nextInt());
        }
    }

    private static void stone(int n) {

        Queue<Integer> queue=new LinkedList<>();

       for (int i=1;i<=n;i++){
           queue.add(i);
       }

       while (queue.size()>1){
           int pick= queue.remove();;
           queue.add(pick);
          queue.remove();
       }

System.out.println(queue.peek());
    }
}
