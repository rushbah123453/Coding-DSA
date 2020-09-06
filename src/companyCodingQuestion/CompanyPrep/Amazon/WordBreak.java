package companyCodingQuestion.CompanyPrep.Amazon;

import java.util.*;

public class WordBreak {
    static Set<String> set=new HashSet<>();
   static Map<String, Boolean> map=new HashMap<>();
    public static void main(String[] args) {
        String temp_dictionary[] = {"mobile","samsung","sam","sung",
                "man","mango","icecream","and",
                "go","i","like","ice","cream"};
        fillHashSet(temp_dictionary);
        String input="likegoi";
        System.out.println( wordBreak(input));
    }

    private static boolean wordBreak(String input) {
       if (input.length()==0)
           return true;
       if (map.containsKey(input))return map.get(input);

        for (int i=0;i<=input.length();i++){
            if (set.contains(input.substring(0,i))&& wordBreak(input.substring(i,input.length()))){
                map.put(input.substring(i,input.length()),true);
                return true;
            }else {
                map.put(input.substring(i,input.length()),false);
            }
        }
        return false;

    }

    private static void fillHashSet(String[] temp_dictionary) {
        for (String x:temp_dictionary){
          set.add(x);  
        }
    }



    //method2: optimized dp approach
    public boolean wordBreak(String s, List<String> wordDict) {
        //if(s.length()==0)return true;

        boolean dp[]=new boolean[s.length()+1];
        dp[0]=true;

        // l e e t c o d e
        //""
        //l
        //le
        //lee
        //leet true
        //leetc
        //leetco
        //leetcod
        //leetcode true


        for(int i=0;i<=s.length();i++){
            for(int j=0;j<i;j++){

                if(dp[j] && wordDict.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }

            }
        }
        return dp[s.length()];
    }

}
