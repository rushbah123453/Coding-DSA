package companyCodingQuestion.CompanyPrep.Amazon;

public class NthNodeFromLastLinkedlist {

    public static void main(String[] args) {

    }
    int getNthFromLast(Nodes head, int n)
    {
        if(head==null) return -1;
        Nodes slow=head,fast=head;
        int count=1;
        while(fast!=null && count!=n){
            fast=fast.next;
            count++;
        }

        if(fast==null) return -1;

        while(fast!=null && fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }

        return slow.data;
    }
}

class Nodes
{
    int data;
    Nodes next;
    Nodes(int d) {data = d; next = null; }
}


