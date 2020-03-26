
//https://mycode.prepbytes.com/problems/searching/MAXPRO
package searching;

import java.util.Scanner;

public class Problem16 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();

        for (int i=0;i<testCases;i++) {
            int size = scanner.nextInt();
            int a[]=new int[size];
            for (int j = 0; j < size; j++) {
                a[j] = scanner.nextInt();
            }

            maximumProfit(a);

        }
    }

    private static void maximumProfit(int[] a) {

        int min=0,max=0,i=0,j=0,profit=0;
        int n=a.length-1;

       while (i<=n){

           if (n==1)
               break;

           while (i<n && a[i]>a[i+1]){
               i++;
           }

           if (i==n)
               break;

           min=a[i];

           while (i<n && a[i]<a[i+1]){
               i++;
           }

           max=a[i];


           profit+=(max-min);

       }

System.out.println(profit);



    }
}
