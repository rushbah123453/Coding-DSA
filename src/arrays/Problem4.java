//https://mycode.prepbytes.com/coding/arrays/PRNTEO

package arrays;

import java.util.Scanner;

public class Problem4 {


    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        int arrayLength=scanner.nextInt();
        int a[] = new int[arrayLength];
        for (int i=0;i<arrayLength;i++) {
           a[i]=scanner.nextInt();

        }

        for (int i=0;i<arrayLength;i++) {
          if (a[i]%2==0){
              System.out.print(a[i]+" ");
          }

        }

System.out.println("");
        for (int i=0;i<arrayLength;i++) {
            if (a[i]%2!=0){
                System.out.print(a[i]+" ");
            }

        }

    }
}
