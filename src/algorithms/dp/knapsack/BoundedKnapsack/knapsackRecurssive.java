package algorithms.dp.knapsack.BoundedKnapsack;

public class knapsackRecurssive {
    public static void main(String[] args) {
        int val[]={1,4,3,4,5};
        int wt[]={10,20,30,40,50};
        int w=50;
        int n=val.length;
       int res= knapsackRecurssive(val,wt,w,n);
        System.out.println(res);

        int res2= knapDP(val,wt,w,n);
        System.out.println(res2);
    }

    private static int knapsackRecurssive(int[] val, int[] wt, int w, int n) {
        if(w==0||n==0)return 0;
        if(wt[n-1]>w)return knapsackRecurssive(val,wt,w,n-1);
        else return Math.max(val[n-1]+knapsackRecurssive(val,wt,w-wt[n-1],n-1),knapsackRecurssive(val,wt,w,n-1));
    }

    private static int knapDP(int[] val, int[] wt, int w, int n){
        int dp[][]=new int[n+1][w+1];
        for (int i=0;i<n+1;i++){
            for (int j=0;j<w+1;j++) {
                if(i==0||j==0){
                    // In java array value is initailized to 0, so not required... maybe for other language it might be required
                    dp[i][j]=0;

                }

               else if (wt[i - 1] <=j) {
                       dp[i][j]=Math.max(val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);
                } else {
                        dp[i][j]=dp[i-1][j];
                }
            }
        }

        return dp[n][w];
    }
}
