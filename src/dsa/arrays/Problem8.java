//https://mycode.prepbytes.com/coding/arrays/OPTMAT

package dsa.arrays;

import java.util.Scanner;

public class Problem8 {


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


        int matrixB[][]=new int[rowColumn[0]][rowColumn[1]];
        for (int j=0;j<rowColumn[0];j++){
            for (int k=0;k<rowColumn[1];k++){
                matrixB[j][k]=scanner.nextInt();
            }
        }


        int matrixAddition[][]=new int[rowColumn[0]][rowColumn[1]];
        for (int j=0;j<rowColumn[0];j++){
            for (int k=0;k<rowColumn[1];k++){
                matrixAddition[j][k]=matrixA[j][k]+matrixB[j][k];
            }
        }



        int matrixmultiply[][]=new int[rowColumn[0]][rowColumn[1]];
        for (int j=0;j<rowColumn[0];j++){
            for (int k=0;k<rowColumn[1];k++){
              for (int m=0;m<rowColumn[0];m++){
                  matrixmultiply[j][k]+=matrixA[j][m]*matrixB[m][k];
              }
            }
        }


        for (int j=0;j<rowColumn[0];j++){
            for (int k=0;k<rowColumn[1];k++){
                System.out.print( matrixAddition[j][k]+" ");
            }
            System.out.println("");
        }

        for (int j=0;j<rowColumn[0];j++){
            for (int k=0;k<rowColumn[1];k++){
                System.out.print( matrixmultiply[j][k]+" ");
            }
            System.out.println("");
        }


    }
}
