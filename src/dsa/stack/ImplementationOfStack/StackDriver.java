package dsa.stack.ImplementationOfStack;

public class StackDriver {


    public static void main(String[] args) {
        System.out.println("----Array Stack Implementation----");
        StackArray stackArray=new StackArray();
        stackArray.push(1);
        stackArray.push(2);
        stackArray.push(3);
        stackArray.pop();
        stackArray.pop();
        stackArray.pop();
        stackArray.pop();

        System.out.println("----LinkedList Stack Implementation----");
        StackLinkedList stackLinkedList=new StackLinkedList();
        stackLinkedList.push(1);
        stackLinkedList.push(2);
        stackLinkedList.push(3);
        stackLinkedList.push(4);
        stackLinkedList.pop();
        stackLinkedList.pop();
        stackLinkedList.pop();
        stackLinkedList.pop();
        stackLinkedList.pop();

    }
}
