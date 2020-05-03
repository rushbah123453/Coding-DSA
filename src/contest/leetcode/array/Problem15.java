//https://leetcode.com/problems/non-decreasing-array/submissions/
package contest.leetcode.array;

import java.util.*;

public class Problem15 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int inputSize=scanner.nextInt();
        int arr[]=new int[inputSize];
        for (int i=0;i<inputSize;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println(checkPossibility(arr));
    }

    private static boolean checkPossibility(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++)
            if (!(nums[i] <= nums[i + 1])) {
                if (count > 0)
                    return false;
                if (i - 1 >= 0 && i + 2 < nums.length && (nums[i] > nums[i + 2] && nums[i + 1] < nums[i - 1]))
                    return false;
                count++;
            }
        return true;

    }
}
