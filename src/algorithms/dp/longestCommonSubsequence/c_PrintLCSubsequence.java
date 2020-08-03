package algorithms.dp.longestCommonSubsequence;

public class c_PrintLCSubsequence {

        public static void main(String[] args) {
            String y="acbcdaf";
            String x="abcf";
            StringBuilder ans=findLCS(x,y,x.length(),y.length());
            System.out.println("LCS is "+ans);
        }
    private static StringBuilder findLCS(String x, String y, int m, int n) {
        int dp[][]=new int[m+1][n+1];
        for (int i=0;i<m+1;i++){
            for (int j=0;j<n+1;j++){
                if(i==0||j==0)
                    dp[i][j]=0;
            }
        }

        for (int i=1;i<m+1;i++){
            for (int j=1;j<n+1;j++){
                if(x.charAt(i-1)==y.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        StringBuilder stringBuilder=new StringBuilder();
        int i=m;int j=n;
       while (i>0 && j>0){
           if(x.charAt(i-1)==y.charAt(j-1)){
               stringBuilder.append(x.charAt(i-1));
               i--;
               j--;
           }else {
               if(dp[i-1][j]>dp[i][j-1]){
                   i--;
               }else {
                   j--;
               }
           }
       }

        return stringBuilder.reverse();

    }
}
