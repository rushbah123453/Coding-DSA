package algorithms.dp.longestCommonSubsequence;

public class b1_LongestCommonSubstringRecursive {

    static int max=Integer.MIN_VALUE;
    public static void main(String[] args) {
        String y="bhabcdaf";
        String x="acbcdf";
        int ans=findLCS(x,y,x.length(),y.length());
        System.out.println("LCS is "+max);
    }

    private static int findLCS(String x, String y, int m, int n) {


        if(m==0||n==0)return 0;

        if(x.charAt(m-1)==y.charAt(n-1)){
            int ans=1+findLCS(x,y,m-1,n-1);
            max=Math.max(max,ans);
            return ans;
        }else {
            findLCS(x,y,m-1,n);
            findLCS(x,y,m,n-1);
        }
        return 0;
    }
}
