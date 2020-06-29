package contest.leetcode.strings.LC;



import java.util.*;

//https://leetcode.com/problems/next-greater-node-in-linked-list/
public class Problem1019 {


    public int[] nextLargerNodes(ListNode head) {

        ListNode temp=head;
        int count=0;
        List<Integer> list=new ArrayList<>();
        Stack<ListNode> stack=new Stack<>();
        Map<ListNode,Integer> map=new HashMap<>();
        while(temp!=null){
            while(!stack.isEmpty() && stack.peek().val<temp.val){
                map.put(stack.pop(),temp.val);
            }
            stack.push(temp);
            temp=temp.next;
            count++;
        }


        int[] arr = new int[count];
        int index=0;
        while(head!=null){
            if(map.containsKey(head)){
                arr[index++]=map.get(head);
            }else{
                arr[index++]=0;
            }
            head=head.next;
        }



        return arr;
    }
}

 //* Definition for singly-linked list.
   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
