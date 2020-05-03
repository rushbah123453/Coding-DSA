//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
package contest.leetcode.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem16 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int inputSize=scanner.nextInt();
        int arr[]=new int[inputSize];
        for (int i=0;i<inputSize;i++){
            arr[i]=scanner.nextInt();
        }
        int extraCandies=scanner.nextInt();
       List<Boolean> list= kidsWithCandies(arr,extraCandies);
        for (boolean x:list){
            System.out.print(x+" ");
        }
    }

    private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies=Integer.MIN_VALUE;
        List<Boolean> list=new ArrayList<>();
        for (int x:candies){
            maxCandies=Math.max(maxCandies,x);
        }

        for (int x:candies){
            if ((x+extraCandies)>=maxCandies){
                list.add(true);
            }else {
                list.add(false);
            }

        }

        return list;



    }
}
