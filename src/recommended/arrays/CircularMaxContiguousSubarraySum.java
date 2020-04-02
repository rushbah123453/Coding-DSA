/*
* Take input array
* Find min of array and sum of array
 * Find Maximum using Kadanes Algo
 * if ((sum-min)>=max) print sum-min
 * else print max
*
*
* Reference : https://www.youtube.com/watch?v=jP-N5v93snQ
*
* */



package recommended.arrays;

import java.util.Scanner;

public class CircularMaxContiguousSubarraySum {

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
        int sum=a[0];
        int min=a[0];

        for (int i=1;i<n;i++){
            sum+=a[i];
            if(min>a[i]){
                min=a[i];
            }
            a[i]=Math.max(a[i],a[i-1]+a[i]);
        }

        for (int i=1;i<n;i++){

            if(max<a[i]){
                max=a[i];
            }

        }

        System.out.println("Max: "+max+" Min: "+min+" Sum: "+sum);


        if ((sum-min)>=max)
            System.out.println(sum-min);
        else
            System.out.println(max);

    }
}
