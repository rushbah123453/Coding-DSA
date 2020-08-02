package dsa.stack.problems;

import java.util.Stack;

public class NextGreaterToLeft {
    public static void main(String[] args) {
        int a[]={1,3,10,2,7,4,8};
        int res[]=getNextGreatestToLeft(a);
        for (int x:res){
            System.out.print(x+" ");
        }
    }

    private static int[] getNextGreatestToLeft(int[] a) {
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<a.length;i++){
            int currVal=a[i];
            while (!stack.isEmpty() && stack.peek()<a[i]){
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
