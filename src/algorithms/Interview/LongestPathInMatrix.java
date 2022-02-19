package algorithms.Interview;
//https://www.geeksforgeeks.org/find-the-longest-path-in-a-matrix-with-given-constraints/
public class LongestPathInMatrix {

    public static void main(String[] args) {

        int matrix[][]={{1, 10, 9},
                {5, 3, 8},
                {4, 6, 7}};
       int ans= longestIncreasingPath(matrix);
        System.out.println(ans);
    }

    public static int longestIncreasingPath(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int row=matrix.length;
        int col=matrix[0].length;
        int dp[][]=new int[row][col];
        int res=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int val=dfs(i,j,matrix,dp,matrix[i][j]-1);
                res=Math.max(res,val);
            }
        }

        return res;
    }


    private static int dfs(int i,int j,int[][] matrix,int[][] dp,int prev){
        if(i<0 || i>matrix.length-1 || j<0 || j>matrix[0].length-1 || matrix[i][j]!=(prev+1) )
            return 0;
        if(dp[i][j]>0)return dp[i][j];
        else{
            int curr=matrix[i][j];
            int up=dfs(i-1,j,matrix,dp,curr);
            int down=dfs(i+1,j,matrix,dp,curr);
            int left=dfs(i,j-1,matrix,dp,curr);
            int right=dfs(i,j+1,matrix,dp,curr);
            int val= Math.max(up,Math.max(down,Math.max(left,right)));
            dp[i][j]=++val;
            return val;
        }
    }
}
