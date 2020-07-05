package contest.leetcode.matrix;
//https://leetcode.com/problems/transpose-matrix/
public class Problm867 {

    public int[][] transpose(int[][] A) {

        int copy[][]=new int[A[0].length][A.length];

        for(int i=0;i<A[0].length;i++){
            for(int j=0;j<A.length;j++){
                copy[i][j]=A[j][i];
            }
        }

        return copy;

    }
}
