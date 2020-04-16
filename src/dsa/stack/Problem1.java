//https://mycode.prepbytes.com/problems/stacks/COMCODE
package dsa.stack;

import java.util.Scanner;
import java.util.Stack;

public class Problem1 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++){
            int input=scanner.nextInt();
            String inputString=scanner.next();
                checkClosingBracket(inputString);
        }
    }
    private static void checkClosingBracket(String inputString) {
        Stack<Character> stack=new Stack<>();
        int count=0;
        boolean flag=false;
        for (int i=0;i<inputString.length();i++){
            if (inputString.charAt(i)=='<'){
                stack.push('<');
            }else if (inputString.charAt(i)=='>'){
                if(stack.isEmpty()){
                    break;
                }
                else {
                    stack.pop();
                }
            }

            if(stack.isEmpty()){
                count=i+1;
            }
        }

            System.out.println(count);

    }
}
