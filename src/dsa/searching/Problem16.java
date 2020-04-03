
//https://mycode.prepbytes.com/problems/searching/MAXPRO
package dsa.searching;

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


           while (i<=n && j<=n && n>1){
              if (i<n && a[i]>a[i+1]){
                  i++;
           continue;
              }else if(i==n){
                  break;
              } else{
                  min=a[i];
                  j=i+1;
                  while (j<=n){


                      if (j!=n && j<n && a[j]< a[j+1]){
                          j++;
                          continue;
                      }
                      else {
                          max=a[j];
                          profit+=(max-min);
                          i=j+1;
                          break;
                      }
              }








              }
           }




         //  profit+=(max-min);



System.out.println(profit);



    }
}
