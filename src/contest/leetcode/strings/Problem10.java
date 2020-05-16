package contest.leetcode.strings;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/
public class Problem10 {
    public static void main(String[] args) {
        String s = "friend";
        String t = "family";
        System.out.println(minSteps(s, t));
    }

    private static int minSteps(String s, String t) {
        Map<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            if (hashMap.containsKey(t.charAt(i))) {
                if (hashMap.get(t.charAt(i)) != 0) {
                    hashMap.put(t.charAt(i), hashMap.get(t.charAt(i)) - 1);
                }
            }
        }
        int res = 0;
        for (Map.Entry<Character, Integer> map : hashMap.entrySet()) {
            res += map.getValue();
        }
        return res;

    }
}
