//https://mycode.prepbytes.com/problems/searching/XOCCUR

package searching;

import java.util.Scanner;

public class Problem2 {


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i=0;i<testCases;i++) {
            int arraySize = scanner.nextInt();



            String a = "";

            for (int k=0;k<arraySize;k++){
                a+=scanner.next()+" ";
            }
            char an[]=a.toCharArray();
            countX(an);

        }

    }

    private static void countX(char[] a) {

        int count=0;
        for (int i=0;i<a.length;i++){
            if(a[i]=='x'){
                count++;

            }

        }
System.out.println(count);
    }

}
