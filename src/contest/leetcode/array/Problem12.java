//https://leetcode.com/problems/majority-element/
package contest.leetcode.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int inputSize=scanner.nextInt();
        int arr[]=new int[inputSize];
        for (int i=0;i<inputSize;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println(majorityElement(arr));

        //optimized Approach: Boyer-Moore Voting Algo
        boyerMooreVoting(arr);
    }



    private static int majorityElement(int[] nums) {
int majority=nums.length/2;
        Map<Integer,Integer> hashMap=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (!hashMap.containsKey(nums[i])){
                hashMap.put(nums[i],1);
            }else {
                hashMap.put(nums[i],hashMap.get(nums[i])+1);
            }
        }

        for (Map.Entry<Integer,Integer> entry:hashMap.entrySet()){
            if (entry.getValue()>majority){
                System.out.println(entry.getKey());
                return entry.getKey();
            }

        }

      return 0;
    }




    private static int boyerMooreVoting(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}
