package companyCodingQuestion.recommended.arrays;

import java.util.Scanner;

public class SecondHighestNumber {



    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
            int inputArraySize = scanner.nextInt();
            int a[] = new int[inputArraySize];
            for (int k = 0; k < inputArraySize; k++) {
                a[k] = scanner.nextInt();
            }
         findSecondHighest(a);

        }
    }

    private static void findSecondHighest(int[] a) {
        int n=a.length;

        int first=a[0];
        int second=a[0];

        for (int i=1;i<n;i++){

            if (a[i]>first){
                second=first;
                first=a[i];
            }

           else if(a[i]!=first && a[i]>second){
                second=a[i];
            }
        }


        System.out.println(second);

    }
}
