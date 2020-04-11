//https://mycode.prepbytes.com/problems/linked-list/PALNDRM
package dsa.linkedList;

import java.util.Scanner;
import java.util.Stack;

public class Problem6 {
static Node6 head=null;

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
            int arraySize = scanner.nextInt();
            for (int j = 0; j < arraySize; j++) {
                insertAtEnd(scanner.nextInt());
            }

           // printList();
           System.out.println( isPalindrome());
            head=null;
        }
    }

    private static boolean isPalindrome() {

        Node6 temp=head;
        Stack<Integer> stack=new Stack<>();
        boolean flag=true;

        while (temp!=null){
            stack.push(temp.data);
            temp=temp.next;
        }


        while (head!=null ){

            int stackData=stack.pop();
            if (head.data==stackData){
                head=head.next;
            }
            else {
                flag=false;
                break;
            }


        }

        return flag;


    }

    private static void insertAtEnd(int nextInt) {
        Node6 temp=head;
        Node6 newNode = new Node6(nextInt);
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
        Node6 temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("");
    }
}


class Node6{

    int data;
    Node6 next;

    Node6(int data){
        this.data=data;
        this.next=null;
    }

}