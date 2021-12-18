package algorithms.dp.knapsack.BoundedKnapsack;

public class knapsackRecurssive {

     static int t[][];
    public static void main(String[] args) {
        int val[]={1,4,3,4,5};
        int wt[]={10,20,30,40,50};
        int w=50;
        int n=val.length;
       int res= knapsackRecurssive(val,wt,w,n);
        System.out.println(res);

        int res2= knapDP(val,wt,w,n);
        System.out.println(res2);

        t=new int[n+1][w+1];
        for (int i=0;i<t.length;i++){
            for(int j=0;j<t[0].length;j++)
            {
                t[i][j]=-1;
            }
        }
        int res3=knapsackMemoization(val,wt,w,n);
        System.out.println(res3);
    }

    private static int knapsackRecurssive(int[] val, int[] wt, int w, int n) {
        if(w==0||n==0)return 0;
        if(wt[n-1]>w)return knapsackRecurssive(val,wt,w,n-1);
        else return Math.max(val[n-1]+knapsackRecurssive(val,wt,w-wt[n-1],n-1),knapsackRecurssive(val,wt,w,n-1));
    }


    private static int knapsackMemoization(int[] val, int[] wt, int w, int n) {
        if(w==0||n==0)return 0;
       if(t[n][w]!=-1)return t[n][w];
        if(wt[n-1]>w)
        {
            t[n][w]=knapsackMemoization(val,wt,w,n-1);
            return t[n][w];
        }
        else {
            t[n][w]= Math.max(val[n-1]+knapsackMemoization(val,wt,w-wt[n-1],n-1),knapsackMemoization(val,wt,w,n-1));
            return t[n][w];
        }
    }




    private static int knapDP(int[] val, int[] wt, int w, int n){
        int dp[][]=new int[n+1][w+1];
        for (int i=0;i<n+1;i++){
            for (int j=0;j<w+1;j++) {
                if(i==0||j==0){
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
