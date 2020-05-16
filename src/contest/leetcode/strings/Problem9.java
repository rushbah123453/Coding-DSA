package contest.leetcode.strings;

import java.util.Stack;

//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
public class Problem9 {
    public static void main(String[] args) {
        String s="abbaccd";
        System.out.println(removeDuplicates(s));

    }

    private static String removeDuplicates(String s) {

        Stack<Character> stack=new Stack<>();
        for (int i=0;i<s.length();i++){
            if (!stack.isEmpty()){
                Character check=stack.peek();
                if (check==s.charAt(i)){
                    stack.pop();
                }else {
                    stack.push(s.charAt(i));
                }
            }else {
                stack.push(s.charAt(i));
            }
        }
        StringBuilder stringBuilder=new StringBuilder();
        for (Character characters:stack){
          //  System.out.println(characters);
            stringBuilder.append(characters);
        }

        return stringBuilder.toString();
    }
}
