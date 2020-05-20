package contest.leetcode.linkedlist;
//https://leetcode.com/problems/middle-of-the-linked-list/
public class Problem876 {

    public static void main(String[] args) {

    }

    public ListNode middleNode(ListNode head) {
        ListNode slowPointer=head;
        ListNode fastPointer=head;

        while(fastPointer!=null && fastPointer.next!=null){
            slowPointer=slowPointer.next;
            fastPointer=fastPointer.next.next;
        }

        return slowPointer;
    }
}
