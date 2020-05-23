package contest.leetcode.linkedlist;
//https://leetcode.com/problems/add-two-numbers/solution/
public class Problem2 {


    public static void main(String[] args) {

    }

    public ListNode optimizedaddTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry=0;
        ListNode sum=new ListNode(-1);
        ListNode sumHead=sum;
        while(l1!=null && l2!=null){
            if(l1.val+l2.val+carry>=10){
                ListNode curr=new ListNode((l1.val+l2.val+carry)%10);
                sum.next=curr;
                sum=curr;
                carry=1;
            }  else{
                ListNode curr=new ListNode(l1.val+l2.val+carry);
                sum.next=curr;
                sum=curr;
                if(carry==1)
                    carry=0;
            }
            l1=l1.next;
            l2=l2.next;

        }

        while(l1!=null || l2!=null){
            ListNode copy=null;
            if(l1!=null){
                copy=l1;
            }else{
                copy=l2;
            }

            if(copy.val+carry>=10){
                ListNode curr=new ListNode((copy.val+carry)%10);
                sum.next=curr;
                sum=curr;
                carry=1;
            } else{
                ListNode curr=new ListNode(copy.val+carry);
                sum.next=curr;
                sum=curr;
                if(carry==1)
                    carry=0;
            }

            if(l1!=null){
                l1=l1.next;
            }else{
                l2=l2.next;
            }
        }

        if(carry==1){
            ListNode curr=new ListNode(1);
            sum.next=curr;
            sum=curr;
        }



        return sumHead.next;

    }
}
