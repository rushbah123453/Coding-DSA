//https://mycode.prepbytes.com/coding/arrays/INDKEY

package arrays;

import java.util.HashMap;
import java.util.Scanner;

public class Problem15 {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
            int inputArraySize=scanner.nextInt();
            int a[] = new int[inputArraySize];
            for (int k = 0; k < inputArraySize; k++) {
                a[k] = scanner.nextInt();
            }
            int sum=scanner.nextInt();
            boolean flag=false;
            int start=0,end=inputArraySize-1;
          while(start<end){
              if((a[start]+a[end]==sum)){
                  System.out.println(start+" "+end);
                  flag=true;
                  break;
              }else if((a[start]+a[end]<sum)){
                  start++;
              }else {
end--;
              }



            }
          if(!flag)
              System.out.println("no answer");






        }
        }
}
