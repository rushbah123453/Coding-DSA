package contest.leetcode.matrix;
//https://leetcode.com/problems/spiral-matrix-ii/
public class Problem59 {

    public int[][] generateMatrix(int n) {

        int rowBegin=0,rowEnd=n-1;
        int colBegin=0,columnEnd=n-1;
        int count=1;
        int res[][]=new int[n][n];


        while(rowBegin<=rowEnd && colBegin<=columnEnd){


            //1st row
            for(int i=colBegin;i<=columnEnd;i++){
                res[rowBegin][i] =count++;
            }
            rowBegin++;

            //last column
            for(int i=rowBegin;i<=rowEnd;i++){
                res[i][columnEnd] =count++;
            }
            columnEnd--;

            //last row
            for(int i=columnEnd;i>=colBegin;i--){
                res[rowEnd][i] =count++;
            }
            rowEnd--;


            //1st column
            for(int i=rowEnd;i>=rowBegin;i--){
                res[i][colBegin] =count++;
            }
            colBegin++;

        }

        return res;

    }
}
