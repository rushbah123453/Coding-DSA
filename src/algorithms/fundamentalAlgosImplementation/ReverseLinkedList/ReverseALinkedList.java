package algorithms.fundamentalAlgosImplementation.ReverseLinkedList;

public class ReverseALinkedList {
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    // 1-> 2 -> 3-> null
    public static Node reverseLL(Node head) {
        Node current = head;
        Node previous = null;
        Node next = null;
        while(current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
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

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        printLL(head);
        Node reverseHead = reverseLL(head);
        printLL(reverseHead);
    }
}
