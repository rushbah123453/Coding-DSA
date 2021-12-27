package recentInterviewQuestions;

// Time complexity -> O(n*m) | Space : O(n*m)
public class SubmatrixSumQueries {
    public static void main(String[] args) {
        int[][] mat = {{3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}};

        int[][] aux = new int[mat.length][mat[0].length];
        aux[0][0] = mat[0][0];
        createAuxiliaryMatrix(mat, aux);
        System.out.println("Sum region: " + sumRegion(2, 1, 4, 3, aux));
    }
    //Build a aux matrix in which value of cell (i, j) = sum of cell till (i, j)
    public static void createAuxiliaryMatrix(int[][] mat, int[][] aux) {
        int rowLen = mat.length;
        int colLen = mat[0].length;
        for (int i = 1; i < rowLen; i++) {
            aux[i][0] = mat[i][0] + aux[i - 1][0];
        }
        for (int j = 1; j < colLen; j++) {
            aux[0][j] = mat[0][j] + aux[0][j - 1];
        }
        for (int i = 1; i < rowLen; i++) {
            for (int j = 1; j < colLen; j++) {
                aux[i][j] = mat[i][j] + aux[i - 1][j] + aux[i][j - 1] - aux[i - 1][j - 1];
            }
        }
    }
    public static int sumRegion(int row1, int col1, int row2, int col2, int[][] aux) {
        int sum = 0;
        sum = aux[row2][col2];
        if(col1 > 0) sum -= aux[row2][col1-1];
        if(row1 > 0) sum -= aux[row1-1][col2];
        if(row1 > 0 && col1 > 0) sum += aux[row1-1][col1-1];
        return sum;
    }
}
