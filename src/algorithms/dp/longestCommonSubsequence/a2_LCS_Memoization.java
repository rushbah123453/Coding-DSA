package algorithms.dp.longestCommonSubsequence;

public class a2_LCS_Memoization {
static int t[][];
    public static void main(String[] args) {

        String x="abcdgh";
        String y="abedfhr";
        int m=x.length();
        int n=y.length();
        t=new int[1001][1001];
        for (int i=0;i<t.length;i++){
            for (int j=0;j<t[0].length;j++){
                t[i][j]=-1;
            }
        }
        System.out.println(lcs(x,y,m,n));
    }

    private static int lcs(String x, String y, int m, int n) {
        if(m==0||n==0) return 0;
        if(t[m][n]!=-1) return t[m][n];
        if(x.charAt(m-1)==y.charAt(n-1))
            return t[m][n]=1+lcs(x,y,m-1,n-1);
        else
            return t[m][n]=Math.max(lcs(x,y,m-1,n),lcs(x,y,m,n-1));
    }
}
