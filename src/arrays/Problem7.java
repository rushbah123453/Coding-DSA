//https://mycode.prepbytes.com/coding/arrays/SCMULMAT

package arrays;

import java.util.Scanner;

public class Problem7 {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        int testCases[]=new int[3];
        for (int i=0;i<testCases.length;i++) {
            testCases[i] = scanner.nextInt();
        }

        int matrix[][]=new int[testCases[0]][testCases[1]];
        for (int j=0;j<testCases[0];j++){
            for (int k=0;k<testCases[1];k++){
                matrix[j][k]=testCases[2]*scanner.nextInt();
            }
        }





        for (int j=0;j<testCases[0];j++){
            for (int k=0;k<testCases[1];k++){
               System.out.print( matrix[j][k]+" ");
            }
            System.out.println("");
        }
    }
}
