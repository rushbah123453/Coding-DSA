package contest.leetcode.stack;

import java.util.Stack;
//https://leetcode.com/problems/implement-queue-using-stacks/
public class Problem232 {
}



//O(1) push , O(1) Pop Approach
class MyQueueOptimized {

    Stack<Integer> input = new Stack();
    Stack<Integer> output = new Stack();

    public void push(int x) {
        input.push(x);
    }

    public void pop() {
        peek();
        output.pop();
    }

    public int peek() {
        if (output.empty())
            while (!input.empty())
                output.push(input.pop());
        return output.peek();
    }

    public boolean empty() {
        return input.empty() && output.empty();
    }
}




//O(N) push , O(1) Pop Approach
class MyQueue {

    /** Initialize your data structure here. */
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    int front;
    public MyQueue() {
        stack1=new Stack<>();
        stack2=new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        if(stack1.isEmpty()){
            stack1.push(x);
            front=x;
        }else{
            while(!stack1.isEmpty() ){
                stack2.push(stack1.pop());
            }
            stack1.push(x);
            while(!stack2.isEmpty() ){
                stack1.push(stack2.pop());
            }
        }


    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int pop= stack1.pop();
        if(!stack1.isEmpty())
            front=stack1.peek();
        return pop;
    }

    /** Get the front element. */
    public int peek() {
        return front;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.isEmpty();
    }
}

