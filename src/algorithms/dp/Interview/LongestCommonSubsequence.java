package algorithms.dp.Interview;

public class LongestCommonSubsequence {

    public static void main(String[] args) {
        String s1="abcdgh";
        String s2="aedfghr";
        int m=s1.length();
        int n=s2.length();
       // int res=findLcs(s1,s2,m,n);
        int res=dp(s1,s2,m,n);
        System.out.println(res);

    }

    private static int dp(String s1, String s2, int m, int n) {
        int dp[][]=new int[m+1][n+1];
        for (int i=1;i<m+1;i++){
            for (int j=1;j<n+1;j++){
                if (s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else {
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[m][n];
    }

    private static int findLcs(String s1, String s2, int m, int n) {
        if(m==0||n==0)return 0;
        if (s1.charAt(m-1)==s2.charAt(n-1)){
            return 1+findLcs(s1,s2,m-1,n-1);
        }else {
            return Math.max(findLcs(s1,s2,m-1,n),findLcs(s1,s2,m,n-1));
        }
    }



}
