package dsa.linkedList;


import java.util.Scanner;

public class MoveLastElementToFront {

    static Node2 head = null;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            int arraySize = scanner.nextInt();
            for (int j = 0; j < arraySize; j++) {
                insertAtEnd(scanner.nextInt());
            }
            moveLastToFront();
            head = null;
        }
    }

    // last element will be moved to first place
    // eg. 1 -> 2 -> 3 -> 4 will become 4 -> 1 -> 2 -> 3
    private static void moveLastToFront() {
        Node2 temp = head;
        //this check -> temp.next != null is for when the size of ll is less than or equal to 2
        while (temp.next != null && temp.next.next != null) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next.next = head;
            head = temp.next;
            temp.next = null;
        } else {
            printList();
            return;
        }
        printList();
    }


    public static void insertAtEnd(int data) {
        Node2 newNode2 = new Node2(data);
        Node2 temp = head;
        if (temp == null) {
            head = newNode2;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode2;
        }
    }

    public static void printList() {
        Node2 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("");
    }


}

class Node2 {
    int data;
    Node2 next;

    Node2(int data) {
        this.data = data;
        this.next = null;
    }
}

