package contest.leetcode.linkedlist;
//https://leetcode.com/problems/odd-even-linked-list/
public class Problem328 {
    public static void main(String[] args) {

    }

    public ListNode oddEvenList(ListNode head) {
        ListNode even=head,odd=head,oddHead=head;
        if(head==null){
            return null;
        }else if(head.next==null){
            return head;
        }

        if(head.next!=null){
            odd=head.next;
            oddHead=odd;
        }

        while(odd.next!=null && even.next.next!=null){
            even.next=even.next.next;
            odd.next=odd.next.next;
            even=even.next;
            if(odd.next!=null){
                odd=odd.next;
            }

        }
        even.next=oddHead;

        return head;
    }
}
