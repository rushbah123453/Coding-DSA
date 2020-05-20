package contest.leetcode.linkedlist;
//https://leetcode.com/problems/reverse-linked-list/
public class Problem206 {

    public static void main(String[] args) {

    }
    public ListNode reverseList(ListNode head) {
        ListNode a=head,b=head;
        ListNode prev=null;

        while(b!=null){
            b=a.next;
            a.next=prev;
            prev=a;
            a=b;
        }
        head=prev;
        return head;


    }
}
