package contest.leetcode.matrix;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem1380 {

    public List<Integer> luckyNumbers (int[][] matrix) {

        Set<Integer> set=new HashSet<>();
        int m=matrix.length;
        int n=matrix[0].length;

        //minimum row
        for(int i=0;i<m;i++){
            int smallest=Integer.MAX_VALUE;
            for(int j=0;j<n;j++){
                if(matrix[i][j]<smallest){
                    smallest=matrix[i][j];
                }

            }
            set.add(smallest);
        }



        //maximum coloumn
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            int largest=Integer.MIN_VALUE;
            for(int j=0;j<m;j++){
                if(matrix[j][i]>largest){
                    largest=matrix[j][i];
                }

            }
            if(!set.contains(largest)){
                set.add(largest);
            }else{
                list.add(largest);

            }

        }

        return list;

    }
}
