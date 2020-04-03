//https://mycode.prepbytes.com/coding/arrays/PRNTMUL

package dsa.arrays;

import java.util.Scanner;

public class Problem3 {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
            int arraySize = scanner.nextInt();
            int a[] = new int[arraySize],sum=1;
            for (int j=0;j<arraySize;j++){
                sum*=scanner.nextInt();
            }

            System.out.println(sum);

        }
    }
}
