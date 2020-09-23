package algorithms.dp.Interview;

public class LongestIncreasingSubsequenceLength {

    public static void main(String[] args) {
        int a[]={1,0,3,-1,5,2,10};
        int ans=lis(a);
        System.out.println(ans);
    }

    private static int lis(int[] a) {
        int n=a.length;
        int dp[]=new int[n];
        for (int i=0;i<n;i++){
            dp[i]=1;
        }

        int max=0;
        for (int i=1;i<n;i++){
            for (int j=0;j<i;j++){
                if(a[i]>a[j]){
                    dp[i]=Math.max(dp[j]+1,dp[i]);
                    max=Math.max(max,dp[i]);
                }
            }
        }

        return max;
    }
}
