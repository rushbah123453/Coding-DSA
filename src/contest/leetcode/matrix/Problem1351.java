package contest.leetcode.matrix;

public class Problem1351 {

    public int countNegatives(int[][] grid) {

        int count=0;
        int m=grid.length;
        int n=grid[0].length;
        boolean[] visitedColumn=new boolean[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n && !visitedColumn[j];j++){
                if( grid[i][j]<0){
                    visitedColumn[j]=true;
                    count=count+(m-i);
                }
            }
        }

        return count;
    }
}
