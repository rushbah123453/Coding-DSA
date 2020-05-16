package contest.leetcode.stack;

import java.util.Stack;

//https://leetcode.com/problems/baseball-game/
public class Problem2 {
    public static void main(String[] args) {
        String ops[] = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        System.out.println(calPoints(ops));
    }

    private static int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < ops.length; i++) {
            int res = isDigit(ops[i]);
            if (res != Integer.MIN_VALUE) {
                stack.push(res);
            } else {
                switch (ops[i]) {
                    case "C":
                        if (!stack.isEmpty()) {
                            stack.pop();
                        }
                        break;
                    case "D":
                        if (!stack.isEmpty()) {
                            stack.push(stack.peek() * 2);
                        }
                        break;
                    case "+":
                        if (!stack.isEmpty()) {
                            int num1 = stack.pop();
                            int num2 = stack.pop();
                            stack.push(num2);
                            stack.push(num1);
                            stack.push(num1 + num2);
                        }
                        break;
                }
            }
            // System.out.println(res);
        }
        int sum = 0;
        for (Integer x : stack) {
            sum += x;
        }
        return sum;
    }

    private static int isDigit(String op) {

        try {
            return Integer.parseInt(op);
        } catch (Exception e) {
            return Integer.MIN_VALUE;
        }


    }


}
