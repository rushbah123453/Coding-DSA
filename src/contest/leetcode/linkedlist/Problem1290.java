package contest.leetcode.linkedlist;
//https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
public class Problem1290 {
    public static void main(String[] args) {

    }

    public int getDecimalValue(ListNode head) {
        ListNode temp=head;
        int res=0;
        while(temp!=null){
            res=(2*(res))+temp.val;
            temp=temp.next;
        }
        return res;
    }
}
