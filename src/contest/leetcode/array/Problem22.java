package contest.leetcode.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//https://leetcode.com/problems/k-diff-pairs-in-an-array/
public class Problem22 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int inputSize=scanner.nextInt();
        int arr[]=new int[inputSize];
        for (int i=0;i<inputSize;i++){
            arr[i]=scanner.nextInt();
        }
        int k=scanner.nextInt();
        findPairs(arr,k);
    }

    private static int findPairs(int[] arr, int k) {

        HashMap<Integer,Integer> hashMap=new HashMap<>();

        if(k<0){
            return 0;
        }

        for (int i=0;i<arr.length;i++){
            hashMap.put(arr[i],hashMap.getOrDefault(arr[i],0)+1);
        }
        int count=0;
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (k == 0) {
                if (entry.getValue() >= 2) {
                    count++;
                }
            } else {
                if (hashMap.containsKey(entry.getKey() + k)) {
                    count++;
                }
            }
        }

        System.out.println(count);
return count;

    }
}
