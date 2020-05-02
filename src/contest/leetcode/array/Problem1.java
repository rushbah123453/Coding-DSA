//https://leetcode.com/problems/fair-candy-swap/
package contest.leetcode.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem1 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int array1Size=scanner.nextInt();
        int array2Size=scanner.nextInt();
        int A[]=new int[array1Size];
        int B[]=new int[array2Size];
        for (int i=0;i<array1Size;i++){
            A[i]=scanner.nextInt();
        }
        for (int i=0;i<array2Size;i++){
            B[i]=scanner.nextInt();
        }

       int response[]= fairCandySwap(A,B);

        for (int x:response){
            System.out.println(x);
        }
    }

    private static int[] fairCandySwap(int[] a, int[] b) {

        int sa = 0, sb = 0;  // sum of A, B respectively
        for (int x: a) sa += x;
        for (int x: b) sb += x;
        int delta = (sb - sa) / 2;
        // If Alice gives x, she expects to receive x + delta

        Set<Integer> setB = new HashSet();
        for (int x: b) setB.add(x);

        for (int x: a)
            if (setB.contains(x + delta))
                return new int[]{x, x + delta};

        throw null;

    }




}
