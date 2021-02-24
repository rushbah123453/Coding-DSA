//https://mycode.prepbytes.com/problems/linked-list/MIDNODE
package dsa.linkedList;

import java.util.Scanner;

// To run. just enter
// 1. number of testcases
// 2. number of elements in linked list
// 3. elements of linked list
// eg.
// 1
// 2
// 10
// 11
public class FindMiddleNode {
    static Node head = null;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            int arraySize = scanner.nextInt();
            for (int j = 0; j < arraySize; j++) {
                insertAtEnd(scanner.nextInt());
            }
            findMiddleNode();
            head = null;
        }
    }

    private static void findMiddleNode() {
        Node slow_ptr = head;
        Node fast_ptr = head;

        while (fast_ptr != null && fast_ptr.next != null) {
            fast_ptr = fast_ptr.next.next;
            slow_ptr = slow_ptr.next;
        }
        System.out.println(slow_ptr.data);
    }

    public static void insertAtEnd(int data) {
        Node newNode = new Node(data);
        Node temp = head;
        if (temp == null) {
            head = newNode;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
