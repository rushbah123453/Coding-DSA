package contest.leetcode.linkedlist;
//https://leetcode.com/problems/linked-list-cycle/

import java.util.HashSet;
import java.util.Set;

public class Problem141 {


    public boolean SecondApproachhasCycle(ListNode head) {
        Set<ListNode> seen=new HashSet<>();
        while(head!=null){
            if(!seen.contains(head)){
                seen.add(head);
                head=head.next;
            }else{
                return true;
            }
        }
        return false;
    }

    //floyd totorise algo
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
