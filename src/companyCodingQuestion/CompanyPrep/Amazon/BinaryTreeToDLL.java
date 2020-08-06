package companyCodingQuestion.CompanyPrep.Amazon;
//https://www.geeksforgeeks.org/convert-given-binary-tree-doubly-linked-list-set-3/
public class BinaryTreeToDLL
{

    Node head,prev;
    Node bToDLL(Node root)
    {

        if(root==null)
            return null;

        bToDLL(root.left);
        if(prev==null){
            head=root;
        }else{
            root.left=prev;
            prev.right=root;
        }
        prev=root;
        bToDLL(root.right);

        return head;
    }
}


class Node
{
	Node left, right;
	int data;

	Node(int d)
	{
		data = d;
		left = right = null;
	}

}