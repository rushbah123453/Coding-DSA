package algorithms.dp.knapsack.BoundedKnapsack;

public class SubsetSum {


    public static void main(String[] args) {
        int v[]={3,3,7,9,10};
        int n=v.length;
        int sum=11;

        System.out.println("");
        System.out.print("Does the Sum "+sum+" occurs in any subset in array :");
        System.out.print(subsetSum(v,n,sum));
        System.out.println("");
    }

    private static boolean subsetSum(int[] v, int n, int sum) {

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


        return dp[n][sum];

    }


}
