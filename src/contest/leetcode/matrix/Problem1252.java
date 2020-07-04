package contest.leetcode.matrix;
//https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
public class Problem1252 {

    public int oddCells(int n, int m, int[][] indices) {

        boolean[] oddRow=new boolean[n];
        boolean[] oddColumn=new boolean[m];
        int count=0;
        for(int[] index:indices){
            oddRow[index[0]]^=true;
            oddColumn[index[1]]^=true;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                count+=oddRow[i]^oddColumn[j]?1:0;
            }
        }

        return count;

    }
}
