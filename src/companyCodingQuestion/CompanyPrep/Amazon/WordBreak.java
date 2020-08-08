package companyCodingQuestion.CompanyPrep.Amazon;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
}
