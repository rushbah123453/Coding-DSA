//https://mycode.prepbytes.com/coding/arrays/MISNGNU

package arrays;

import java.util.Scanner;

public class Problem12 {


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
            int arraySize = scanner.nextInt();
            long a[] = new long[arraySize];
            long sum=0,expectedSum=0;
            for (int j = 0; j < arraySize-1; j++) {
                a[j] = scanner.nextLong();
                sum+=a[j];

            }

           expectedSum=((long)arraySize*(arraySize+1)/2);

            System.out.println(expectedSum-sum);


        }

    }
}
