package contest.leetcode.array.LC;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class Problem442 {
    public List<Integer> findDuplicates(int[] nums) {



        List<Integer> list=new ArrayList<>();
        if(nums.length<=1)
            return list;
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i])-1;
            if((nums[index])<0){
                list.add(index+1);
            }else{
                nums[index]=-nums[index];
            }
        }

        return list;

    }
}
