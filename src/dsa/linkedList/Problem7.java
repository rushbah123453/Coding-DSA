package dsa.linkedList;

import java.util.Scanner;

public class Problem7 {


    static Node7 head=null;

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
            String  input = scanner.next();
            int[] a = new int[input.length()];
            for (int k = 0; k < input.length(); k++)
            {
                a[k] = input.charAt(k) - '0';
            }

            for (int j = 0; j < input.length(); j++) {
                insertAtEnd(a[j]);
            }

            addNumber();
            printList();

            head=null;
        }
    }

    private static void addNumber() {
        Node7 current=head;
        Node7 previous=null;



        while (current.next!=null){
            if (current.data!=9){
                previous=current;
            }
            current=current.next;
        }

        if (current.data!=9){
            current.data++;
            return;
        }

        if (previous==null){
            previous=new Node7(0);
            previous.next=head;
            head=previous;
        }


        previous.data++;
        previous=previous.next;

        while (previous!=null){
            previous.data=0;
            previous=previous.next;
        }



    }

    private static void insertAtEnd(int nextInt) {
        Node7 temp=head;
        Node7 newNode = new Node7(nextInt);
        if (temp==null){
            head=newNode;
        }else {
            while (temp.next != null) {
                temp = temp.next;
            }



            temp.next = newNode;
        }


    }



    public static void printList(){
        Node7 temp=head;
        while (temp!=null){
            System.out.print(temp.data+"");
            temp=temp.next;
        }
        System.out.println("");
    }


}

class Node7{
    int data;
    Node7 next;
    Node7(int data){
        this.data=data;
    }
}
