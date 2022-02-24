package dsa.linkedList;

import java.util.Scanner;

public class AddElementInASortedLinkedList {
    static Node4 head = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            int arraySize = scanner.nextInt();
            for (int j = 0; j < arraySize; j++) {
                insertAtEnd(scanner.nextInt());
            }
            int x = scanner.nextInt();
            addElement(x);
            head = null;
        }
    }

    private static void addElement(int x) {
        Node4 temp = head;
        Node4 newNode = new Node4(x);

        // this if condition for edge case, when the no. of elements is either 0 or 1
        if(head == null || head.data > x) {
            newNode.next = head;
            head = newNode;
        } else {

            // here we are checking if the next value i.e. temp.next.data and not temp.data is less than new value
            // because we want to be at the element whose next value should be this new value to be inserted.
            // Because this is a singly linked list you cannot go back but only forward
            while (temp.next != null && temp.next.data < x) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        printList();
    }

    public static void insertAtEnd(int data) {
        Node4 newNode4 = new Node4(data);
        Node4 temp = head;
        if (temp == null) {
            head = newNode4;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode4;
        }
    }

    public static void printList() {
        Node4 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("");
    }
}

class Node4 {
    int data;
    Node4 next;

    Node4(int data) {
        this.data = data;
        this.next = null;
    }
}
