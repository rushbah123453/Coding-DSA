package algorithms.fundamentalAlgosImplementation.ReverseLinkedList;

public class ReverseLLRecursive {
    public static Node head;
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    public static void printLL(Node head) {
        Node dummy = head;
        while(dummy != null) {
            System.out.print(dummy.data + "->");
            dummy = dummy.next;
        }
        System.out.println("null");
        System.out.println();
    }
    //1->2->3->4->null
    public static void reverseLL(Node curr) {
        if(curr == null) return;
        if(curr.next == null) {
            head = curr;
            return;
        }
        reverseLL(curr.next);
        curr.next.next = curr;
        curr.next = null;
    }
    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        reverseLL(node);
        printLL(head);
    }
}
