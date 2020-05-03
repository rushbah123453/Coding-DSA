//https://leetcode.com/problems/third-maximum-number/
package contest.leetcode.array;

import java.lang.reflect.Array;
import java.util.*;

public class Problem17 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int inputSize=scanner.nextInt();
        int arr[]=new int[inputSize];
        for (int i=0;i<inputSize;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println(thirdMax(arr));
    }

    private static int thirdMax(int[] nums) {

            Integer max1 = null;
            Integer max2 = null;
            Integer max3 = null;
            for (Integer n : nums) {
                if (n.equals(max1) || n.equals(max2) || n.equals(max3)) continue;
                if (max1 == null || n > max1) {
                    max3 = max2;
                    max2 = max1;
                    max1 = n;
                } else if (max2 == null || n > max2) {
                    max3 = max2;
                    max2 = n;
                } else if (max3 == null || n > max3) {
                    max3 = n;
                }
            }
            return max3 == null ? max1 : max3;
        }


}
