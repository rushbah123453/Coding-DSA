package dsa.linkedList.HardLevel;

import java.util.Scanner;

public class Problem11 {

    static Node11 head=null;
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
            int arraySize = scanner.nextInt();
            int k=scanner.nextInt();
            for (int j = 0; j < arraySize; j++) {

                insertAtEnd(scanner.nextInt());
            }

            //printList();
     // Node11 start= reverse(head,k);
          //  printList(start);
      rotate(k);
            printList();
            head=null;
        }


    }


    public static Node11 reverse(Node11 head, int k)
    {
        Node11 current = head;
        Node11 next = null;
        Node11 prev = null;

        int count = 0;

        /* Reverse first k nodes of linked list */
        while (count < k && current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        } 

        if (next != null)
            head.next =  reverse(next,k);


        return prev;
    }



    static void rotate( int N)
    {
        if (N == 0)
            return;

       
        Node11 current = head;

        // current will either point to Nth
        // or NULL after this loop. Current
        // will point to node 'b' in the
        // above example
        int count = 1;
        while (count < N && current != null)
        {
            current = current.next;
            count++;
        }

        // If current is NULL, N is greater
        // than or equal to count of nodes
        // in linked list. Don't change the
        // list in this case
        if (current == null)
            return;

        // current points to Nth node. Store
        // it in a variable. NthNode11 points to
        // node 'b' in the above example
        Node11 NthNode11 = current;

        // current will point to last node
        // after this loop current will point
        // to node 'e' in the above example
        while (current.next != null)
            current = current.next;

        // Change next of last node to previous
        // head. Next of 'e' is now changed to
        // node 'a'
        current.next = head;

        // Change prev of Head node to current
        // Prev of 'a' is now changed to node 'e'
        (head).prev = current;

        // Change head to (N+1)th node
        // head is now changed to node 'c'
        head = NthNode11.next;

        // Change prev of New Head node to NULL
        // Because Prev of Head Node11 in Doubly
        // linked list is NULL
        (head).prev = null;

        // change next of Nth node to NULL
        // next of 'b' is now NULL
        NthNode11.next = null;
    }


    private static void insertAtEnd(int data) {
        Node11 temp=head;
        Node11 newNode11 = new Node11(data);
        if (temp==null){
            head=newNode11;
        }else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode11;
        }


    }



    public static void printList(){
        Node11 temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("");
    }

}
class Node11{

    int data;
    Node11 next;
    Node11 prev;

    Node11(int data){
        this.data=data;
        this.next=null;
    }

}