package contest.leetcode.strings;

import java.util.ArrayList;
import java.util.List;

public class Problem3 {
    public static void main(String[] args) {
        System.out.println(reformat("s"));
    }

    private static String reformat(String s) {
        s="a0b1c2";


        List<Character> digits = new ArrayList<>();
        List<Character> characters = new ArrayList<>();

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                digits.add(ch);
            } else  {
                characters.add(ch);
            }
        }


        if(Math.abs(digits.size() - characters.size()) >= 2) return "";

        StringBuilder result = new StringBuilder();

        boolean digitOrChar = (digits.size() >= characters.size()) ? true : false;
        for (int i = 0; i < s.length(); i++) {
            if (digitOrChar) {
                if (digits.size() > 0) {
                    result.append(digits.remove(0));
                }
            } else {
                if (characters.size() > 0) {
                    result.append(characters.remove(0));
                }
            }
            digitOrChar = !digitOrChar;
        }
        return result.toString();




    }
}
