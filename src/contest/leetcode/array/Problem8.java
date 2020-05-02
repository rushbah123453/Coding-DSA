/*
Optiimized LeetCode Solution
* // 1. First find the size of the decompressed list by
// adding up the frequencies (every other int in the list, since they are given
// in pairs.)
//
// 2. We then create a new array of that size we figured out.
//
// 3. Now we loop through the pairs and change the output array's value at the
// corresponding index to the newValue 'freq' times
*
* */
//https://leetcode.com/problems/decompress-run-length-encoded-list/
package contest.leetcode.array;

import java.util.ArrayList;
import java.util.Scanner;


public class Problem8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int inputSize=scanner.nextInt();
        int arr[]=new int[inputSize];
        for (int i=0;i<inputSize;i++){
            arr[i]=scanner.nextInt();
        }
      int array[]=  decompressRLElist(arr);
        for (int x:array){
            System.out.print(x+" ");
        }
    }

    private static int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i=0;(i*2+1)<nums.length;i++){
            int freq=nums[2*i];
            int value=nums[2*i+1];
            for (int j=0;j<freq;j++){
                arrayList.add(value);
            }
        }

        //System.out.println(arrayList);
        int [] array=new int[arrayList.size()];
        for (int i=0;i<arrayList.size();i++){
            array[i]=arrayList.get(i);
        }


        return array;

    }
}
