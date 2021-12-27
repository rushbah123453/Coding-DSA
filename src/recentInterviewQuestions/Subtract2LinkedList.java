package recentInterviewQuestions;


// Assuming linked list 1 is greater than linked list 2.
// If that is not the case then extra code will need to be added to find out which one is greater.
// Strategy. Reverse both the LL. Subtract and reverse the result to get the answer.
public class Subtract2LinkedList {
    static class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        int[] list1 = { 1, 0, 3 };
        int[] list2 = { 1, 0, 1 };
        Node l1Head = new Node(0);
        Node l2Head = new Node(0);
        Node l1 = l1Head;
        Node l2 = l2Head;
        for(int num : list1) {
            l1.next = new Node(num);
            l1 = l1.next;
        }
        for(int num : list2) {
            l2.next = new Node(num);
            l2 = l2.next;
        }
        Node result = subtract(l1Head.next, l2Head.next);
        printLL(result);
    }

    //assuming l1 is always greater than l2
    public static Node subtract(Node l1, Node l2) {
        if(l2 == null) return l1;
        l1 = reverseLL(l1);
        l2 = reverseLL(l2);
        Node resultHead = new Node(0);
        Node result = resultHead;
        int borrow = 0;
        while(l1 != null) {
            // l2 can be null, since l2 is small, so a check is needed
            int diff = l1.value - (l2 != null ? l2.value : 0) - borrow;
            if(diff < 0) {
                borrow = 1;
                diff += 10;
            } else {
                borrow = 0;
            }
            result.next = new Node(diff);
            result = result.next;
            l1 = l1.next;
            l2 = l2 != null ? l2.next : null;
        }
        result = resultHead.next;
        result = reverseLL(result);

        // to remove initial zeros
        while(result.value == 0) {
            result = result.next;
        }
        return result;
    }

    public static Node reverseLL(Node node) {
        Node current = node;
        Node prev = null;
        Node next = null;
        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void printLL(Node node) {
        System.out.println("Linked list:");
        while(node != null) {
            System.out.print(node.value);
            if(node.next != null) System.out.print(" -> ");
            node = node.next;
        }
        System.out.println();
    }
}
