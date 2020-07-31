package algorithms.dp.knapsack.BoundedKnapsack;

import java.util.ArrayList;
import java.util.List;

public class MinimumSubsetSumDifference {


    public static void main(String[] args) {
        int v[]={1,7,11,5};
        int n=v.length;


        System.out.println("");

        System.out.print(minimumSubsetSumDiff(v,n));
        System.out.println("");
    }

    private static int minimumSubsetSumDiff(int[] v, int n) {

        int sum=0;
       for(int i=0;i<v.length;i++){
           sum+=v[i];
       }

      int res[]= subsetSum(v,n,sum);

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
        for (int i=0;i<(sum+1)/2;i++){
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

