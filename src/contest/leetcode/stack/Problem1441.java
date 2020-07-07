package contest.leetcode.stack;

import java.util.ArrayList;
import java.util.List;

public class Problem1441 {
    public List<String> buildArray(int[] target, int n) {

        List<String> list=new ArrayList<>();
        int element=1;
        for(int i=0;i<target.length;){
            if(target[i]==element){
                list.add("Push");
                i++;
            }else{
                list.add("Push");
                list.add("Pop");
            }
            element++;
        }

        return list;
    }
}
