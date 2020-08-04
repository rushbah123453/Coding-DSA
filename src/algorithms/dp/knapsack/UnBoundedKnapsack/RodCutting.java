package algorithms.dp.knapsack.UnBoundedKnapsack;

public class RodCutting {
    public static void main(String[] args) {
        int rod[]={1,2,3,4,5,6,7,8};
        int value[]={1,5,8,9,10,17,8,20};
        int length=8;
        int maxPrice=findMaxPriceRodCutting(rod,value,length);
        System.out.println(maxPrice);
    }

    private static int findMaxPriceRodCutting(int[] rod, int[] value,int length) {
        int dp[][]=new int[rod.length+1][length+1];
        for (int i=0;i<rod.length+1;i++){
            for (int j=0;j<value.length+1;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                } else if(rod[i-1]<=j){
                    dp[i][j]=Math.max(value[i-1]+dp[i][j-rod[i-1]],dp[i-1][j]);
                }else {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }

        return dp[rod.length][value.length];
    }
}
