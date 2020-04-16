package dsa.stack.ImplementationOfStack;

public class StackLinkedList {

    Node head=null;


    public void push(int data){
        Node newNode=new Node(data);

        if (head==null){
          head=newNode;
        }else {
            newNode.next=head;
            head=newNode;
        }


    }

    public int pop(){
        if (head==null){
            System.out.println("Stack is Empty");
            return -1;
        }else {
            int data =head.data;
            System.out.println("Popped: "+data);
            head=head.next;
            return data;
        }


    }




}

class Node{

    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
        }
