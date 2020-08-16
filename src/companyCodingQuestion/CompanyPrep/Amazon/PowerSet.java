package companyCodingQuestion.CompanyPrep.Amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PowerSet {

    public static void main(String[] args) {
        int a[]={1,2,2,3};
        printPowerSet(a);
       // subsets(a);
    }
    private static void printPowerSet(int[] a) {
        int n=a.length;
        int combinations=(int)Math.pow(2,n);

        for (int i=0;i<combinations;i++){
            for (int j=0;j<n;j++){
                if((i & (1<<j))>0)
                    System.out.print(a[j]);
            }
            System.out.println("");
        }

    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private static void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
        list.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}
