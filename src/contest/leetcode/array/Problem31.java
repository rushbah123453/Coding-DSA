package contest.leetcode.array;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/array-nesting/
public class Problem31 {

    public static void main(String[] args) {
        int nums[]={5,4,0,3,1,6,2};
        System.out.println(arrayNesting(nums));
    }

    private static int arrayNesting(int[] nums) {
        int count=1;
        boolean arrayVisited[]=new boolean[nums.length];
        for (int i=0;i<nums.length;i++){
            Set<Integer> set=new HashSet<>();
            set.add(nums[i]);
            int pointer=i;
            while (!arrayVisited[nums[pointer]]){

                    set.add(nums[nums[pointer]]);
                    pointer=nums[pointer];
                    count=Math.max(count,set.size());
                    arrayVisited[pointer]=true;



            }
            if (count==nums.length){
                break;
            }
        }

        return count;
    }
}
