package algorithms.dp.knapsack.UnBoundedKnapsack;

public class CoinChangeMinNumberOfCoins {
    public static void main(String[] args) {
        int coins[]={1,2,3,4,5};
        int sum=5;
        int minWays=findMinimumWays(coins,sum);
        System.out.println(minWays);
    }

    private static int findMinimumWays(int[] coins, int sum) {
        int dp[][]=new int[coins.length+1][sum+1];
        for (int i=0;i<coins.length+1;i++){
            for (int j=0;j<sum+1;j++){

                if(j==0)
                    dp[i][j]=0;
                if(i==0)
                    dp[i][j]=Integer.MAX_VALUE-1;
            }
        }

        for (int i=1;i<coins.length+1;i++){
            for (int j=1;j<sum+1;j++){

                if(coins[i-1] <=j){
                    dp[i][j]=Math.min(1+dp[i][j-coins[i-1]],dp[i-1][j]);
                }else {
                    dp[i][j]=dp[i-1][j];
                }

            }
        }


        return dp[coins.length][sum];

    }
}
