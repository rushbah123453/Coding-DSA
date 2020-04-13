package dsa.linkedList;

import java.util.Scanner;

public class Problem8 {

    static Node8 head=null;
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
            int arraySize = scanner.nextInt();
            StringBuilder stringBuilder=new StringBuilder();
            for (int j = 0; j < arraySize; j++) {
                stringBuilder.append(scanner.next());
                insertAtEnd(stringBuilder.charAt(j));
            }

            //printList();
        segregateVowels();
            printList();
            head=null;
        }


    }

    private static void segregateVowels() {

        Node8 latestVowel=null;
        Node8 current=head;
        Node8 newHead=head;

        if (head==null)
            return;
        if (isVowel(head.data)){
            latestVowel=head;
        }else {


            while ( current.next!=null && !isVowel(current.next.data)){
                    current=current.next;

            }

            if (current.next==null)
                return ;


            latestVowel=newHead=current.next;
            current.next=current.next.next;
            latestVowel.next=head;






        }

        while (current != null && current.next != null)
        {
            if (isVowel(current.next.data))
            {
                // The next discovered item is a vowel
                if (current == latestVowel)
                {

                    latestVowel = current = current.next;
                }
                else
                {
                    Node8 temp = latestVowel.next;

                    latestVowel.next = current.next;


                    latestVowel = latestVowel.next;


                    current.next = current.next.next;


                    latestVowel.next = temp;
                }
            }
            else
            {
                current = current.next;
            }


        }




    head=newHead;
    }


    private static boolean isVowel(char x){
        return (x=='a'||x=='e'||x=='i'||x=='o'||x=='u');
    }

    private static void insertAtEnd(char data) {
        Node8 temp=head;
        Node8 newNode = new Node8(data);
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
        Node8 temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("");
    }

}
class Node8{

    char data;
    Node8 next;

    Node8(char data){
        this.data=data;
        this.next=null;
    }

}