package dsa.stack.ImplementationOfStack;

public class StackArray {

    int top=-1;
    int max=1000;
    int stack[]=new int[max];


    public boolean push(int data){

        if (isFull()){
           return false;
       }
        stack[++top]=data;
        return true;

    }


    public int pop(){
        if (isEmpty()){
            return -1;
        }
        System.out.println("Popped: "+stack[top]);
       return stack[top--];
    }

    private boolean isFull(){
        if (top==(max-1)){
            System.out.println("Stack is Full");
            return true;
        }
        return false;
    }

    private boolean isEmpty(){

        if (top==-1){
            System.out.println("Stack is Empty");
            return true;
        }
        return false;
    }



}
