package contest.leetcode.array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int inputSize=scanner.nextInt();
        int arr[]=new int[inputSize];
        for (int i=0;i<inputSize;i++){
            arr[i]=scanner.nextInt();
        }
       int array[]= deckRevealedIncreasing(arr);
        for (int x:array){
            System.out.println(x+" ");
        }
    }

    private static int[] deckRevealedIncreasing(int[] deck) {
        int n= deck.length;
        Arrays.sort(deck);
        Queue<Integer> q= new LinkedList<>();
        for (int i=0; i<n; i++) q.add(i);
        int[] res= new int[n];
        for (int i=0; i<n; i++){
            res[q.poll()]=deck[i];
            q.add(q.poll());
        }
        return res;



    }
}
