//https://mycode.prepbytes.com/coding/arrays/INPUTOUT

package arrays;

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++){
            int arraySize=scanner.nextInt();
            int a[]=new int[arraySize];
            for (int j=0;j<arraySize;j++){
                a[j]=scanner.nextInt();
            }
            for (int k=0;k<arraySize;k++){
                System.out.print(a[k]+" ");
            }
            System.out.println("");
        }
    }
}
