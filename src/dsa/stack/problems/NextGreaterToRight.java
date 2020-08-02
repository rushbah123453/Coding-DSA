package dsa.stack.problems;

//input:  11 13  21  3
//output: 13 21  -1 -1

import java.util.Stack;

public class NextGreaterToRight {


    public static void main(String[] args) {

        int a[]={11,13,21,0,3,4,45,5};
        int res[]=getNextGreatestElement(a);
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
}
