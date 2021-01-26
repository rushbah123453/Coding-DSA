package algorithms.dp.Interview;

//https://www.geeksforgeeks.org/find-the-longest-path-in-a-matrix-with-given-constraints/
//Note: selected values should be in increasing order eg. 6-7-8-9. We return 4.
//***Not yet correct
public class LongestPathInMatrix {

    //will be used for checking up, down, left, right value
    private static final int[][] DIRECTIONS = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 9},
                {5, 3, 8},
                {4, 6, 7}};
        int ans = longestIncreasingPath(matrix);
        System.out.println(ans);
    }

    public static int longestIncreasingPath(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] dp = new int[row][col];
        int res = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                // for each value get the max length
                int val = dfs(i, j, matrix, dp);

                // find the max length across all values
                res = Math.max(res, val);
            }
        }
        return res;
    }

    private static int dfs(int i, int j, int[][] matrix, int[][] dp) {
        if (dp[i][j] > 0) return dp[i][j];
        int max = 0;

        // checking all four directions (up, down, left, right)
        for (int[] direction : DIRECTIONS) {
            int x = direction[0] + i, y = direction[1] + j;
            if (x > -1 && y > -1 && x < matrix.length && y < matrix[0].length
                    && matrix[x][y] > matrix[i][j]) {
                int longest = dfs(x, y, matrix, dp);

                // getting the max value across all directions
                max = Math.max(max, longest);
            }
        }

        // adding one for counting the element itself
        dp[i][j] = max + 1;
        return dp[i][j];
    }
}
