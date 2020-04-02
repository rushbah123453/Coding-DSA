package recommended.searching;

import java.util.Scanner;

public class SubArrayAbsDiffAtmost1Approach2 {


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


            int perfect=1,maxDiff=1;

            for (int j=0;j<n;j++){
                int count=1;
                int min=a[j],max=a[j];
                for (int i=j+1;i<n;i++){

                    min=Math.min(min,a[i]);
                    max=Math.max(max,a[i]);
                    maxDiff=Math.abs(max-min);

                   if (maxDiff<=1){
                       count++;
                       perfect=Math.max(perfect,count);
                   }


                }



            }


            System.out.println(perfect);

        }
    }



}
