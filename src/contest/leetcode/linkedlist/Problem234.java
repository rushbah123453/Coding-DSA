package contest.leetcode.linkedlist;

public class Problem234 {


    public static void main(String[] args) {

    }

    public boolean isPalindrome(ListNode head) {

        if(head==null || head.next==null)
            return true;

        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=null;
        ListNode curr=slow.next,Next=slow.next;
        while(Next!=null){
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        slow.next=prev;
        ListNode  mid=slow.next;
        System.out.println(slow.next.val);
        while(mid!=null){
            if(head.val!=mid.val){
                return false;
            }else{
                System.out.print(head.val);
                System.out.print(mid.val);
                head=head.next;
                mid=mid.next;
            }
        }

        return true;

    }
}
