package dsa.stack.problems;

//input:  11 13  21  3
//output: 13 21  -1 -1

import java.util.Stack;

public class b_NextGreaterToRight {


    public static void main(String[] args) {

        int a[]={11,13,21,0,3,4,45,5};
      //  int res[]=getNextGreatestElement(a);
        int res[]=f(a);
        for (int x:res){
            System.out.print(x+" ");
        }
    }

    private static int[] getNextGreatestElement(int[] a) {
        Stack<Integer> stack=new Stack<>();
        Stack<Integer> ans=new Stack<>();
        for (int i=a.length-1;i>=0;i--){

            while (!stack.isEmpty() && stack.peek()<a[i]){
                stack.pop();
            }

            if (stack.isEmpty()){
                ans.push(-1);
            }else {
                ans.push(stack.peek());
            }

            stack.push(a[i]);

        }

      for(int i=0;!ans.isEmpty();i++){
          a[i]=ans.pop();
      }

      return a;
    }

    private static int[] f(int[] a){
        // 11, 13, 21, 0, 3, 4, 45, 5
       //  13  21  45  3  4 45 -1 -1

        int n=a.length;
        Stack<Integer> stack=new Stack();
        for (int i=n-1;i>=0;i--){
            int curr=a[i];
            while (!stack.isEmpty() && stack.peek()<a[i])
                stack.pop();
            if (stack.isEmpty())
                a[i]=-1;
            else
                a[i]=stack.peek();
            stack.push(curr);
        }
        return a;
    }
}
