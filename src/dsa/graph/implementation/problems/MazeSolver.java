package dsa.graph.implementation.problems;

public class MazeSolver {

    private int startRow;
    private int startCol;
    private int maze[][];
    private boolean isVisited[][];

    public MazeSolver(int[][] maze,int startRow,int startCol){
        this.maze=maze;
        this.startCol=startCol;
        this.startRow=startRow;
        this.isVisited=new boolean[maze.length][maze.length];
    }

    public void solver(){
        if(dfs(startRow,startCol))
            System.out.println("Solution possible");
        else
            System.out.println("Solution not possible");
    }

    private boolean dfs(int x, int y) {


         if (feasible(x,y))
        {
            if (x==maze.length-1 && y==maze.length-1)
                return true;

            isVisited[x][y]=true;

            if (dfs(x+1,y))
                return true;
            if (dfs(x,y+1))
                return true;
            if (dfs(x-1,y))
                return true;
            if(dfs(x,y-1))
                return true;

            isVisited[x][y]=false;
            return false;


        }

return false;

    }

    private boolean feasible(int x, int y) {
        if(x<0 || x>maze.length-1)
            return false;
        if(y<0 || y>maze.length-1)
            return false;
        if (maze[x][y]==1)
            return false;

        if (isVisited[x][y])
            return false;

        return true;
    }
}
