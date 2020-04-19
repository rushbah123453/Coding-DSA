package dsa.stack;

import java.util.Scanner;
import java.util.Stack;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCaeses = scanner.nextInt();
        for (int i = 0; i < testCaeses; i++) {
            String inputString = scanner.next();
            infixToPostfix(inputString);
        }
    }

    private static void infixToPostfix(String inputString) {

        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder("");

        for (int i = 0; i < inputString.length(); i++) {

            if (Character.isLetterOrDigit(inputString.charAt(i)))
                result.append(inputString.charAt(i));

            else if (inputString.charAt(i) == '(')
                stack.push(inputString.charAt(i));

            else if (inputString.charAt(i) == ')') {

                while (!stack.isEmpty() && stack.peek()!='(')
                    result.append(stack.pop());

                stack.pop();//remove (
            }
            else {
                while (!stack.isEmpty() && isPrecedenceHigh(inputString.charAt(i))<=isPrecedenceHigh(stack.peek())){
                    result.append(stack.pop());
                }
                stack.push(inputString.charAt(i));
            }


        }


        while (!stack.isEmpty()){
            result.append(stack.pop());
        }
        System.out.println(result);
    }


    private static int isPrecedenceHigh(Character operator) {
        switch (operator) {
            case '+':return 1;
            case '-':
                return 2;
            case '*': return 3;
            case '/':
                return 4;
            case '^':
                return 5;
        }
        return -1;
    }
}
