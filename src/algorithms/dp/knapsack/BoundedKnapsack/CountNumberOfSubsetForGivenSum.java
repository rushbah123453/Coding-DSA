package algorithms.dp.knapsack.BoundedKnapsack;

public class CountNumberOfSubsetForGivenSum {
private static int count;
    public static void main(String[] args) {
        count=0;
        int v[]={2,5,8,3,11};
        int n=v.length;
        int sum=11;

        System.out.println("Recurssive Approach ");
       int res= recurssive(v,n,sum);
        System.out.println(res);

        System.out.println("DP Approach");
        System.out.print("number of subset ");
        System.out.print(countNumberOfSubset(v,n,sum));
        System.out.println("");
    }



    private static int recurssive(int[] v,int n,int sum)
    {

        if (sum==0) {
           // System.out.println("sum = "+sum);
           return 1;
          // return;
        }
        if(n<=0)return 0;
        if (v[n-1]>sum)
           return recurssive(v,n-1,sum);
        else{
            System.out.println("n-1= "+(n-1)+" sum= "+sum);
        return     recurssive(v,n-1,sum)+recurssive(v,n-1,sum-v[n-1]);
        }
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
