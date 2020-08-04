package dsa.stack.problems;

import java.util.Stack;

public class h_MinStackWithExtraSpace {
    Stack<Integer> stack,minStack;
    public h_MinStackWithExtraSpace() {
        stack=new Stack<>();
        minStack=new Stack<>();
    }

    public static void main(String[] args) {
        h_MinStackWithExtraSpace stack=new h_MinStackWithExtraSpace();
        stack.push(13);
        stack.push(100);
        stack.push(45);
        stack.push(12);
        System.out.println(stack.min());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.min());

    }

    private int min() {
        if (minStack.isEmpty())
            return -1;
        else
          return   minStack.peek();
    }

    private int pop() {
        if (stack.isEmpty())
            return -1;
        else
        {
            int val=stack.pop();
            if (val==minStack.peek())
                minStack.pop();
            return val;
        }
    }

    private void push(int x) {
        stack.push(x);
        if (minStack.size()==0 || minStack.peek()>=x)
            minStack.push(x);
    }


}
