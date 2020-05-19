package contest.leetcode.linkedlist;
//https://leetcode.com/problems/remove-linked-list-elements/
public class Problem203 {

    public ListNode removeElements(ListNode head, int val) {
        ListNode temp=head,safe=head;


        if(temp==null){
            return null;
        }
        while(temp!=null && temp.val==val){
            temp=temp.next;
            head=temp;
        }


        while(temp!=null && temp.next!=null){
            //System.out.println(temp.val + "^" + temp.next.val);
            if(temp.next.val==val){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
        return head;
    }

}
