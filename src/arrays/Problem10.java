
//https://mycode.prepbytes.com/coding/arrays/LSTONE1
package arrays;

import java.util.Scanner;

public class Problem10 {


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
            int arraySize = scanner.nextInt();
            int a[] = new int[arraySize];
            int lastIndex = -1;
            for (int j = 0; j < arraySize; j++) {
                a[j] = scanner.nextInt();
                if (a[j] == 1) {
                    lastIndex = j;
                }
            }

            System.out.println(lastIndex);
        }


    }
}
