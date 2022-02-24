package algorithms.fundamentalAlgosImplementation.BackTracking;

//TODO: Need to complete this
// In this problem (4x4 chess), place all four queens such that they are not attacking each other
public class QueensProblem {
    //to check if position is safe to place the queen
    public static boolean isSafe(int[][] chess, int row, int col) {

        int i, j;
        // check if value is already present on same row. If yes return false
        for(i = 0; i < col; i++) {
            if(chess[row][i] == 1) return false;
        }
        // check if value is present on upper diagonal cell
//        if(i = row, j = col; i >= 0 && j >= 0; i--, j--) {
//            if(chess[row--][col--] == 1) return true;
//
//        }
        //TODO
        return true;
    }
    public static boolean soln(int[][] chess, int row, int col) {
        //chess.length will be equal to N
        if(col >= chess.length) return true;
        for(int i = 0; i < chess.length; i++) {
            if(chess[row][i] == 1) return false;
        }
        //TODO
        return true;
    }
    public static void main(String[] args) {
        int[][] chess = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};

    }
}
