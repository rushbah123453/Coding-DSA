package algorithms.dp.longestCommonSubsequence;

public class g_MinDeletionTomakePalindromicString {

    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("acbgcdf");
        String x=s.toString();
        String y=s.reverse().toString();
        int m=s.length();
        int n=y.length();
        System.out.println("x== "+x+" y== "+y);
        int lcs=findLCS(x.toString(),y,m,n);
        System.out.println("min deletion required to make palindromic string is "+ (m-lcs));

    }

    private static int findLCS(String x, String y, int m, int n) {
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<m+1;i++)
        {
            for (int j=0;j<n+1;j++){
                if(i==0||j==0)
                    dp[i][j]=0;
            }
        }

        for (int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if (x.charAt(i-1)==y.charAt(j-1))
                {
                    dp[i][j]=1+dp[i-1][j-1];
                }else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        return dp[m][n];
    }
}
