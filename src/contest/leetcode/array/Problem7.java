//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
package contest.leetcode.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int inputSize=scanner.nextInt();
        int arr[]=new int[inputSize];
        for (int i=0;i<inputSize;i++){
            arr[i]=scanner.nextInt();
        }
        smallerNumbersThanCurrent(arr);
        for (int x:arr){
            System.out.print(x+" ");
        }
    }

    private static int[] smallerNumbersThanCurrent(int[] arr) {
       int b[]= arr.clone(); //creates shallow copy
        Arrays.sort(b);
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<b.length;i++){
            if (!map.containsKey(b[i]))
                map.put(b[i],i);
        }

        for (int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }

        return arr;

   }
}
