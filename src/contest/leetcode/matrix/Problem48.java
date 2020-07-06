package contest.leetcode.matrix;
//https://leetcode.com/problems/rotate-image/
public class Problem48 {

    public void rotate(int[][] matrix) {

        int m=matrix.length;
        int n=matrix[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i<j){
                    int temp= matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }

        //reverse row

        for(int i=0;i<m;i++){
            reverse(matrix[i],n);
        }



    }

    static void reverse(int a[], int n)
    {
        int i, k, t;
        for (i = 0; i < n / 2; i++) {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }

    }
}
