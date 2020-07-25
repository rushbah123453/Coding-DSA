package algorithms.dp.knapsack;

public class CountNumberOfSubsetForGivenSum {

    public static void main(String[] args) {
        int v[]={1,3,7,8,10};
        int n=v.length;
        int sum=11;

        System.out.println("");
        System.out.print("number of subset ");
        System.out.print(countNumberOfSubset(v,n,sum));
        System.out.println("");
    }

    private static int countNumberOfSubset(int[] v, int n, int sum) {
        int dp[][]=new int[n+1][sum+1];

        for (int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(i==0)
                    dp[i][j]=0;
                if(j==0)
                    dp[i][j]=1;
            }
        }


        for (int i=1;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if (j>=v[i-1]){
                    dp[i][j]=dp[i-1][j] + dp[i-1][j-v[i-1]];
                }else {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }

        return dp[n][sum];

    }
}
