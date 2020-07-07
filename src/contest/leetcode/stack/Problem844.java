package contest.leetcode.stack;

import java.util.Stack;

public class Problem844 {
    public boolean backspaceCompare(String S, String T) {
        return toString(S).equals(toString(T));
    }

    public String toString(String s){
        Stack<Character> stack=new Stack<>();
        for(Character c:s.toCharArray()){
            if( c!='#'){
                stack.push(c);
            }else if(!stack.isEmpty()){
                stack.pop();
            }
        }

        return String.valueOf(stack);
    }
}
