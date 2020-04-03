package companyCodingQuestion.recommended.searching;

import java.util.Scanner;

class SubArrayAbsDiffAtmost1 {



    public static void main (String[] args) {
        //code
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t--!=0) {
            int outmax = 1;
            int n=sc.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++) {
                a[i] = sc.nextInt();
            }

            for(int i=0;i<n;i++) {
                int min=a[i]; int max=a[i];
                for(int j=i+1;j<n;j++) {
                    min = Math.min(min,a[j]);
                    max = Math.max(max,a[j]);
                    if((max-min)<=1) {
                        outmax = Math.max(outmax,j-i+1);
                    }
                }
            }
            System.out.println(outmax);
        }
    }
}