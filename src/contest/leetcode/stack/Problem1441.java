package contest.leetcode.stack;

import java.util.ArrayList;
import java.util.List;

public class Problem1441 {
    public List<String> buildArray(int[] target, int n) {

        List<String> list=new ArrayList<>();
        int element=1;
        for(int i=0;i<target.length;){
            list.add("Push");
            if(target[i]==element){
                i++;
            }else{
                list.add("Pop");
            }
            element++;
        }

        return list;
    }
}
