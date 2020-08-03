package dsa.stack.problems;

//input   100,80,60,70,60,75,85
//output: 1   1  1  2  1  4  6
//find the numbers o minium consecutive stock rate less then or equal to on that day
//example on 5th day 75-> we have 60,70,60,75 so total 4

import java.util.Stack;

public class e_StockSpanProblem {

    public static void main(String[] args) {
        int a[]={100,80,65,170,600,75,85};
        int res[]=findMinRateConsecutiveDays(a);
        for (int i=0;i<a.length;i++){
            System.out.print(i-res[i]+" ");
        }
    }

    private static int[] findMinRateConsecutiveDays(int[] a)
    {
        Stack<Stock> stack=new Stack<>();
        int ans[]=new int[a.length];
        for (int i=0;i<a.length;i++){
            while(!stack.isEmpty() && stack.peek().value<a[i]){
                stack.pop();
            }

            if (stack.isEmpty()){
                ans[i]=-1;
            }else {
                ans[i]=stack.peek().index;
            }

            stack.push(new Stock(a[i],i));
        }

        return ans;
    }
}

class Stock{
    public Integer value;
    public Integer index;
    Stock(Integer value,Integer index){
        this.value=value;
        this.index=index;
    }
}