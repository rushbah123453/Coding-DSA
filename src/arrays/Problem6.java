
//https://mycode.prepbytes.com/coding/arrays/MINMAX1
package arrays;

import java.util.Scanner;

public class Problem6 {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
            int arraySize = scanner.nextInt();
            int a[] = new int[arraySize];
            for (int j = 0; j < arraySize; j++) {
                a[j] = scanner.nextInt();

            }
int minMax[]=getMinmax(a);
            System.out.println(minMax[0]+" "+minMax[1]);
        }
    }

    private static int[] getMinmax(int[] a) {

        int minMax[]=new int[2];
        int max=a[0];
        minMax[0]=a[0];
        for (int i=1;i<a.length;i++){
            minMax[0]=Math.min(minMax[0],a[i]);
        }

        for (int i=1;i<a.length;i++){
            max=Math.max(max,a[i]);
        }

        minMax[1]=max;
        return minMax;
    }
}
