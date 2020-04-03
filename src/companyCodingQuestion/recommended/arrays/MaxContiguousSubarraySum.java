package companyCodingQuestion.recommended.arrays;

import java.util.Scanner;

public class MaxContiguousSubarraySum {


    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
            int inputArraySize = scanner.nextInt();
            int a[] = new int[inputArraySize];
            for (int k = 0; k < inputArraySize; k++) {
                a[k] = scanner.nextInt();
            }
            findMaxSum(a);

        }
    }

    private static void findMaxSum(int[] a) {
        int n=a.length;
        int max=a[0];

        for (int i=1;i<n;i++){

           a[i]=Math.max(a[i],a[i-1]+a[i]);

        }

        for (int i=1;i<n;i++){

           if(max<a[i]){
               max=a[i];
           }

        }

        System.out.println(max);


    }
}
