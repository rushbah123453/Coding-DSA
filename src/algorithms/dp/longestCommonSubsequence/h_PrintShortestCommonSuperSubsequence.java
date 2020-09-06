package algorithms.dp.longestCommonSubsequence;

public class h_PrintShortestCommonSuperSubsequence {

    public static void main(String[] args) {
        String x="acbgcdf";
        String y="abcdaf";
        int m=x.length();
        int n=y.length();
        String css=findLCS(x,y,m,n);
        System.out.println(css);
    }

    private static String findLCS(String x, String y, int m, int n) {
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==0||j==0)
                    dp[i][j]=0;
            }
        }

        for (int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(x.charAt(i-1)==y.charAt(j-1))
                {
                    dp[i][j]=1+dp[i-1][j-1];
                }else {
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }

        StringBuilder stringBuilder=new StringBuilder();
        int i=m,j=n;
        while (i>0 && j>0){
            if(x.charAt(i-1)==y.charAt(j-1)){
                stringBuilder.append(x.charAt(i-1));
                i--;j--;
            }else {
                if(dp[i][j-1]>dp[i-1][j]){
                    stringBuilder.append(y.charAt(j-1));
                    j--;
                }else {
                    stringBuilder.append(x.charAt(i-1));
                    i--;
                }
            }
        }
        while(i>0){
            stringBuilder.append(i--);
        }
        while (j>0){
            stringBuilder.append(j--);
        }

return stringBuilder.reverse().toString();

    }
}
