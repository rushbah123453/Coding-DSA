//https://leetcode.com/problems/minimum-absolute-difference/
package contest.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int inputSize=scanner.nextInt();
        int arr[]=new int[inputSize];
        for (int i=0;i<inputSize;i++){
            arr[i]=scanner.nextInt();
        }
        minimumAbsDifference(arr);
    }

    private static void minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for (int i=0;i<arr.length-1;i++){
            min=Math.min(Math.abs(arr[i]-arr[i+1]),min);
        }

        System.out.println(min);
        List<List<Integer>> res=new ArrayList<>();
        for (int i=1;i<arr.length;i++){
                if (arr[i]-arr[i-1]==min){
                    List<Integer> list=new ArrayList<>(2);
                    list.add(arr[i-1]);
                    list.add(arr[i]);
                    res.add(list);
                }
            }


        System.out.println(res);


    }
}
