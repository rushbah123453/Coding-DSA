//https://leetcode.com/problems/find-common-characters/
package contest.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem13 {
    public static void main(String[] args) {

        commonChars(new String[]{"a","b"});
    }
    public static List<String> commonChars(String[] string) {
        String A[]={"bella","label","roller"};
        int[] min = new int[26];
        Arrays.fill(min, Integer.MAX_VALUE);

        for (String a : A) {
            int[] count = new int[26];
            for (char ch : a.toCharArray()) {
                count[ch - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                min[i] = Math.min(min[i], count[i]);
            }
        }

        List<String> res = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            if (min[i] != Integer.MAX_VALUE && min[i] != 0) {
                while (min[i] > 0) {
                    String buffer = Character.toString((char)(i + 'a'));
                    res.add(buffer);
                    min[i]--;
                }
            }
        }

        System.out.println(res);
        return res;
    }
}
