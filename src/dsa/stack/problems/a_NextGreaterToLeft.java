package dsa.stack.problems;

import java.util.Stack;

public class a_NextGreaterToLeft {
    public static void main(String[] args) {
        int a[]={1,3,10,2,7,4,8};
      //  int res[]=getNextGreatestToLeft(a);
        int res[]=f(a);
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

    private static int[] f(int[] a){
       //  1 ,3 ,10 ,2 ,7 ,4 ,8
       // -1 -1  -1 10 10  7  10
        int n=a.length;
        //int res[]=new int[n];
        Stack<Integer> stack=new Stack<>();
        for (int i=0;i<n;i++){
            int curr=a[i];
            while(!stack.isEmpty() && stack.peek()<a[i]){
                stack.pop();
            }
            if (stack.isEmpty())
                a[i]=-1;
            else
                a[i]=stack.peek();
            stack.push(curr);
        }
        return a;
    }
}
