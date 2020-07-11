package contest.leetcode.strings.LC;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Problem1408 {

    public List<String> stringMatching(String[] words) {

        List<String> list=new LinkedList<>();

        Arrays.sort(words,new Comparator<String>(){
            public int compare(String s1,String s2){
                return s1.length()-s2.length();
            }
        });

        for(int i=0;i<words.length-1;i++){

            for(int j=i+1;j<words.length;j++){
                if( words[j].contains(words[i]) ){
                    list.add(words[i]);
                    break;
                }


            }
        }

        return list;


    }
}
