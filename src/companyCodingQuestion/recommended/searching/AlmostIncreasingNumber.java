package companyCodingQuestion.recommended.searching;

import java.util.Scanner;

public class AlmostIncreasingNumber {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t--!=0) {
            int outmax = 1;
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

           boolean value= isAlmostIncreasing(a,n);

            System.out.println(value);

        }
        }

    private static boolean isAlmostIncreasing(int[] a, int n) {
        int count=0;
        for (int i=1;i<n;i++){
            if(a[i]<=a[i-1]){
                count++;
                if(i>=2){
                    if (a[i]<=a[i-2])    //a[i]<=a[i-2] && a[i+1]<=a[i-1]  this is the condition
                    {
                        return false;
                    }
                }

            }


        } if (count>1)
            return false;
        else return true;


    }


}
