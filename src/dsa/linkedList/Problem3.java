package dsa.linkedList;

import java.util.Scanner;

public class Problem3 {
    static Node3 head=null;
    public static void main(String[] args) {

    Scanner scanner=new Scanner(System.in);
    int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
        int arraySize = scanner.nextInt();
        int a[] = new int[arraySize];
        for (int j = 0; j < arraySize; j++) {
            insertAtEnd(scanner.nextInt());
        }



        removeDuplicate();
        head=null;
    }
}

    private static void removeDuplicate() {
        Node3 temp=head;
        while (temp.next!=null && temp!=null) {

            if (temp.data<temp.next.data){
                temp=temp.next;
            }else {
                temp.next=temp.next.next;
            }

        }
        printList();
    }



    public static void insertAtEnd(int data) {
        Node3 newNode3 = new Node3(data);
        Node3 temp = head;
        if (temp == null) {
            head=newNode3;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode3;


        }
    }

    public static void printList(){
        Node3 temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("");
    }


}

class Node3{
    int data;
    Node3 next;
    Node3(int data){
        this.data=data;
        this.next=null;
    }
}
