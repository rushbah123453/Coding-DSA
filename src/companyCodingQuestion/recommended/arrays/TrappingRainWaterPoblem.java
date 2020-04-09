package companyCodingQuestion.recommended.arrays;

import java.util.Scanner;

public class TrappingRainWaterPoblem {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
            int inputArraySize = scanner.nextInt();
            int a[] = new int[inputArraySize];

            for (int j = 0; j < inputArraySize; j++) {
                a[j] = scanner.nextInt();

            }

            trappingRainWater(a);

        }

    }

    private static void trappingRainWater(int[] a) {
        int length=a.length;
        int lastIndex=length-1;

        //To store max of L,R of a[]
        int L[]=new int[length];
        int R[]=new int[length];


        L[0]=a[0];

        //max of L
        for (int i=1;i<length;i++){
            L[i]=Math.max(a[i],L[i-1]);
        }

        R[lastIndex]=a[lastIndex];

        //Max of R
        for (int i=lastIndex-1;i>=0;i--){
            R[i]=Math.max(a[i],R[i+1]);
        }


        int water=0;
        for (int i=0;i<length;i++){
            water+=Math.min(L[i],R[i])-a[i];
        }

        System.out.println(water);

    }
}
