package contest.mustDo.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Solution {

    public static void main(String[] args) {
        //compareVersion();
    }

    public static String[] solution(String[] str) {

       // String str[]={"1.11", "2.0.0", "1.2", "2", "0.1", "1.2.1", "1.1.1", "2.0"};
        Arrays.sort(str);
        Collections.sort(Arrays.asList(str), new Comparator<String>() {
            @Override
            public int compare(String x, String y) {

                String[] v1 = x.split("\\.");
                String[] v2 = y.split("\\.");



                int longest = v1.length > v2.length? v1.length: v2.length;
                int ver1=0;int ver2=0;
                for(int i=0; i<longest; i++)
                {
                     ver1 = i<v1.length? Integer.parseInt(v1[i]): 0;
                     ver2 = i<v2.length? Integer.parseInt(v2[i]): 0;

                    if(ver1> ver2) return 1;
                    if(ver1 < ver2) return -1;

                }
                if(ver1==ver2){
                    if (v1.length>v2.length){
                        return 1;
                    }else {
                        return 0;
                    }
                }
                return 0;
            }
        });


        for (String s:str){
            System.out.print(s+" ");
        }


return str;
    }
}
