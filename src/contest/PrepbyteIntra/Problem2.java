//https://mycode.prepbytes.com/contest/PREPINTRA/problems/PREPBUDDY
package contest.PrepbyteIntra;

import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int k=0;k<testCases;k++) {
            int a[] = new int[2];
            for (int i = 0; i < 2; i++) {
                a[i] = scanner.nextInt();
            }

            int[] inputArray = new int[a[0]];
            for (int j = 0; j < a[0]; j++) {
                inputArray[j] = scanner.nextInt();
            }

            printBookRead(inputArray,a[1]);
        }
    }

    private static void printBookRead(int[] inputArray,int k) {

        int n=inputArray.length;
        int sum=0;
        for (int i=0;i<n;i++){
            sum+=inputArray[i];
        }

        if(sum%k==0)
            System.out.println(sum/k);
        else
            System.out.println((sum/k)+1);

    }
}
