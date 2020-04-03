//https://mycode.prepbytes.com/coding/arrays/LUTRIMAT

package dsa.arrays;

import java.util.Scanner;

public class Problem9 {

    public static void main(String[] args) {



        Scanner scanner=new Scanner(System.in);
        int rowColumn[]=new int[2];

        for (int i=0;i<rowColumn.length;i++) {
            rowColumn[i] = scanner.nextInt();
        }

        int matrixA[][]=new int[rowColumn[0]][rowColumn[1]];
        for (int j=0;j<rowColumn[0];j++){
            for (int k=0;k<rowColumn[1];k++){
                matrixA[j][k]=scanner.nextInt();
            }
        }



        for (int j=0;j<rowColumn[0];j++){
            for (int k=0;k<rowColumn[1];k++){
            if (k>j){
                System.out.print(0+" ");
            }else{
                System.out.print(matrixA[j][k]+" ");
            }
            }
            System.out.println("");
        }



        for (int j=0;j<rowColumn[0];j++){
            for (int k=0;k<rowColumn[1];k++){
                if (j>k){
                    System.out.print(0+" ");
                }else{
                    System.out.print(matrixA[j][k]+" ");
                }
            }
            System.out.println("");
        }



    }
}
