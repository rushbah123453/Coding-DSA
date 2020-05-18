package contest.leetcode.strings.LC;

import java.util.Stack;

//https://leetcode.com/problems/valid-parentheses/
public class Problem20 {
    public static void main(String[] args) {
        String s = "()[]{([)}";
        System.out.println(isValid(s));
        //optimized
        //isValidSecondAproach


    }

    private static boolean isValid(String s) {
        if (s.length()<=0){
            return true;
        }

        Stack<Character> stack=new Stack<>();
        for (int i=0;i<s.length();i++){
            char input=s.charAt(i);
            if (input == '{' || input == '(' || input == '[') {
                stack.push(input);
            }else {
                if (!stack.isEmpty()){
                    switch (input)
                    {
                        case '}':
                            if (!stack.isEmpty()) {
                                if (stack.pop() == '{') {
                                    break;
                                }else {
                                    return false;
                                }
                            }
                        case ')':
                            if (!stack.isEmpty()) {
                                if (stack.pop() == '(') {
                                    break;
                                }else {
                                    return false;
                                }
                            }
                        case ']':
                            if (!stack.isEmpty()) {
                                if (stack.pop() == '[') {
                                    break;
                                }else {
                                    return false;
                                }
                            }
                    }
                }else {
                    return false;
                }
            }
        }
        if (!stack.isEmpty()){
           return false;
        }
        return true;

    }

    public boolean isValidSecondAproach(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}
