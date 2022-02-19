package algorithms.dp.knapsack.BoundedKnapsack;

import java.util.ArrayList;
import java.util.List;

public class MinimumSubsetSumDifference {

    static int min;

    public static void main(String[] args) {
        min=Integer.MAX_VALUE;
        int v[]={1,7,11,5};
        int n=v.length;
      //  System.out.println(getSum(v));
        System.out.println("Recurssive Approach");
        minRecursive(v,n,getSum(v),0);
        System.out.println(min);
        System.out.println("DP Approach");

        System.out.print(minimumSubsetSumDiff(v,n));
        System.out.println("");
    }

    private static int getSum(int[] v) {
        int res=0;
        for(int x:v){
            res+=x;
        }
        return res;
    }

    // incorrect
    private static void minRecursive(int v[],int n,int sum,int s1){
        if(s1<=(sum/2)) {
            min = Math.min(min, Math.abs(sum - (2 * s1)));
        }else {
            System.out.println("s1= "+s1);
        }
        if (n<=0)return;
       // System.out.println(min);
       minRecursive(v,n-1,sum,s1);
       minRecursive(v,n-1,sum,s1+v[n-1]);
    }

    private static int minimumSubsetSumDiff(int[] v, int n) {

        int sum=0;
       for(int i=0;i<v.length;i++){
           sum+=v[i];
       }

      int res[]= subsetSum(v,n,sum);
        System.out.println("Subset: ");
       for (int x:res)
       {
           System.out.print(" "+x+" ");
       }

        System.out.println("");
       int min=Integer.MAX_VALUE;
       for (int i=0;i<res.length;i++){
           min=Math.min(min,sum-2*res[i]);
       }

        return min;
    }


    private static int[] subsetSum(int[] v, int n, int sum) {

        boolean dp[][]=new boolean[n+1][sum+1];

        for (int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(i==0)
                    dp[i][j]=false;
                if(j==0)
                    dp[i][j]=true;
            }
        }


        for (int i=1;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if (j>=v[i-1]){
                    dp[i][j]=dp[i-1][j] || dp[i-1][j-v[i-1]];
                }else {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }

        List<Integer> list=new ArrayList<>();
        for (int i=0;i<=(sum)/2;i++){
            if(dp[n][i]){
                list.add(i);
            }
        }

        int arr[]=new int[list.size()];
        for (int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }

        return arr;

    }
}

