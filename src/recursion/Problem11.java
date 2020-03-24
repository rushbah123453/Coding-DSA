
//https://mycode.prepbytes.com/problems/recursion/SUBSUM
package recursion;

import java.util.Scanner;

public class Problem11 {


    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
            int arraySize = scanner.nextInt();
            int a[] = new int[arraySize];
            for (int j = 0; j < arraySize; j++) {
                a[j]= scanner.nextInt();
            }
         System.out.println(   sumOfAllSubsets(a,0,arraySize-1,0));
        }
    }

    private static int sumOfAllSubsets(int[] a, int l, int r, int sum) {

        if(l>r){
           System.out.println(sum+" ");

            return sum;
        }


     // System.out.println(  "first: "+sumOfAllSubsets(a,l+1,r,sum+a[l]));

      //  System.out.println(   "second: "+   sumOfAllSubsets(a,l+1,r,sum));

        return sumOfAllSubsets(a,l+1,r,sum+a[l])+sumOfAllSubsets(a,l+1,r,sum);

    }


}
