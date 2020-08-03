package dsa.stack.problems;

import java.util.Stack;

public class c_NextSmallerToRight {

    public static void main(String[] args) {
        int a[]={6,2,5,4,5,1,6};
        int ans[]=findNextSmallestElement(a);
        for (int x:ans){
            System.out.print(x+" ");
        }
    }

    private static int[] findNextSmallestElement(int[] a) {
        Stack<Integer> stack=new Stack<>();
        for (int i=a.length-1;i>=0;i--){
            int currVal=a[i];
            while (!stack.isEmpty() && stack.peek()>a[i]){
                stack.pop();
            }

            if (stack.isEmpty()){
                a[i]=-1;
            }else {
                a[i]=stack.peek();
            }
            stack.push(currVal);

        }

        return a;
    }
}
