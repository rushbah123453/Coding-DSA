package dsa.linkedList.SingleLinkList;

public class Main {

    public static void main(String[] args) {

        LinkedList linkedList=new LinkedList();
        linkedList.insertAtBegining(1);
        linkedList.insertAtBegining(2);
        linkedList.insertAtEnd(3);
        linkedList.insertAtEnd(5);
        linkedList.insertInMiddle(3,4);
        linkedList.delete(2);
        linkedList.delete(4);
        linkedList.printList();
    }
}
