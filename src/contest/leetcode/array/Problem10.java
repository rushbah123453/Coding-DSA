//https://leetcode.com/problems/create-target-array-in-the-given-order/
/*
* Optimized solution is to , use arraylist , arraylist rotates element internally if present
* */
package contest.leetcode.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int inputSize=scanner.nextInt();
        int nums[]=new int[inputSize];
        int index[]=new int[inputSize];
        for (int i=0;i<inputSize;i++){
            nums[i]=scanner.nextInt();
        }
        for (int i=0;i<inputSize;i++){
            index[i]=scanner.nextInt();
        }
        int array[]=  createTargetArray(nums,index);
        for (int x:array){
            System.out.print(x+" ");
        }

        secondApproach(nums,index);
    }



    private static int[] createTargetArray(int[] nums, int[] index) {
int[] target=new int[nums.length];

for (int i=0;i<target.length;i++){
    target[i]=-1;
}

for (int i=0;i<index.length;i++){
    if (target[index[i]]!=-1){
        rightSift(target,index[i]);
    }
    target[index[i]]=nums[i];
}



return target;

    }

    private static void rightSift(int[] target, int start) {
        for (int i=target.length-1;i>start;i--){
            target[i]=target[i-1];
        }
    }



    private static int[] secondApproach(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]); // add every element from nums into the arrayList at the given index from index array
        }
        int[] result = new int[nums.length];
        for(int i = 0; i < list.size(); i++) {
            result[i] = list.get(i); // move back into array format
        }
        return result;
    }
}
