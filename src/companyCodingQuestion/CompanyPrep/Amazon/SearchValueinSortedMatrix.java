package companyCodingQuestion.CompanyPrep.Amazon;

public class SearchValueinSortedMatrix {
    public static void main(String[] args) {
       int mat[][] = { {1, 5, 9},
            {14, 20, 21},
            {30, 34, 43} };
       int x=34;
       findValue(mat,x);
    }

    private static void findValue(int[][] mat, int x) {

        int i=0,j=mat[0].length-1;

        while (i<mat.length && j>=0){

            if (mat[i][j]==x){
                System.out.println("("+i+","+j+")");
                return;
            }
            if (mat[i][j]<x){
                i++;
            }else {
                j--;
            }
        }

        System.out.println("not found");
    }
}
