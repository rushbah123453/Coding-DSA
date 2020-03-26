
//https://mycode.prepbytes.com/problems/searching/MISSAP
package searching;

import java.util.Scanner;

public class Problem11 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
            int arraySize = scanner.nextInt();
            int a[] = new int[arraySize];
            for (int j = 0; j < arraySize; j++) {
                a[j] = scanner.nextInt();
            }

            missingAP(a);
        }
    }

    private static void missingAP(int[] a) {
        int length=a.length-1;
        int size=a.length;
        int diff=(a[length]-a[0])/size;
        int ap;
        for (int i=0;i<size;i++){
            ap=1+(diff*i);
            if(a[i]!=ap){
                System.out.println(ap);
                break;
            }
        }




    }
}
