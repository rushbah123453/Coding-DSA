package dsa.linkedList.SingleLinkList;

public class LinkedList {
    Node head=null;



    public void insertAtBegining(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }


    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        Node temp = head;
        if (temp == null) {
            head=newNode;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;


        }
    }

    public void insertInMiddle(int num, int data) {
        Node temp=head;
        Node newNode=new Node(data);
        while (temp!=null && temp.data!=num){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }



    public void printList(){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public void delete(int data) {
        Node current=head;
        Node previous=null;
        while (current!=null && current.data!=data){
            previous=current;
            current=current.next;
        }

        if (current==head){
            if (head==null){
                System.out.print("List is empty");
                return;
            }else {
                head=head.next;
                return;
            }
        }

        previous.next=current.next;


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
