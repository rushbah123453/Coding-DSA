package companyCodingQuestion.CompanyPrep.Amazon;
//https://practice.geeksforgeeks.org/problems/absolute-list-sorting/1
public class LinkedListSortedInAbsoluteFashion {

        LNode sortedList(LNode head)
        {
            LNode prev=head;
            LNode curr=prev.next;

            while(curr!=null){
                if(prev.data>curr.data){
                    prev.next=prev.next.next;
                    curr.next=head;
                    head=curr;
                    curr=prev.next;
                }else{
                    curr=curr.next;
                    prev=prev.next;
                }
            }

            return head;
        }

}
class LNode
{
    int data;
    LNode next;
    LNode(int d) {data = d; next = null; }
}