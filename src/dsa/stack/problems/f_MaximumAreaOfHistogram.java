package dsa.stack.problems;

import java.util.Stack;

public class f_MaximumAreaOfHistogram {
    public static void main(String[] args) {
        int a[]={6,2,5,4,5,1,6};
        int res[]=getMaxAreaOfHistogram(a);
        for (int x:res){
            System.out.print(x+" ");
        }

    }

    private static int[] getMaxAreaOfHistogram(int[] a) {
        int nsr[]=findNextSmallestElementToRight(a);
        int nsl[]=findNextSmallestToLeft(a);
        int res[]=new int[a.length];
        int max=Integer.MIN_VALUE;
        for (int i=0;i<a.length;i++){
            res[i]=(nsr[i]-nsl[i]-1)*a[i];
            max=Math.max(max,res[i]);
        }

        System.out.println("Maximum Area: " +max);
        return res;

    }

    private static int[] findNextSmallestElementToRight(int[] a) {
        Stack<Stocks> stack=new Stack<>();
        int nsr[]=new int[a.length];
        for (int i=a.length-1;i>=0;i--){
            int currVal=a[i];
            while (!stack.isEmpty() && stack.peek().value>a[i]){
                stack.pop();
            }

            if (stack.isEmpty()){
                nsr[i]=a.length;
            }else {
                nsr[i]=stack.peek().index;
            }
            stack.push(new Stocks(currVal,i));

        }

        return nsr;
    }
    private static int[] findNextSmallestToLeft(int[] a) {
        Stack<Stocks> stack=new Stack<>();
        int nsl[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            int currVal=a[i];
            while (!stack.isEmpty() && stack.peek().value>a[i]){
                stack.pop();
            }

            if (stack.isEmpty()){
                nsl[i]=-1;
            }else {
                nsl[i]=stack.peek().index;
            }
            stack.push(new Stocks(currVal,i));
        }

        return nsl;
    }
}
class Stocks{
    public Integer value;
    public Integer index;
    Stocks(Integer value,Integer index){
        this.value=value;
        this.index=index;
    }
}