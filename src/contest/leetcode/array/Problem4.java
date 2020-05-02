//https://leetcode.com/problems/maximum-product-of-three-numbers/
package contest.leetcode.array;
import java.util.Arrays;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int inputSize=scanner.nextInt();
        int arr[]=new int[inputSize];
        for (int i=0;i<inputSize;i++){
            arr[i]=scanner.nextInt();
        }
       System.out.println(maximumProduct(arr));
    }

    private static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[0]*nums[1]*nums[nums.length-1],nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]);
    }
}
