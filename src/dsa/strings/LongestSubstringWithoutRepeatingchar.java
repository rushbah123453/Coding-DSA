package dsa.strings;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingchar {

    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(n==0)return 0;
        Map<Character,Integer> map=new HashMap<>();
        int j=0,max=0;
        for(int i=0;i<n;i++){
            if(map.containsKey(s.charAt(i)))
            {
                j=Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max=Math.max(max,i-j+1);
        }

        return max;
    }
}
