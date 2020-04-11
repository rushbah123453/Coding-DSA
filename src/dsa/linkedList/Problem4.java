package dsa.linkedList;

import java.util.Scanner;

public class Problem4 {
    static Node4 head=null;
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
            int arraySize = scanner.nextInt();
            int a[] = new int[arraySize];
            for (int j = 0; j < arraySize; j++) {
                insertAtEnd(scanner.nextInt());
            }


            int x = scanner.nextInt();
            addElement(x);
            head=null;
        }
    }

    private static void addElement(int x) {
        Node4 temp=head;
        Node4 newNode=new Node4(x);

        while ( temp!=null) {

            if (temp.data<x && temp.next!=null && temp.next.data>x){

                newNode.next=temp.next;
                temp.next=newNode;
              break;

            }else {
                if (temp.data>=x && (temp.next==null || temp.next.data>=x)){
                    newNode.next=head;
                    head=newNode;
                    break;
                }else if (temp.data<x && temp.next==null){
                    temp.next=newNode;
                    break;
                }
              else   if (temp.next.next==null){
                    temp.next.next=newNode;
                    break;
                }else {
                    temp=temp.next;
                }

            }

        }
        printList();
    }



    public static void insertAtEnd(int data) {
        Node4 newNode4 = new Node4(data);
        Node4 temp = head;
        if (temp == null) {
            head=newNode4;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode4;
        }
    }

    public static void printList(){
        Node4 temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("");
    }


}

class Node4{
    int data;
    Node4 next;
    Node4(int data){
        this.data=data;
        this.next=null;
    }
}

