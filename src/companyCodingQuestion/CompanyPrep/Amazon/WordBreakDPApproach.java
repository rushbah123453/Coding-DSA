package companyCodingQuestion.CompanyPrep.Amazon;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordBreakDPApproach {
    static Set<String> set=new HashSet<>();
    static Map<String, Boolean> map=new HashMap<>();
    public static void main(String[] args) {
        String temp_dictionary[] = {"mobile","samsung","sam","sung",
                "man","mango","icecream","and",
                "go","i","like","ice","cream"};
        fillHashSet(temp_dictionary);
        String input="likegoih";
        System.out.println( wordBreak(input));
    }

    private static boolean wordBreak(String input) {


        boolean dp[]=new boolean[input.length()+1];
        dp[0]=true;
        for (int i=1;i<=input.length();i++){
            for (int j=0;j<i;j++){
                if (dp[j] && set.contains(input.substring(j,i))){
                    dp[i]=true;break;
                }
            }
        }
        return dp[input.length()];
    }


    private static void fillHashSet(String[] temp_dictionary) {
        for (String x:temp_dictionary){
            set.add(x);
        }
}

}
