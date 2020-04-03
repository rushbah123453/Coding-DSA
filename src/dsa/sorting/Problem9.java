package dsa.sorting;

import java.util.Scanner;

public class Problem9 {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
            int arraySize = scanner.nextInt();
            int a[] = new int[arraySize], sum = 0;
            for (int j = 0; j < arraySize; j++) {
                a[j] = scanner.nextInt();
            }

            window(a);
        }
    }

    private static void window(int[] a) {
        int n=a.length-1;
        int s=0,e=n;


        for (s=0;s<n;s++){
            if (a[s]>a[s+1])
                break;
        }

        if (s==n){
            return;
        }


        for (e=n;e>s;e--){
            if (a[e]<a[e-1])
                break;
        }

        int min=a[s],max=a[s];

        for (int i=s;i<=e;i++){
            if (a[i]>max)
                max=a[i];
            if (a[i]<min)
                min=a[i];
        }



        for (int i=0;i<s;i++){
            if (min<a[i]){
                s=i;
                break;
            }
        }


        for (int i=n;i>=e+1;i--){
            if (max>a[i]){
                e=i;
                break;
            }
        }


        System.out.println(s+" "+e);

    }

}
