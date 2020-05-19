package contest.leetcode.linkedlist;


//https://leetcode.com/problems/intersection-of-two-linked-lists/
public class Problem160 {

   static ListNode headA=null, headB=null;
    public static void main(String[] args) {

        Problem160 linkedlist = new Problem160();
        linkedlist.insertAtEnd(4,1);
        linkedlist.insertAtEnd(1,1);
        linkedlist.insertAtEnd(8,1);
        linkedlist.insertAtEnd(4,1);
        linkedlist.insertAtEnd(5,1);
        linkedlist.printList(headA);

        linkedlist.insertAtEnd(5,2);
        linkedlist.insertAtEnd(0,2);
        linkedlist.insertAtEnd(1,2);
        linkedlist.insertAtEnd(8,2);
        linkedlist.insertAtEnd(4,2);
        linkedlist.insertAtEnd(5,2);
        linkedlist.printList(headB);

      ListNode ans=  getIntersectionNode(headA,headB);

        linkedlist.printList(ans);
    }

    private static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a=headA, b=headB;
        while(a!=b){
            if(a==null) a=headB;
            else  a=a.next;
            if(b==null) b=headA;
            else b=b.next;
        }
        return a;
    }

    public void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val+"");
            temp = temp.next;
        }
        System.out.println("");
    }

    public void insertAtEnd(int data,int flag) {
        ListNode newListNode = new ListNode(data);
        ListNode temp;
        if (flag==1){
             temp = headA;
        }
        else{
             temp = headB;
        }

        if (temp == null && flag==1) {
            headA = newListNode;
        } else if (temp == null && flag==2){
            headB = newListNode;
        }
    else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newListNode;


        }
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(){}

    ListNode(int x) {
        val = x;
        next = null;
    }
}
