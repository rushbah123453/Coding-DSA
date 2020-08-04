package dsa.stack.problems;

import java.util.Stack;

public class i_MinStackWithoutExtraSpace {
    Stack<Integer> stack;int min=Integer.MAX_VALUE;
    public i_MinStackWithoutExtraSpace() {
        stack = new Stack<>();
    }
    public static void main(String[] args) {
        i_MinStackWithoutExtraSpace stack=new i_MinStackWithoutExtraSpace();
        stack.push(13);
        stack.push(4);
        stack.push(45);
        stack.push(12);
        System.out.println(stack.min());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.min());
    }

    private int min() {
      return min==Integer.MAX_VALUE?-1:min;
    }

    private int pop() {
        if (stack.isEmpty())
            return -1;
        else
        {
            if (stack.peek()<min){

                return min*2-stack.pop();
            }else {
               return stack.pop();
            }
        }
    }

    private void push(int x) {
        if (stack.size()>=1 && min>=x){
           stack.push(2*x-min);
            min=x;
        }else {
            stack.push(x);
        }


    }
}
