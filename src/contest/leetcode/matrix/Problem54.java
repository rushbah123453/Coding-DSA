package contest.leetcode.matrix;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/spiral-matrix/
public class Problem54 {
    public List<Integer> spiralOrder(int[][] matrix) {


        List<Integer> list=new ArrayList<>();

        if (matrix.length == 0) {
            return list;
        }

        int rowBegin=0,rowEnd=matrix.length-1;
        int colBegin=0,colEnd=matrix[0].length-1;


        while(rowBegin<=rowEnd && colBegin<=colEnd){
            //1st row
            for(int i=colBegin;i<=colEnd;i++){
                list.add(matrix[rowBegin][i]);
            }
            rowBegin++;

            //last column
            for(int i=rowBegin;i<=rowEnd;i++){
                list.add(matrix[i][colEnd]);
            }
            colEnd--;

            //last row
            if(rowBegin<=rowEnd){
                for(int i=colEnd;i>=colBegin;i--){
                    list.add(matrix[rowEnd][i]);

                }
                rowEnd--;
            }

            //First column
            if(colBegin<=colEnd){
                for(int i=rowEnd;i>=rowBegin;i--){
                    list.add(matrix[i][colBegin]);
                }
                colBegin++;
            }


        }

        return list;

    }
}
