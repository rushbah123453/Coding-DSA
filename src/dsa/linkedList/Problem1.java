//https://mycode.prepbytes.com/problems/linked-list/MIDNODE
package dsa.linkedList;

import java.util.Scanner;

public class Problem1 {
    static Node head=null;
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
            int arraySize = scanner.nextInt();
            int a[] = new int[arraySize];
            for (int j = 0; j < arraySize; j++) {
                insertAtEnd(scanner.nextInt());
            }


            int mid=arraySize/2;
            findMiddleNode(mid);
            head=null;
        }
    }

    private static void findMiddleNode(int mid) {
        Node temp=head;
        int count=0;
        while (temp!=null && count<mid){
            temp=temp.next;
            count++;
        }
        System.out.println(temp.data);
    }



    public static void insertAtEnd(int data) {
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

}

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
