package dsa.stack;

import java.util.Scanner;
import java.util.Stack;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputSize = scanner.nextInt();
        String inputVaue = "";
        for (int i = 0; i < inputSize; i++) {
            inputVaue += scanner.next()+" ";
        }
        evaluatePostFix(inputVaue);


    }

    private static void evaluatePostFix(String inputVaue) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < inputVaue.length(); i++) {

            if (inputVaue.charAt(i) == ' ')
                continue;

            else if (Character.isDigit(inputVaue.charAt(i))) {
                StringBuilder stringBuilder = new StringBuilder();
                while (inputVaue.charAt(i) != ' ') {
                    stringBuilder.append(inputVaue.charAt(i));
                    i++;
                }
                stack.push(Integer.parseInt(stringBuilder.toString()));
            } else {
                int val1 = stack.pop();
                int val2 = stack.pop();
                switch (inputVaue.charAt(i)) {

                    case '+':
                        stack.push(val2 + val1);
                        break;
                    case '-':
                        stack.push(val2 - val1);
                        break;
                    case '/':
                        stack.push(val2 / val1);
                        break;
                    case '*':
                        stack.push(val2 * val1);
                        break;

                }
            }


        }
        System.out.println(stack.pop());

    }
}
