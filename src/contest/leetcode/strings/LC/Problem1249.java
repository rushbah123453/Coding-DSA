package contest.leetcode.strings.LC;

import java.util.Stack;

//https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/
public class Problem1249 {
    //use this
    public String optimizedminRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < sb.length(); ++i) {
            if (sb.charAt(i) == '(') st.add(i);
            if (sb.charAt(i) == ')') {
                if (!st.empty()) st.pop();
                else sb.setCharAt(i, '*');
            }
        }
        while (!st.empty())
            sb.setCharAt(st.pop(), '*');
        return sb.toString().replaceAll("\\*", "");
    }


    public String minRemoveToMakeValid(String s) {




        int openBracket=0;
        int closeBracket=0;
        StringBuilder builder = new StringBuilder(s);

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                openBracket++;
            }else if(s.charAt(i)==')'){

                if(openBracket>0){
                    openBracket--;
                }else{

                    builder.deleteCharAt(i-(s.length()-builder.length()));
                }
            }
        }


        s=builder.toString();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==')'){
                closeBracket++;
            }else if(s.charAt(i)=='('){
                if(closeBracket>0){
                    closeBracket--;
                }else{
                    builder.deleteCharAt(i);
                }
            }
        }

        return builder.toString();

    }



}
