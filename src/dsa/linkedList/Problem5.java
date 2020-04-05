package dsa.linkedList;



import java.util.Scanner;

public class Problem5 {

    static Node5 head=null;
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
            int arraySize = scanner.nextInt();
            int a[] = new int[arraySize];
            for (int j = 0; j < arraySize; j++) {
              insertAtBegining (scanner.nextInt());
            }


            printList();
            head=null;
        }
    }



    public static void insertAtBegining(int data){
        Node5 newNode=new Node5(data);
        newNode.next=head;
        head=newNode;
    }




    public static void printList(){
        Node5 temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("");
    }


}

class Node5{
    int data;
    Node5 next;
    Node5(int data){
        this.data=data;
        this.next=null;
    }
}
