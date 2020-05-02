//https://leetcode.com/problems/rank-transform-of-an-array/
package contest.leetcode.array;

import java.util.*;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int inputSize=scanner.nextInt();
        int arr[]=new int[inputSize];
        for (int i=0;i<inputSize;i++){
            arr[i]=scanner.nextInt();
        }
         arrayRankTransform(arr);
    }

    private static int[] arrayRankTransform(int[] arr) {
        Map<Integer, Integer> map = new TreeMap<>();

        for (int x : arr) {
            map.put(x, 0);
        }

        Map<Integer, Integer> mapNew = new TreeMap<>();
        int count=1;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            mapNew.put(key,count++);


        }


        for (int i=0;i<arr.length;i++){
            if (mapNew.containsKey(arr[i])){
                arr[i]=mapNew.get(arr[i]);
            }
        }

        return arr;


    }
}
