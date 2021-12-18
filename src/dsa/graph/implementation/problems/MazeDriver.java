package dsa.graph.implementation.problems;

public class MazeDriver {

    public static void main(String[] args) {
        int[][] map = {
                {1, 1, 1, 1, 1},
                {1, 2, 0, 1, 1},
                {1, 1, 0, 1, 1},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
        };

        MazeSolver mazeSolver=new MazeSolver(map,1,1);
        mazeSolver.solver();

    }
}
