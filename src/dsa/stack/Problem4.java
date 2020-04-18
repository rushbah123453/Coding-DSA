package dsa.stack;

import java.util.Scanner;
import java.util.Stack;

public class Problem4 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String formula=scanner.next();
        evaluateRedundant(formula);
    }

    private static void evaluateRedundant(String formula) {
        Stack<Character> stack=new Stack<>();
        //((a+b))
        int count=0;
        for(int i=0;i<formula.length();i++){

            boolean flag=true;
            if (formula.charAt(i)==')'){
                char top=stack.peek();
                stack.pop();
                while (top!='('){
                    if (top=='+'||top=='-'||top=='/'||top=='*'){
                        flag=false;
                    }

                    top=stack.peek();
                    stack.pop();

                }
                if (flag){
                    count++;
                }

            }else {
                stack.push(formula.charAt(i));
            }

        }
        System.out.println(count);
    }
}
