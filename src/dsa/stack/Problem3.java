//https://mycode.prepbytes.com/problems/stacks/MOMASS
package dsa.stack;

import java.util.Scanner;
import java.util.Stack;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moleculeFormula = scanner.next();
        calculateMass(moleculeFormula);
    }
    private static void calculateMass(String moleculeFormula) {
        char charAt;
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < moleculeFormula.length(); i++) {
            charAt = moleculeFormula.charAt(i);
            int eval = evaluate(moleculeFormula, i);
            switch (charAt) {
                case 'C':
                    stack.push(12 * eval);
                    break;
                case 'H':
                    stack.push(1 * eval);
                    break;
                case 'O':
                    stack.push(16 * eval);
                    break;
                case '(':
                    stack.push(0);
                    break;
                case ')':
                    int num = 0;
                    while (stack.peek() != 0)
                        num += stack.pop();
                    if (stack.peek() == 0)   //remove zero
                        stack.pop();
                    num *= evaluate(moleculeFormula, i);
                    stack.push(num);
                    break;
                default:
                    break;
            }
        }
        int output = 0;
        while (!stack.isEmpty())
            output += stack.pop();
        System.out.println(output);
    }
    private static int evaluate(String molecularFormula, int i) {
        if (i + 1 < molecularFormula.length() && Character.isDigit(molecularFormula.charAt(i + 1)))
            return Character.getNumericValue(molecularFormula.charAt(++i));
        else
            return 1;
    }
}
