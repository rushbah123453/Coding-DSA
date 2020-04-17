package dsa.stack;

import java.util.Scanner;
import java.util.Stack;

public class Problem2 {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String inputString=scanner.next();
        simplifyDirectory(inputString);
    }

    private static void simplifyDirectory(String inputString) {

        Stack<String> stack=new Stack<>();
        StringBuilder stringParser=new StringBuilder();

        for (int i=0;i<inputString.length();i++){

            stringParser.delete(0,stringParser.length());

            while (i<inputString.length() && inputString.charAt(i)=='/')
                i++;
            while (i<inputString.length() && inputString.charAt(i)!='/')
            {
                stringParser.append(inputString.charAt(i));
                i++;
            }
            if (stringParser.toString().equals("..")){
                if (!stack.isEmpty())
                stack.pop();
            }
            else  if (stringParser.toString().equals(".")){
                continue;
            }
          else if(stringParser.length()!=0){
                stack.push(stringParser.toString());
            }
        }
        Stack<String> output=new Stack<>();
        while (!stack.isEmpty()){
            output.push(stack.pop());
        }
        StringBuilder result=new StringBuilder("/");
        while (!output.isEmpty()){
            if (output.size()==1){
                result.append(output.pop());
            }else{
                result.append(output.pop()).append("/");
            }
        }


System.out.println(result);


    }

}
