package algorithms.dp.knapsack;

public class knapsackTopDown {

    public static void main(String[] args) {

    }


    private int[][] knapSack(int[] w, int[] v, int W, int n){

        int dp[][]=new int[n+1][W+1];

        for (int i=0;i<=n;i++){


            for (int j=0;j<=W;j++){

                if(i==0 || j==0){
                    dp[i][j]=0;
                }else if(w[i-1]<=j) {

                    dp[i][j]=Math.max(dp[i-1][j],v[i-1]+dp[i-1][j-w[i-1]]);

                }else{
                    dp[i][j]=dp[i-1][j];
                }




            }
        }


      return dp;

    }

}
