package dsa.stack.problems;

import java.util.Stack;

public class g_MaxAreaOfRectangle {

    public static void main(String[] args) {
        int m[][]={{0,1,0,0},{0,1,1,1},{0,1,1,1},{0,1,1,1}};
        int maxArea=getMaxAreaOfRectangle(m);
        System.out.println("Max Areaof Reactangle is = "+maxArea);
    }

    private static int getMaxAreaOfRectangle(int[][] m) {

        int v[]=new int[m[0].length];
        int max=getMaxAreaOfHistogram(m[0]);
        for (int i=1;i<m.length;i++){
            for (int j=0;j<m[0].length;j++){
                if (m[i][j]!=0){
                    m[i][j]+=m[i-1][j];
                }
            }
            max=Math.max(max,getMaxAreaOfHistogram(m[i]));
        }
        return max;
    }


    private static int getMaxAreaOfHistogram(int[] a) {
        int nsr[]=findNextSmallestElementToRight(a);
        int nsl[]=findNextSmallestToLeft(a);
        int res[]=new int[a.length];
        int max=Integer.MIN_VALUE;
        for (int i=0;i<a.length;i++){
            res[i]=(nsr[i]-nsl[i]-1)*a[i];
            max=Math.max(max,res[i]);
        }

    //    System.out.println("Maximum Area: " +max);
        return max;

    }
    private static int[] findNextSmallestElementToRight(int[] a) {
        Stack<Stocks> stack=new Stack<>();
        int nsr[]=new int[a.length];
        for (int i=a.length-1;i>=0;i--){
            int currVal=a[i];
            while (!stack.isEmpty() && stack.peek().value>=a[i]){
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
            while (!stack.isEmpty() && stack.peek().value>=a[i]){
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
