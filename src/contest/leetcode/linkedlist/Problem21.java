package contest.leetcode.linkedlist;
//https://leetcode.com/problems/merge-two-sorted-lists/
public class Problem21 {
    static ListNode head=null;

    public static void main(String[] args) {

    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        head=null;
        ListNode newList=new ListNode();
        while (l1!=null && l2!=null){
            if(l1.val<=l2.val){
                insertAtEnd(l1.val);
                l1=l1.next;
            }else{
                insertAtEnd(l2.val);
                l2=l2.next;
            }
        }

        while(l1!=null){
            insertAtEnd(l1.val);
            l1=l1.next;
        }

        while(l2!=null){
            insertAtEnd(l2.val);
            l2=l2.next;
        }

        return head;
    }
    public static void insertAtEnd(int data) {
        ListNode newNode = new ListNode(data);
        ListNode temp = head;
        if (temp == null) {
            head=newNode;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;


        }
    }
}
