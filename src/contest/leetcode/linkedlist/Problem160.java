package contest.leetcode.linkedlist;


import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/intersection-of-two-linked-lists/
public class Problem160 {

   static ListNode headA=null, headB=null;
    public static void main(String[] args) {


    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set=new HashSet<>();

        while(headA!=null){
            set.add(headA);
            headA=headA.next;
        }

        while(headB!=null){
            if(set.contains(headB)){
                return headB;
            }
            headB=headB.next;
        }

        return null;
    }

    public ListNode secondApproachgetIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a=headA, b=headB;
        while(a!=b){
            if(a==null) a=headB;
            else  a=a.next;
            if(b==null) b=headA;
            else b=b.next;
        }
        return a;
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
