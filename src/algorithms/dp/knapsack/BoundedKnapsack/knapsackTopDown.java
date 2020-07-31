package algorithms.dp.knapsack.BoundedKnapsack;

public class knapsackTopDown {

    public static void main(String[] args) {

        int w[]={3,0,3,3,9};
        int v[]={90,900,90,90,909090};
        int n=v.length;
        int W=6;
        System.out.println(knapsackTopDown(w,v,W,n));


    }




    public static int  knapsackTopDown(int[] w, int[] v, int W, int n){

        int dp[][]=new int[n+1][W+1];


        for(int i=0;i<n+1;i++){

            for(int j=0;j<W+1;j++){

             if(i==0 || j==0){
                 dp[i][j]=0;
             }
             else if(w[i-1]<=j){
                 dp[i][j]=Math.max(dp[i-1][j],v[i-1]+dp[i-1][j-w[i-1]]);
             }else {
                 dp[i][j]=dp[i-1][j];
             }


            }
        }



      return dp[n][W];

    }

}
